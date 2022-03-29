/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.Ejercicio4B;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DAW
 */
public class Ejercicio4BMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejercicio4BMain.leerFichero();
    }
    public static void leerFichero(){
        try {
            /*Scanner sc = new Scanner(System.in);
            System.out.println("Escriba la ruta del archivo con los nombres.");
            String rutaNombres=sc.nextLine();
            System.out.println("Escriba la ruta del archivo con los apellidos.");
            String rutaApellidos=sc.nextLine();
            */
            String rutanombres="C:\\Users\\DAW\\Desktop\\DatosParaEjerciciosFicheros-2\\usa_nombres.txt";
            String rutaapellidos="C:\\Users\\DAW\\Desktop\\DatosParaEjerciciosFicheros-2\\usa_apellidos.txt";
            /*
            File ficheroNombres=new File("C:\\Users\\DAW\\Desktop\\DatosParaEjerciciosFicheros-2\\usa_nombres.txt");
            File ficheroApellidos=new File("C:\\Users\\DAW\\Desktop\\DatosParaEjerciciosFicheros-2\\usa_apellidos.txt");
            FileReader FileReaderFicheroNombres=new FileReader(ficheroNombres);
            FileReader FileReaderFicheroApellidos=new FileReader(ficheroApellidos);
            BufferedReader BufferedReaderFicheroNombres=new BufferedReader(FileReaderFicheroNombres);
            BufferedReader BufferedReaderFicheroApellidos=new BufferedReader(FileReaderFicheroApellidos);
            */
            RandomAccessFile FicheroNombres = new RandomAccessFile(rutanombres, "r");
            RandomAccessFile FicheroApellidos = new RandomAccessFile(rutaapellidos, "r");
            long posicion=0+(long) Math.random()*(FicheroNombres.length());
            System.out.println("XXX"+posicion);
            //FicheroNombres.seek();
        } catch (Exception ex) {
            Logger.getLogger(Ejercicio4BMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }    
}
