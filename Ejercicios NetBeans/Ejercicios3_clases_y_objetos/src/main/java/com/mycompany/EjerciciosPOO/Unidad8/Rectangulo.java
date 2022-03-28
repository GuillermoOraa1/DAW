/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.EjerciciosPOO.Unidad8;

/**
 *
 * @author DAW
 */
public class Rectangulo {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Rectangulo(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    public void mostrarCoordenadas(){
        System.out.printf("(%d,%d),(%d,%d)",this.x1,this.y1,this.x2,this.y2);
    }
    
    public void calcularPerimetro(){
        double perimetro=Math.sqrt(Math.pow((y2-y1), 2)+Math.pow((x2-x1), 2));
    }
    
    public void calcularArea(){
    
    }
}
