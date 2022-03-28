/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.Ejercicio4;

import java.io.*;
import java.util.regex.Pattern;

/**
 *
 * @author DAW
 */
public class Ejercicio4Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejercicio4Main.crearCopiaFicheroDatos();
    }
    public static void crearCopiaFicheroDatos(){
         try{            
            String linea;
            File ficheroRestaurantes= new File("C:\\Users\\DAW\\Desktop\\EjerciciosFicheros\\Restaurants.csv");
            FileReader lectorFicheroRestaurantes= new FileReader(ficheroRestaurantes);
            BufferedReader restaurantes= new BufferedReader(lectorFicheroRestaurantes);
            
            File ficheroRestaurantes2= new File("C:\\Users\\DAW\\Desktop\\EjerciciosFicheros\\Restaurants2.csv");
            ficheroRestaurantes2.createNewFile();
            Writer filewriter=new FileWriter(ficheroRestaurantes2);
            PrintWriter printwriter= new PrintWriter(filewriter);
            while((linea=restaurantes.readLine())!=null){
                //printwriter.write(linea+"\n");
                if(Pattern.matches("\\d{5}\\z", linea)){
                    printwriter.write(linea);
                }                
            }
            restaurantes.close();
            filewriter.close();
           
        }catch(FileNotFoundException f){
            f.getMessage();
        }catch(Exception e){
            e.getMessage();
        }       
    }
}
