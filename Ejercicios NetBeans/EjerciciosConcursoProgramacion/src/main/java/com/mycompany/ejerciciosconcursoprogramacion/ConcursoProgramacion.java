/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejerciciosconcursoprogramacion;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class ConcursoProgramacion {

    /**
     * @param args the command line arguments
     */
    public static void verificarCinta(){
        Scanner sc= new Scanner(System.in);
        int tamaño,numeroJuegos,duracion;
        int total=0;
        int total2=0;
        boolean verificar=true;
        System.out.println("Escriba los dos valores");
        String linea1 = sc.nextLine();   
        String[] valores = linea1.split(" ");
        tamaño=Integer.parseInt(valores[0]);
        numeroJuegos=Integer.parseInt(valores[1]);
        System.out.println("Escriba los valores");
        String linea2 = sc.nextLine();
        String[] valores2 = linea2.split(" ");
        
        if (tamaño>1&&tamaño<Math.pow(10,8) && numeroJuegos>1 && numeroJuegos<8) {
            System.out.println("tamaño"+tamaño);
            System.out.println("juegos "+numeroJuegos);
            for (int i = 0; i <numeroJuegos; i++) { 
                total+=Integer.parseInt(valores2[i]);
                if (total>tamaño) {
                   total-=Integer.parseInt(valores2[i]); 
                   total2+=Integer.parseInt(valores2[i]);
                    if (total2>tamaño) {
                      verificar=false; 
                    }
                }              
            }
            System.out.println("total "+total);
            if (verificar) {
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
        }  
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int numCasos;
        System.out.println("Escriba el numero de casos");
        numCasos=sc.nextInt();
        for (int i = 0; i < numCasos; i++) {
            verificarCinta();
        }
    }
    
}
