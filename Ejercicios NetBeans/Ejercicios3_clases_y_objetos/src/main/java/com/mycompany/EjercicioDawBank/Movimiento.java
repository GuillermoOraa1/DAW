/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.EjercicioDawBank;


import java.time.LocalDateTime;

        
/**
 *
 * @author DAW
 */
public class Movimiento implements Comparable<Movimiento>{
    private String movimiento;
    private LocalDateTime fechaMovimiento;
    
    public Movimiento(String movimiento,LocalDateTime fechaMovimiento){
        this.movimiento=movimiento;
        this.fechaMovimiento=fechaMovimiento;
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }

    public LocalDateTime getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void setFechaMovimiento(LocalDateTime fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

    @Override
    public int compareTo(Movimiento o) {
       return this.getFechaMovimiento().compareTo(o.getFechaMovimiento());
    }
    
}
