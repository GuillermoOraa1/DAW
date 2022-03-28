/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Ejercicio6;

/**
 *
 * @author DAW
 */
public class Coche extends VehiculoTerrestre{
    private boolean aireAcondicionado;
    
    public Coche(String matricula,String modelo,int numeroRuedas,boolean aireAcondicionado){
        super(matricula, modelo, numeroRuedas);
        this.aireAcondicionado=aireAcondicionado;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }
    
    @Override
    public void imprimir() {
        String cadena="Matricula: "+this.getMatricula()+
                " Modelo: "+this.getModelo()+" Numero de ruedas: "+this.getNumeroRuedas();
        
        if (aireAcondicionado) {
            System.out.println(cadena+" Aire acondicionado: El coche tiene aire acondicionado.");
        }else System.out.println(cadena+" Aire acondicionado: El coche no tiene aire acondicionado.");             
    }
    
}
