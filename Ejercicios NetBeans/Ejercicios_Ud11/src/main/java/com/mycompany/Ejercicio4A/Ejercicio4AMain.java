/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.Ejercicio4A;

import java.io.File;

/**
 *
 * @author DAW
 */
public class Ejercicio4AMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejercicio4AMain.crearContenido();
    }
    public static void crearContenido(){
        //crea dentro de ‘Documentos’, dos nuevas carpetas: ‘Mis Cosas’ y ‘Alfabeto’
        File MisCosas= new File("C:\\Users\\DAW\\Desktop\\DatosParaEjerciciosFicheros-3\\DOCS\\Mis cosas");
        MisCosas.mkdir();
        File Alfabeto= new File("C:\\Users\\DAW\\Desktop\\DatosParaEjerciciosFicheros-3\\DOCS\\Alfabeto");
        Alfabeto.mkdir();
        //Muevo las carpetas ‘Fotografias’ y ‘Libros’ dentro de ‘Mis Cosas’.
        File FOTOS=new File("C:\\Users\\DAW\\Desktop\\DatosParaEjerciciosFicheros-3\\FOTOS");
        File Lecturas=new File("C:\\Users\\DAW\\Desktop\\DatosParaEjerciciosFicheros-3\\Lecturas");
        File MisCosasFotos= new File("C:\\Users\\DAW\\Desktop\\DatosParaEjerciciosFicheros-3\\DOCS\\Mis cosas\\Fotos");
        File MisCosasLecturas= new File("C:\\Users\\DAW\\Desktop\\DatosParaEjerciciosFicheros-3\\DOCS\\Mis cosas\\Lecturas");
        FOTOS.renameTo(MisCosasFotos);
        Lecturas.renameTo(MisCosasLecturas);
        //creo directorios dentro de Alfabeto
        for (int i = 65; i <=90 ; i++) {
            String ruta="C:\\Users\\DAW\\Desktop\\DatosParaEjerciciosFicheros-3\\DOCS\\Alfabeto\\"+(char)i;
            File directorio=new File(ruta);
            directorio.mkdir();
        }
    }
}
