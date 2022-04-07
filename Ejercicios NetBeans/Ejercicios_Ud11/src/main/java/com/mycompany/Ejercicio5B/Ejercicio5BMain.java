/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.Ejercicio5B;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author DAW
 */
public class Ejercicio5BMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Ejercicio5BMain.escribirDiccionario();
        } catch (IOException ex) {
            ex.getMessage();
        }
    }
    
    private static void escribirDiccionario()throws IOException{
        //Creamos el directorio Diccionario
        File directorioPrincipal= new File("C:\\Users\\DAW\\Desktop\\DatosParaEjerciciosFicheros-2");
        File directorioDiccionario=new File(directorioPrincipal.getAbsolutePath().concat("\\Diccionario"));
        if(directorioDiccionario.mkdir()){
            for (int i =65; i < 91; i++) {
                File ficheroPorLetra=new File(directorioDiccionario.getAbsolutePath().concat("\\"+(char)i+".txt"));
                ficheroPorLetra.createNewFile();
             
                //leemos le contenido de diccionario.txt
                FileReader fileReaderContenidoDiccionario = new FileReader(new File("C:\\Users\\DAW\\Desktop\\DatosParaEjerciciosFicheros-2\\diccionario.txt"));
                BufferedReader bufferReaderContenidoDiccionario = new BufferedReader (fileReaderContenidoDiccionario);
                FileWriter fileWriterFicheroPorLetra = new FileWriter(ficheroPorLetra);
                PrintWriter printWriterFicheroPorLetra = new PrintWriter(fileWriterFicheroPorLetra);
                String linea;
                while((linea=bufferReaderContenidoDiccionario.readLine()) != null){
                    //System.out.println(linea);
                    if(Character.compare(linea.toUpperCase().charAt(0),(char)i)==0){
                      printWriterFicheroPorLetra.println(linea);  
                    }  
                }
                fileWriterFicheroPorLetra.close();
                printWriterFicheroPorLetra.close();
                bufferReaderContenidoDiccionario.close();
                fileReaderContenidoDiccionario.close();
            }
        } else System.out.println("No se pudo crear el directorio Diccionario");
        
    }
    
}
