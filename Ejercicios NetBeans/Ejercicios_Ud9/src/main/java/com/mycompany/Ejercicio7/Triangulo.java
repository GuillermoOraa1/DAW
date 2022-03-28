/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Ejercicio7;

/**
 *
 * @author DAW
 */
public class Triangulo implements iFigura2D{
    private double base;
    private double altura;
    
    public Triangulo(double base,double altura){
        this.base=base;
        this.altura=altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double perimetro() {
        double lado=Math.sqrt(Math.pow(this.altura, 2)+Math.pow((this.base/2), 2));
        return this.base+(lado*2);
    }

    @Override
    public double area() {
        return (this.base*this.altura)/2;
    }

    @Override
    public void escalar(double escala) {
        if (escala>=0) {
            this.setBase(this.base*escala);
            this.setAltura(this.altura*escala);
        }else System.out.println("La escala debe ser mayor que cero.");
    }

    @Override
    public void imprimir() {
        System.out.printf("El Triangulo tiene Base: %.2f y Altura: %.2f \nArea: %.2f \nPerimetro: %.2f \n\n",this.base,this.altura,this.area(),this.perimetro());
    }
    
}
