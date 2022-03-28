/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Ejercicio8;

/**
 *
 * @author DAW
 */
public class AvisarHaciendaException extends Exception{
    
    private CuentaBancaria cuentaCorriente;
    
    public AvisarHaciendaException(CuentaBancaria cuentaCorriente){
        this.cuentaCorriente=cuentaCorriente;
    }
    
    @Override  
    public String getMessage(){
        return "Avisar a Hacienda sobre "+ this.cuentaCorriente.getTitular()+
                " que es titular de la cuenta "+this.cuentaCorriente.getIBAN()+
                "que ha realizado un "+
                this.cuentaCorriente.getMovimientos().get((this.cuentaCorriente.getMovimientos().size())-1).getMovimiento();
    }
}
