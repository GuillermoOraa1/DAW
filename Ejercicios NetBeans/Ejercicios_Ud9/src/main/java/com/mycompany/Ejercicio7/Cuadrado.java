/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Ejercicio7;

/**
 *
 * @author DAW
 */
public class Cuadrado implements iFigura2D{
    
    private double lado;
    
    public Cuadrado(double lado){
        this.lado=lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double perimetro() {
        return this.lado*4;
    }

    @Override
    public double area() {
        return Math.pow(this.lado, 2);
    }

    @Override
    public void escalar(double escala) {
        if (escala>=0) {
            this.setLado(this.lado*escala);
        }else System.out.println("La escala debe ser mayor que cero.");
    }

    @Override
    public void imprimir() {
         System.out.printf("El Cuadrado tiene Lado: %.2f \nArea: %.2f \nPerimetro: %.2f \n\n",this.lado,this.area(),this.perimetro());
    }
    
}
