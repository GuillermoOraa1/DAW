/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.Ejercicio5A;

import java.io.File;

/**
 *
 * @author DAW
 */
public class Ejercicio5AMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File fichero1= new File("C:\\Users\\DAW\\Desktop\\DatosParaEjerciciosFicheros-3\\FOTOS");
        Ejercicio5AMain.borraTodo(fichero1);
        File fichero2= new File("C:\\Users\\DAW\\Desktop\\DatosParaEjercicio-4");
        Ejercicio5AMain.borraSoloFicheros(fichero2);
    }
    
    public static boolean borraTodo(File fichero){
       if (fichero.exists()) {
          if (fichero.isDirectory()) { 
            if (fichero.listFiles().length!=0) { 
                File [] contenido= fichero.listFiles();
                for (int i = 0; i < contenido.length; i++) {
                    if (contenido[i].isDirectory()) {
                        borraTodo(contenido[i]); 
                        contenido[i].delete();
                    }      
                    else contenido[i].delete();                
                }            
            }
            fichero.delete();                      
         }else{
            fichero.delete(); 
         }  
        return true;
       }
        System.out.println("No se encuentra la ruta.");
        return false;
    }
    
    public static void borraSoloFicheros(File fichero){
     if (fichero.exists() && fichero.isDirectory()) { 
        if (fichero.listFiles().length!=0) { 
            File [] contenido= fichero.listFiles();
            for (int i = 0; i < contenido.length; i++) {
                if (contenido[i].isDirectory()) {
                    borraSoloFicheros(contenido[i]); 
                    //contenido[i].delete();
                }      
                else contenido[i].delete();                
            }            
        }
        //fichero.delete();                      
      }
    }
    
}
