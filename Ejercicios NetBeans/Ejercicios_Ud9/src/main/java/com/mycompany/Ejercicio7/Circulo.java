/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Ejercicio7;

/**
 *
 * @author DAW
 */
public class Circulo implements iFigura2D{
    
    private double radio;
    
    public Circulo(double radio){
        this.radio=radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double perimetro() {
        return this.radio*2*iFigura2D.PI;
    }

    @Override
    public double area() {
        return iFigura2D.PI*Math.pow(this.radio, 2);
    }

    @Override
    public void escalar(double escala) {
        if (escala>=0) {
            this.setRadio(this.radio*escala);
        }else System.out.println("La escala debe ser mayor que cero.");
    }

    @Override
    public void imprimir() {
        System.out.printf("El circulo tiene Radio: %1.2f \nArea: %.2f \nPerimetro: %.2f \n\n",this.radio,this.area(),this.perimetro());
    }
    
}