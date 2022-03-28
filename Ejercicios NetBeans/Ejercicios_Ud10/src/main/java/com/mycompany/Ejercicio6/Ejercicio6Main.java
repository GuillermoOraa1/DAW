/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.Ejercicio6;

/**
 *
 * @author DAW
 */
public class Ejercicio6Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Gato gato1= new Gato("ssss",13);
            gato1.setEdad(3);
            gato1.setNombre("zzzz");
            gato1.imprimir();
        }catch (Exception e){
            e.printStackTrace();
            e.getMessage();
        }

        try{
            Gato gato2= new Gato("zzzz",0);
            gato2.setEdad(-1);
            gato2.imprimir();
        }catch (Exception e){
            e.printStackTrace();
            e.getMessage();
        }

        try{
            Gato gato3=new Gato("xx",9);
            gato3.imprimir();
        }catch (Exception e){
            e.printStackTrace();
            e.getMessage();
        }        
        
        try{
            Gato gato4=new Gato("qqq",9);
            gato4.setNombre("qq");
            gato4.imprimir();
        }catch (Exception e){
            e.printStackTrace();
            e.getMessage();
        }        

        
    }
    
}
