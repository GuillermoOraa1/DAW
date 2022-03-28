package com.mycompany.Ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author DAW
 */
public class Ejercicio2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejercicio2Main.mostrarDatos();
    }
    public static void mostrarDatos(){
        try{
            
            String linea;
            File ficheroRestaurantes= new File("C:\\Users\\DAW\\Desktop\\EjerciciosFicheros\\Restaurants.csv");
            FileReader lectorFicheroRestaurantes= new FileReader(ficheroRestaurantes);
            BufferedReader restaurantes= new BufferedReader(lectorFicheroRestaurantes);
            while((linea=restaurantes.readLine())!=null){
                System.out.println(linea);
                if(Pattern.matches("\\d{5}\\z", linea)){
                    System.out.println(linea);
                }                
            }
            restaurantes.close();
            
            /*
            //File ficheroRestaurantes= new File("C:Users"+File.separator+"DAW"+File.separator+"Desktop"+File.separator+"EjerciciosFicheros"+File.separator+"Restaurants.csv");
            File ficheroRestaurantes= new File("C:\\Users\\DAW\\Desktop\\EjerciciosFicheros\\Restaurants.csv");
            System.out.println(ficheroRestaurantes.exists());
            Scanner sc= new Scanner(ficheroRestaurantes);
            sc.useDelimiter(",");
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
            */
        }catch(FileNotFoundException f){
            f.getMessage();
        }catch(Exception e){
            e.getMessage();
        }

    }
}
