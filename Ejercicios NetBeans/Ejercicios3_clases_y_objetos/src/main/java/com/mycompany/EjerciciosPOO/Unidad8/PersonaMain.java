/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.EjerciciosPOO.Unidad8;

/**
 *
 * @author DAW
 */
public class PersonaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona1=new Persona();
        Persona persona2=new Persona();
        persona1.pedirDatos();
        persona2.pedirDatos();
        persona1.imprimirMensaje();
        persona2.imprimirMensaje();
    }
    
}
