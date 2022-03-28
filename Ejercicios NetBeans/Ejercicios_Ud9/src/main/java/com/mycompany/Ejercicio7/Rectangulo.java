/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Ejercicio7;

/**
 *
 * @author DAW
 */
public class Rectangulo implements iFigura2D{
    
    private double ancho;
    private double alto;
    
    public Rectangulo(double ancho,double alto){
        this.ancho=ancho;
        this.alto=alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    @Override
    public double perimetro() {
        return this.alto*2+this.ancho*2;
    }

    @Override
    public double area() {
        return this.alto*this.ancho;
    }

    @Override
    public void escalar(double escala) {
        if (escala>=0) {
            this.setAncho(this.ancho*escala);
            this.setAlto(this.alto*escala);
        }else System.out.println("La escala debe ser mayor que cero.");
    }

    @Override
    public void imprimir() {
        System.out.printf("El Rectangulo tiene Ancho: %.2f y Alto: %.2f \nArea: %.2f \nPerimetro: %.2f \n\n",this.ancho,this.alto,this.area(),this.perimetro());
    }
    
}
