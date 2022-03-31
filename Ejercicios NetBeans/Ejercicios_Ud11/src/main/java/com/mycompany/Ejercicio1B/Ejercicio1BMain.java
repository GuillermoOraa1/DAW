/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.Ejercicio1B;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio1BMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejercicio1BMain.leerNumeros();
    }

    public static void leerNumeros(){
        int mayor,menor,numero;
        Scanner sc =null;
        try{
            File ficheroNumeros= new File("C:\\Users\\DAW\\Desktop\\DatosParaEjerciciosFicheros-2\\numeros.txt");
            sc = new Scanner(ficheroNumeros); 
            mayor=menor=sc.nextInt();
            while(sc.hasNext()){
                numero= sc.nextInt();
                if(mayor<numero) mayor=numero;
                if(menor>numero) menor=numero;
            }
            System.out.printf("El valor mayor es %d y el menor es %d.",mayor,menor);
            
        }catch(FileNotFoundException f){
            f.printStackTrace();
        }finally{
            sc.close();
        } 
    }
    
    
}
