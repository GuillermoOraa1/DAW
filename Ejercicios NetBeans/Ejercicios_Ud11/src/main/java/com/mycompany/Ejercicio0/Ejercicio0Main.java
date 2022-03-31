/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.Ejercicio0;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author DAW
 */
public class Ejercicio0Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File fichero= new File("FicheroEjemplo.txt");
        if (fichero.exists()) {
            System.out.println("El directorio padre es: "+fichero.getParent());
            System.out.println("Nombre del archivo: "+fichero.getName());
            System.out.println("Ruta: "+fichero.getPath());
            System.out.println("Ruta absoluta: "+fichero.getAbsolutePath());
            System.out.println("Se puede leer: "+fichero.canRead());
            System.out.println("Es un directorio: "+fichero.isDirectory());
            System.out.println("Es un fichero: "+fichero.isFile());
            System.out.println("**********");
        }
        
        File fichero2= new File("C:\\Users\\DAW\\Desktop\\DatosParaEjerciciosFicheros-2\\numeros.txt");
        if (fichero2.exists()) {
            System.out.println("El directorio padre es: "+fichero2.getParent());
            System.out.println("Nombre del archivo: "+fichero2.getName());
            System.out.println("Ruta: "+fichero2.getPath());
            System.out.println("Ruta absoluta: "+fichero2.getAbsolutePath());
            System.out.println("Se puede leer: "+fichero2.canRead());
            System.out.println("Es un directorio: "+fichero2.isDirectory());
            System.out.println("Es un fichero: "+fichero2.isFile());
            System.out.println("**********");           
        }
        
        File fichero3= new File("C:\\Users\\DAW\\Desktop\\DatosParaEjerciciosFicheros-2");
        if (fichero2.exists()) {
            System.out.println("El directorio padre es: "+fichero3.getParent());
            System.out.println("Nombre del archivo: "+fichero3.getName());
            System.out.println("Ruta: "+fichero3.getPath());
            System.out.println("Ruta absoluta: "+fichero3.getAbsolutePath());
            System.out.println("Se puede leer: "+fichero3.canRead());
            System.out.println("Es un directorio: "+fichero3.isDirectory());
            System.out.println("Es un fichero: "+fichero3.isFile());
            System.out.println("**********");           
        }
        
        File fichero4=new File("C:\\Users\\DAW\\Desktop\\fotos.txt");
        File fichero5=new File("C:\\Users\\DAW\\Desktop\\fotos");
        File fichero6=new File("C:\\Users\\DAW\\Desktop\\fotos\\foto.png");
        try{
            if (fichero4.exists()) {
                fichero4.delete();
            }
            if (fichero5.exists()) {
                eliminar(fichero5);
            }
            
            if(!fichero4.exists() && !fichero5.exists() && !fichero6.exists()){
                System.out.println("SE CREAN LOS FICHEROS");
                fichero4.createNewFile();
                fichero5.mkdir();
                fichero6.createNewFile();            
            }
            //probamos el metodo length y lastModified con un fichero
            if (fichero4.isFile()) {
                System.out.println(fichero4.length());
                System.out.println(fichero4.lastModified());               
            }
            if (fichero5.isDirectory()) {
                System.out.println(fichero5.length());
                System.out.println(fichero5.lastModified()); 
            }
            
        }catch(Exception e){
            System.out.println("Archivos no creados");
        }
        
        System.out.println("Los valores de la brújula son: "+EnumeradosPosicionesBrujula.Norte+
                EnumeradosPosicionesBrujula.Sur+EnumeradosPosicionesBrujula.Este+EnumeradosPosicionesBrujula.Oeste); 
    }
    public static void eliminar(File fichero){
     if (fichero.exists() && fichero.isDirectory()) { 
        if (fichero.listFiles().length!=0) { 
            File [] contenido= fichero.listFiles();
            for (int i = 0; i < contenido.length; i++) {
                if (contenido[i].isDirectory()) {
                    eliminar(contenido[i]); 
                    contenido[i].delete();
                }      
                else contenido[i].delete();                
            }            
        }
        fichero.delete();                      
      }
    }
    
}
