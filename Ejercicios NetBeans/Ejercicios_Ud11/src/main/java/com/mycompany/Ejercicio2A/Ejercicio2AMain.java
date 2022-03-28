/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.Ejercicio2A;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio2AMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here"
        String ruta = "";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Escribe la ruta del fichero");
            ruta = sc.nextLine();
            if (!ruta.equals("")) {
                File fichero = new File(ruta);
                //File fichero=new File("C:\\Users\\DAW\\Desktop\\DatosParaEjerciciosFicheros-2");
                try {
                    Ejercicio2AMain.muestraInfoRuta(fichero, true);
                } catch (FileNotFoundException f) {
                    f.printStackTrace();
                }
            }
        } while (!ruta.equals(""));
    }

    public static void muestraInfoRuta(File fichero, boolean info) throws FileNotFoundException {
        if (fichero.exists()) {
            if (fichero.isFile()) {
                System.out.println("El nombre del archivo es: " + fichero.getName());
            }
            if (fichero.isDirectory()) {
                File[] contenidoDirectorio = fichero.listFiles();
                Arrays.sort(contenidoDirectorio, new Comparator<File>() {
                    @Override
                    public int compare(File f1, File f2) {
                        if (f1.isDirectory() && f2.isFile())
                            return 1;
                        if (f2.isDirectory() && f1.isFile())
                            return -1;
                        
                        if (f1.isDirectory() && f2.isDirectory() || f1.isFile() && f2.isFile() )
                            return f1.getName().compareTo(f2.getName());
                        return 0;
                    }
                });
                if (info == true) {
                    for (int i = 0; i < contenidoDirectorio.length; i++) {
                        if (contenidoDirectorio[i].isDirectory()) {
                            System.out.println("[*]" + contenidoDirectorio[i].getName()
                                    + "\nTamano: " + contenidoDirectorio[i].length() + "Fecha ultima modificacion: "
                                    + contenidoDirectorio[i].lastModified());
                        }
                    }
                    for (int i = 0; i < contenidoDirectorio.length; i++) {
                        if (contenidoDirectorio[i].isFile()) {
                            System.out.println("[A]" + contenidoDirectorio[i].getName()
                                    + "\nTamano: " + contenidoDirectorio[i].length() + "Fecha ultima modificacion: "
                                    + contenidoDirectorio[i].lastModified());
                        }
                    }
                }
                if (info == false) {
                    for (int i = 0; i < contenidoDirectorio.length; i++) {
                        if (contenidoDirectorio[i].isDirectory()) {
                            System.out.println("[*]" + contenidoDirectorio[i].getName());
                        }
                    }
                    for (int i = 0; i < contenidoDirectorio.length; i++) {
                        if (contenidoDirectorio[i].isFile()) {
                            System.out.println("[A]" + contenidoDirectorio[i].getName());
                        }
                    }
                }
            }
        } else {
            throw new FileNotFoundException();
        }
    }

}
