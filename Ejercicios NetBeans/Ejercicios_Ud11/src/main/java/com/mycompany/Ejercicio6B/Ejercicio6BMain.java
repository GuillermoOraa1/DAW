/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.Ejercicio6B;

import java.io.File;
import java.io.RandomAccessFile;

/**
 *
 * @author DAW
 */
public class Ejercicio6BMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            File ficheroNumerosPi = new File("C:\\Users\\retaz\\Desktop\\DatosParaEjerciciosFicheros-2\\pi-million.txt");
            //String textoBuscado="8013604668";
            String textoBuscado = "842311114855036608";
            String resultado = "Texto no encontrado";
            if (ficheroNumerosPi.exists()) {
                RandomAccessFile randomAccessNumerosPi = new RandomAccessFile(ficheroNumerosPi, "r");
                byte[] bytes = new byte[textoBuscado.length()];
                while (true) {
                    randomAccessNumerosPi.read(bytes);
                    randomAccessNumerosPi.seek(randomAccessNumerosPi.getFilePointer() - (textoBuscado.length() - 1));
                    String stringValue = new String(bytes);
                    if (stringValue.equals(textoBuscado)) {
                        resultado = "Texto encontrado";
                        break;
                    }
                    if (randomAccessNumerosPi.getFilePointer() == (randomAccessNumerosPi.length() - textoBuscado.length())) {
                        break;
                    }
                }
                randomAccessNumerosPi.close();
                System.out.println(resultado);
            }

        } catch (Exception e) {
            e.getMessage();
        }

    }
    
}
