/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.Ejercicio1;

import java.io.File;

/**
 *
 * @author DAW
 */
public class Ejercicio1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejercicio1Main.mostrarDatosFile("FicheroEjemplo.txt");
   
    }
    
    public static void mostrarDatosFile(String ruta){
        File fichero1=new File(ruta);
        if (!fichero1.exists()) {
            try{
                fichero1.createNewFile(); //asi creamos el fichero en caso de que no existiera
            }catch(Exception e){
                e.getMessage();
            }           
        }
        System.out.println("El fichero existe: "+fichero1.exists());
        if (fichero1.isDirectory()) {
            System.out.println(fichero1.getName()+" es un directorio.");
        }
        if (fichero1.isFile()) {
            System.out.println(fichero1.getName()+" es un fichero.");
            System.out.println("El tamaño de "+ fichero1.getName()+ " es "+fichero1.length());
            System.out.println("Los permisos del fichero son: "+ "\n\tLectura: "+fichero1.canRead()+"\n\tEscritura: "
                    +fichero1.canWrite()+"\n\tEjecucion: "+fichero1.canExecute());
        }
        
    }
    
}
