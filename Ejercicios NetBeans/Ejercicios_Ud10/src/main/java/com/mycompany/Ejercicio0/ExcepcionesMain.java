/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.Ejercicio0;

/**
 *
 * @author DAW
 */
public class ExcepcionesMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=0,y=0;
        try{
            int div=x/y;
            System.out.println("La ejecucion no llegara aqui");
        }catch(ArithmeticException e){
            System.out.println("Has intentado dividir entre 0");
        }
        finally{
            System.out.println("Fin del programa");
        }
    }
    
}
