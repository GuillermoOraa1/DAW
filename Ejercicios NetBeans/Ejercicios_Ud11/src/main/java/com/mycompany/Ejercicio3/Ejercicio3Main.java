/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.Ejercicio3;

import java.io.*;

/**
 *
 * @author DAW
 */
public class Ejercicio3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejercicio3Main.escribirDatos();
    }
    
    public static void escribirDatos(){
        try{
            
            File ficheroRestaurantes= new File("C:\\Users\\DAW\\Desktop\\EjerciciosFicheros\\Restaurants.csv");
            FileWriter filewriter= new FileWriter(ficheroRestaurantes, true);
            PrintWriter printwriter= new PrintWriter(filewriter);
            printwriter.write("Pizzeria,33 Cea Bermudez,Madrid,ES,28015");
            filewriter.close();
        }catch(Exception e){
            e.getMessage();
        }

    }
    
}
