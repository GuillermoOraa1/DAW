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
public class EjercicioPingPong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        String entrada=sc.nextLine();
        String[]casos=entrada.split(" ");
        boolean jugador=true;
        int puntuacionJugador1=0,puntuacionJugador2=0;
        for (int i = 1; i < casos.length; i++) {
            switch (casos[i]) {
                case "PIC":
                    jugador=!jugador;
                    break;
                    
                case "PONG!":
                    if (jugador==true) {
                        puntuacionJugador1=puntuacionJugador1+1;
                    }else{
                        puntuacionJugador2=puntuacionJugador2+1;
                    }
                    break;
            }
        }
        System.out.println(puntuacionJugador1+"-"+puntuacionJugador2);
    }
    
}
