/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miniternimal;

/**
 *
 * @author DAW
 */
public class MiniFileManagerException extends Exception{
    
    private String mensaje;
    
    public MiniFileManagerException(String mensaje){
        this.mensaje=mensaje;
    }
    
    @Override
    public String getMessage(){
        return this.mensaje;
    }
}
