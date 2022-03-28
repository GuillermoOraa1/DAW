/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios3_clases_y_objetos;

/**
 *
 * @author DAW
 */
public class Figura {
    int lados;

    public Figura(int lados) {
        this.lados = lados;
    }
    public int getNumeroLados(){
        return this.lados;
    }
    public void setNumeroLados(int lados){
        this.lados=lados;
    }
}
