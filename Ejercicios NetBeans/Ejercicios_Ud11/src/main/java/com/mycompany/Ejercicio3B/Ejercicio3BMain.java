/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.Ejercicio3B;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DAW
 */
public class Ejercicio3BMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejercicio3BMain.solicitarArchivoLectura();
    }
    
    public static void solicitarArchivoLectura(){
        ArrayList<String>contenidoFicherolectura= new ArrayList<String>();
        //System.out.println("Escriba la ruta del archivo origen.");
        File ficheroLectura=new File("C:\\Users\\DAW\\Desktop\\DatosParaEjerciciosFicheros-2\\usa_personas.txt");
        if (ficheroLectura.exists()){
            try {
                Scanner textoLeido = new Scanner(ficheroLectura);
                while(textoLeido.hasNext()){
                    contenidoFicherolectura.add(textoLeido.nextLine());
                }
                Collections.sort(contenidoFicherolectura);
                Ejercicio3BMain.crearArchivoEscritura(contenidoFicherolectura);
                textoLeido.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Ejercicio3BMain.class.getName()).log(Level.SEVERE, null, ex);
            }        
        }
    }
    
    public static void crearArchivoEscritura(ArrayList<String>contenido){
        //System.out.println("Escriba la ruta del archivo destino.");        
        File ficheroEscritura=new File("C:\\Users\\DAW\\Desktop\\DatosParaEjerciciosFicheros-2\\usa_personas_sorted.txt");
        try{
           FileWriter FileWriterFicheroEscritura= new FileWriter(ficheroEscritura,false);
           PrintWriter PrintWriterFicheroEscritura=new PrintWriter(FileWriterFicheroEscritura);
           for(String linea:contenido){
             //PrintWriterFicheroEscritura.write(linea); 
             PrintWriterFicheroEscritura.println(linea); 
           }   
           PrintWriterFicheroEscritura.close();
        }catch(IOException e){
            e.getMessage();
        }
    }
    
}
