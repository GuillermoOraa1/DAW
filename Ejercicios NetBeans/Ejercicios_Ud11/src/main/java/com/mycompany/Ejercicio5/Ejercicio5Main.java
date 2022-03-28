/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.Ejercicio5;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio5Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejercicio5Main.borrarFicheros();
    }

    public static void borrarFicheros(){
        Scanner sc= new Scanner(System.in);
        //String ruta= sc.nextLine();
        File fichero= new File("C:\\Users\\DAW\\Desktop\\EjerciciosFicheros\\Restaurants2.csv");
        System.out.println(fichero.canExecute());
        System.out.println(fichero.canRead());
        System.out.println(fichero.canWrite());
        
        if (fichero.exists()) {
            fichero.delete();
            System.out.println("Eliminado el archivo: "+fichero.getName());
        }
        
    }
    
}
