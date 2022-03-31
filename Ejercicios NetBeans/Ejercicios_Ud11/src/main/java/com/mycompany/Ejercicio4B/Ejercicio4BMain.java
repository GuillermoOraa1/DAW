/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.Ejercicio4B;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
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
        String rutaNombres="C:\\Users\\DAW\\Desktop\\DatosParaEjerciciosFicheros-2\\usa_nombres.txt";
        String rutaApellidos="C:\\Users\\DAW\\Desktop\\DatosParaEjerciciosFicheros-2\\usa_apellidos.txt";
        String rutaEscritura="C:\\Users\\DAW\\Desktop\\DatosParaEjerciciosFicheros-2\\usa_personas_sorted.txt";
        RandomAccessFile FicheroNombres = null;
        RandomAccessFile FicheroApellidos = null;
        RandomAccessFile FicheroEscritura = null;
        try {
            /*Scanner sc = new Scanner(System.in);
            System.out.println("Escriba la ruta del archivo origen con los nombres.");
            String rutaNombres=sc.nextLine();
            System.out.println("Escriba la ruta del archivo origen con los apellidos.");
            String rutaApellidos=sc.nextLine();
            System.out.println("Escriba la ruta del archivo objetivo.");
            String rutaApellidos=sc.nextLine();
            */
            FicheroNombres = new RandomAccessFile(rutaNombres, "r");
            FicheroApellidos = new RandomAccessFile(rutaApellidos, "r");
            FicheroEscritura = new RandomAccessFile(rutaEscritura, "rw");
            for (int i = 0; i < 5; i++) {
                long posicionNombres=0+(long) (Math.random()*(FicheroNombres.length()- 0));
                long posicionApellidos=0+(long) (Math.random()*(FicheroApellidos.length()- 0));
                FicheroNombres.seek(posicionNombres);
                FicheroNombres.readLine();
                String nombre= FicheroNombres.readLine();
                FicheroApellidos.seek(posicionApellidos);
                FicheroApellidos.readLine();
                String apellido= FicheroApellidos.readLine();
                System.out.println(nombre+" "+apellido);
                FicheroEscritura.writeUTF(nombre+" "+apellido+"\n");
            }  
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        } catch (IOException ex) {
            ex.getMessage();
        }finally{
            try {
                FicheroNombres.close();
                FicheroApellidos.close();
                FicheroEscritura.close();
            } catch (IOException ex) {
                ex.getMessage();
            }
      
        }
        

    }    
}
