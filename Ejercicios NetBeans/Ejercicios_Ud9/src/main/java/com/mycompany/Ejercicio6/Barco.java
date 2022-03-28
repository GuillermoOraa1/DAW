/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Ejercicio6;

/**
 *
 * @author DAW
 */
public class Barco extends VehiculoAcuatico{
    private boolean motor;
    
    public Barco(String matricula,String modelo,int eslora, boolean motor){
        super(matricula, modelo, eslora);
        this.motor=motor;
    }

    public boolean getMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }
    
    @Override
    public void imprimir() {
       String cadena="Matricula: "+this.getMatricula()+" Modelo: "+this.getModelo()+
               " Eslora: "+this.getEslora();
        if (motor) {
            System.out.println(cadena+" Motor: El barco tiene motor.");
        }else System.out.println(cadena+" Motor: El barco no tiene motor.");
    }
    
}
