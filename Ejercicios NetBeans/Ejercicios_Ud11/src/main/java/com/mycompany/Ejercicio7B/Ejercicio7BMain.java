/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.Ejercicio7B;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Set;

/**
 *
 * @author DAW
 */
public class Ejercicio7BMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            File ficheroLibro = new File("sources\\DatosParaEjerciciosFicheros-2\\Libros\\fuenteovejuna_lopevega.txt");
            FileReader readerficheroLibro = new FileReader(ficheroLibro);
            BufferedReader bufferficheroLibro = new BufferedReader(readerficheroLibro);
            String linea = "";
            int numeroLineas = 0, numeroDePalabras = 0, numeroDecaracteres = 0;
            Hashtable<String, Integer> listaPalabras = new Hashtable<String, Integer>();
            while ((linea = bufferficheroLibro.readLine()) != null) {
                //contamos las lineas
                numeroLineas++;
                //contamos las palabras
                String[] arrayPalabras = linea.split(" ");
                numeroDePalabras += arrayPalabras.length;

                //metemos en el HashTable con el contenido de cada linea
                for (int i = 0; i < arrayPalabras.length; i++) {
                    if (listaPalabras.containsKey(arrayPalabras[i])) {
                        listaPalabras.replace(arrayPalabras[i], listaPalabras.get(arrayPalabras[i]), listaPalabras.get(arrayPalabras[i]) + 1);
                    } else {
                        listaPalabras.put(arrayPalabras[i], 1);
                    }
                }

                //eliminamos los espacios vacios y contamos los caracteres
                linea.replaceAll(" ", "");
                char[] arrayCaracteres = linea.toCharArray();
                numeroDecaracteres += arrayCaracteres.length;
            }
            //imprimimos los resultados
            System.out.println("Numero de lineas: " + numeroLineas);
            System.out.println("Numero de palabras: " + numeroDePalabras);
            System.out.println("Numero de caracteres: " + numeroDecaracteres);
            //vemos que palabras se repiten mas
            sacarDiezPalabras(listaPalabras);

            bufferficheroLibro.close();
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (Exception e) {
            e.getMessage();
        }

        //
    }

    public static void sacarDiezPalabras(Hashtable lista) {

        ArrayList listaValores = new ArrayList<Integer>();
        //creo un arraylist que contenga todos los valores con el numero de veces que aparece cada palabra.
        //Para ello saco todos los valores del HashTable, ordeno el contenido de menor a mayor y los meto
        //uno por uno en el ArrayList
        lista.values().stream().sorted(Comparator.reverseOrder()).forEach(a-> 
                listaValores.add(a)
        );
        System.out.println("Las 10 palabras mas repetidas son:");
        //recorro la el ArrayList al reves para sacarv los 10 ultimo valores que contenga. Empiezo en la penultima
        //posicion por que la ultima me cuenta los espacios vacios, y esos no tiene sentido contarlos
        for (int i = 0; i <=10; i++) {
            //creo un Set que contenga todas las claves del HashTable y ,cada vez que saco un valor del ArrayList,
            //recorro el Set clave por clave
            Set<String> keys = lista.keySet();
            for (String key : keys) {
                //si el valor del HashTable asociado a esa clave es igual al valor que he sacado del ArrayList
                // imprimo el mensaje
                if (lista.get(key) == listaValores.get(i)) {
                    System.out.println("\t->La palabra \"" + key + "\" aparece " + listaValores.get(i) + " veces.");
                }
            }
        }
    }
    
}
