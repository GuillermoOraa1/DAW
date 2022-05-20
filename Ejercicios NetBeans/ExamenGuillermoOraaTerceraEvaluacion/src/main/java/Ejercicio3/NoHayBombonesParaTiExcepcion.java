/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author DAW
 */
public class NoHayBombonesParaTiExcepcion extends Exception{
    public NoHayBombonesParaTiExcepcion(){}
    
    @Override
    public String getMessage(){
        return "No hay bombones para ti.";
    }
}

