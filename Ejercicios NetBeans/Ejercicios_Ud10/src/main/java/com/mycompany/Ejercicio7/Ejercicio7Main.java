/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.Ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio7Main {

    /**
     * @param args the command line arguments
     */
    private static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Gato>ListaGatos= new ArrayList<Gato>();
        int edad;
        String nombre;
        Gato gato;
        while(ListaGatos.size()<5) {
            try{
                System.out.println("Introduce un nombre de gato.");
                nombre=sc.nextLine();
                System.out.println("Introduce la edad del gato.");
                edad=sc.nextInt();
                gato= new Gato(nombre,edad);
                ListaGatos.add(gato);
            }catch(Exception e){
                e.printStackTrace();
                e.getMessage();
            }          
        }
        for (int i = 0; i < ListaGatos.size(); i++) {
            ListaGatos.get(i).imprimir();
        }
    }
    
}
