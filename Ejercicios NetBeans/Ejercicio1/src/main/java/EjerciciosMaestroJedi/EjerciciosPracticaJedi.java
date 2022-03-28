/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosMaestroJedi;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.time.*;
import java.time.temporal.TemporalAmount;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class EjerciciosPracticaJedi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Escribe una funcion que cree un array de tamaño 100 con los primeros 100 números naturales.
Luego muestra la suma total y la media. Implementa una función que calcule la suma de un
array y otra que calcule la media de un array.
        */
        //array=EjerciciosPracticaJedi.rellenarArrayNumerosNaturales();
        //EjerciciosPracticaJedi.calcularSumaYMedia(array);
        
       /*
        Escribe un programa que imprima las tablas de multiplicar del 1 al 10. Implementa una función
que reciba un número entero como parámetro e imprima su tabla de multiplicar
        */
       
       /*
        do {
            tablaMultiplicar(i);
            i++;
            System.out.println("\n**********************");
        } while (i<=10);  
        */
       
        /*
        Construir la expresión en Java que evalúa la siguiente expresión matemática
        y=(3-1)/x + 1/(x^2+5)
        */
        //EjerciciosPracticaJedi.calcularExpresion(2.0);
        
        /*
        Programa que, dado un número total de segundos, devuelve el número de horas, minutos y
        segundos equivalentes. Por ejemplo, dado un total de 3800 segundos debe mostrar 1 hora, 3
        minutos y 20 segundos.
        */
        //EjerciciosPracticaJedi.calcularTiempo(6000);
        
        /*
        Construir un programa que simule el juego de la adivinanza de un número. El ordenador debe
        generar un número aleatorio entre 1 y 100 y el usuario tiene cinco oportunidades para acertarlo.
        Después de cada intento el programa debe indicarle al usuario si el número introducido por él es
        mayor, menor o igual al número a adivinar.
        */
        //EjerciciosPracticaJedi.adivinarRandom();
        
        /*valor central de tres enteros dados como parámetros.*/
        /*int x=3,z=4,s=5,y;
        y=(((x<s)||(x<z))&&(z<s))?z:s;
        System.out.printf("El punto medio es %d",y);*/
        //EjerciciosPracticaJedi.detectarLetras("CaDANdecaracteresA");
        System.out.println("A" + 4 + 7 + "B");
        System.out.println(4 + 7 + "AB");
        
        
    }
    private static int i=1;
    private static int[]array=new int[101];
    private static Scanner sc= new Scanner(System.in);
    
    private static int[] rellenarArrayNumerosNaturales(){
        
        for (int i = 0; i < array.length; i++) {
            array[i]=i;
        }
        return array;
    }
    
    private static void calcularSumaYMedia(int array[]){
       int suma=IntStream.of(array).sum();
       double media=IntStream.of(array).mapToDouble(a->a).sum()/array.length;
        System.out.printf("La suma del array es %d y la media es %.2f \n", suma,media);       
    }
    
    private static void tablaMultiplicar(int n){
        for (int x = 1; x <= 10; x++) {
            System.out.printf(" %d X %d = %d\n",x,n,x*n);
        }
    }
    
    private static void calcularExpresion(double x){
        double y = (3-1)/x + 1/(Math.pow(x, 2)+5);
        System.out.printf("Es %.2f\n",y);
    }
    
    private static void calcularTiempo(int segundos){
        System.out.println(LocalTime.MIN.plusSeconds(segundos));
    }
    
    private static void adivinarRandom(){
        int x,valor;
        int contador=0;
        x= (int) (Math.random()*100)+1;
        System.out.println("****"+x+"****");
        do {
            System.out.println("Escriba un valor");
            valor=sc.nextInt();
            if (valor==x) {
                System.out.println("Has acertado");
                break;
            } else{
                contador++;
                System.out.printf("Se han realizado %d intentos\n",contador);
            }      
        } while (contador<5);   
    }
    /* Construir un programa que pida introducir una cadena de caracteres por teclado y visualice por
pantalla el número de caracteres a y A que contiene dicha cadena.*/
    private static void detectarLetras(String cadena){
       Map<Character,Integer>charMap= new HashMap<Character,Integer>();
       char[]arraychar=cadena.toCharArray();
        for (int i = 0; i <cadena.length(); i++) {
            if (!charMap.containsKey(arraychar[i])) {
                charMap.put(arraychar[i], 1);
            }else{
                charMap.put(arraychar[i],charMap.get(arraychar[i])+1);
            }  
        }
        System.out.println("a="+charMap.get('a'));
        System.out.println("A="+charMap.get('A'));
    }
}
