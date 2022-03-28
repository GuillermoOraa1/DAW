/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examenguillermooraaejercicio3;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mostrarHuevos();
    }
    
    public static void mostrarHuevos(){
        Scanner sc= new Scanner(System.in);
        int[][] inventarioHuevos=new int [2][4];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                if (i==0) {
                    System.out.println("Introduce los huevos de la hembra de Carbonero de "+(2018+j));
                }
                if (i==1) {
                    System.out.println("Introduce los huevos de la hembra de Petirrojo de "+(2018+j));
                }
                inventarioHuevos[i][j]=sc.nextInt();
            }
        } 
        int max=inventarioHuevos[0][0];
        int min=inventarioHuevos[0][0];
        int media=0;
        for (int i = 0; i < 4; i++) {
            if (inventarioHuevos[0][i]>max) {
                max=inventarioHuevos[0][i];
            }
            if (inventarioHuevos[0][i]<min) {
                min=inventarioHuevos[0][i];
            }
            media+=inventarioHuevos[0][i];
        }
        System.out.println("La hembra de Carbonero puso minimo "+min+" huevos, maximo "+max+" y de media "+(media/4));
        
        max=inventarioHuevos[1][0];
        min=inventarioHuevos[1][0];
        media=0;        
        for (int i = 0; i < 4; i++) {
            if (inventarioHuevos[1][i]>max) {
                max=inventarioHuevos[1][i];
            }
            if (inventarioHuevos[1][i]<min) {
                min=inventarioHuevos[1][i];
            }
            media+=inventarioHuevos[1][i];
        }
        System.out.println("La hembra de Petirrojo puso minimo "+min+" huevos, maximo "+max+" y de media "+(media/4));
    }
}
