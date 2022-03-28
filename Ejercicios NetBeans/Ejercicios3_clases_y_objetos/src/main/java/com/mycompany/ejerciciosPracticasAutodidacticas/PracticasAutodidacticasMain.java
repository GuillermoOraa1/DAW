/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejerciciosPracticasAutodidacticas;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author DAW
 */
public class PracticasAutodidacticasMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Construir un programa que pida introducir una cadena de caracteres por teclado y visualice por
          pantalla el número de caracteres a y A que contiene dicha cadena.*/
        Scanner sc = new Scanner(System.in);
        /*
        int cuenta=0; int posicion=0;
        System.out.println("Introduce una palabra");
        String palabra= sc.nextLine().toLowerCase();
        posicion = palabra.indexOf("a");
        
        while ( posicion != -1 ) {
            cuenta++;
            posicion = palabra.indexOf("a",posicion+1);
        }
        System.out.printf("La letras A y a aparecen %2d veces en la palabra",cuenta);
        */
        
        /*Rutina que indica si un carácter determinado está incluido o no dentro de un String dado como
        parámetro*/
        /*
        if (palabra.indexOf('e')!=-1) System.out.println("Esta la E");
        else System.out.println("No esta la E");
        */
        
        /*Rutina que indica si todos los caracteres contenidos en un String dado como parámetro
          corresponden a dígitos decimales o no*/
        /*
        System.out.println("Introduce una palabra con o sin decimales");
        String palabra2= sc.nextLine();
        try{
         Integer.parseInt(palabra2);
         System.out.println("Si son decimales");       
        }catch(Exception e){
            System.out.println("Hay letras ademas de decimales");
        }
        */
        
        /*Rutina que indica si todos los caracteres contenidos en un String dado como parámetro
        corresponden a letras (mayúsculas o minúsculas) o no.*/
        /*
        System.out.println("Introduce una palabra con o sin mayusculas");
        String palabra2= sc.nextLine();
        if(Pattern.matches("[A-Za-z]+", palabra2)) System.out.println("Son todo letras.");
        else System.out.println("Hay digitos que no son letras.");*/
        
        /*Rutina que devuelve una cadena con la representación binaria de un valor entero dado como
        parámetro.*/
        /*
        System.out.println("Introduce un numero");
        int numero= sc.nextInt();
        System.out.println(Integer.toBinaryString(numero));
        */
    }
    
}
