/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.Ejercicio3A;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author DAW
 */
public class Ejercicio3AMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        File fichero3= new File("C:\\Users\\DAW\\Desktop\\DatosParaEjerciciosFicheros-2");
        
        //utilizo un filtro para recuperar todos los archivos que tengan esos tres nombres
        File[] ficheros=fichero3.listFiles(new FilenameFilter(){
            @Override
            public boolean accept(File dir, String name) {
                return name.matches("Documentos|Fotografias|Libros");
            }
        });
        
        //Una vez que he comprobado que existen los 3 nombres, cambio los nombres
        if (ficheros.length==3) {
            File fichero4=new File("C:\\Users\\DAW\\Desktop\\DatosParaEjerciciosFicheros-2\\Documentos");
            File fichero5=new File("C:\\Users\\DAW\\Desktop\\DatosParaEjerciciosFicheros-2\\DOCS");
            fichero4.renameTo(fichero5);
            File fichero6=new File("C:\\Users\\DAW\\Desktop\\DatosParaEjerciciosFicheros-2\\Fotografias");
            File fichero7=new File("C:\\Users\\DAW\\Desktop\\DatosParaEjerciciosFicheros-2\\FOTOS");
            fichero6.renameTo(fichero7);
            File fichero8=new File("C:\\Users\\DAW\\Desktop\\DatosParaEjerciciosFicheros-2\\libros");
            File fichero9=new File("C:\\Users\\DAW\\Desktop\\DatosParaEjerciciosFicheros-2\\Lecturas");
            fichero8.renameTo(fichero9);
            
            Ejercicio3AMain.quitarExtension(fichero7);
            Ejercicio3AMain.quitarExtension(fichero9);
        }
        //creo una funcion para quitar las extensiones 
           File fichero9=new File("C:\\Users\\DAW\\Desktop\\DatosParaEjerciciosFicheros-3\\Lecturas");
           File fichero7=new File("C:\\Users\\DAW\\Desktop\\DatosParaEjerciciosFicheros-3\\FOTOS");
           Ejercicio3AMain.quitarExtension(fichero7);
           Ejercicio3AMain.quitarExtension(fichero9);
    }
    
    public static void quitarExtension(File file){
        File[] contenido= file.listFiles();
        for (int i = 0; i<contenido.length; i++) {
            if (contenido[i].isFile()) {
                String [] division=contenido[i].getName().split("\\.");
                String direccion= contenido[i].getParent()+"\\"+division[0];
                File fichero=new File(direccion);
                contenido[i].renameTo(fichero);           
            }
        }
    }
    
}
