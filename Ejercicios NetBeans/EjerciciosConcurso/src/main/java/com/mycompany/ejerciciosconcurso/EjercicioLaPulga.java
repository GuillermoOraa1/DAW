/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejerciciosconcurso;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class EjercicioLaPulga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int calculo=(45-40)*10;
        int calculo2=(32-32)*1;
        int calculo3=(31-32)*1;
        System.out.println(Math.abs(calculo));
        System.out.println(Math.abs(calculo2));
        System.out.println(Math.abs(calculo3));
        */
        Scanner sc= new Scanner(System.in);
        int posicion,t,n,f;
        t=sc.nextInt();
        n=sc.nextInt();
        f=sc.nextInt();
        System.out.println(t%(n+1)*f);
    }
    
}
