/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.EjercicioDawBank;

import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author DAW
 */
public class CuentaBancaria {
    private String IBAN;
    private String titular;
    private double saldo;
    private ArrayList<Movimiento>movimientos=new ArrayList<Movimiento>();
    
    public CuentaBancaria(String IBAN,String titular){
        Pattern pat = Pattern.compile("[a-zA-Z]{2}[0-9]{22}");
        Matcher mat = pat.matcher(IBAN); 
        if (mat.matches()) {
            this.IBAN=IBAN;
        }else{
            //System.out.println("Aquí se lanzaría un error.");
            //this.IBAN=IBAN;
        }
        this.titular=titular;
        this.saldo=0.0;
    }

    public String getIBAN() {
        return IBAN;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo>-50) {
            this.saldo = saldo;
        }else{
            //AQUI SE CONTROLARIA EL ERROR
            //System.out.println("No se puede realizar la operacion, no hay fondos suficientes.");  
        }        
    }

    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void Ingresar(double cantidad){
        if (cantidad>0) {
            this.saldo=this.getSaldo()+cantidad;
            if(this.movimientos.size()<100){
                this.movimientos.add(new Movimiento("Cantidad ingresada: "+cantidad,LocalDateTime.now()));
            }else{
                this.ordenarMovimientos();
                this.movimientos.remove(0);
                this.movimientos.add(new Movimiento("Cantidad ingresada: "+cantidad,LocalDateTime.now()));
            }
        }
        if (cantidad>3000) {
            System.out.println("AVISO: Notificar a Hacienda");
        }

    }
    
    public void Retirar(double cantidad){
        if (cantidad>0 && this.saldo>-50) {
            this.setSaldo(this.getSaldo()-cantidad);
            if(this.movimientos.size()<4){
                this.movimientos.add(new Movimiento("Cantidad retirada: "+cantidad,LocalDateTime.now()));
            }else{
                this.ordenarMovimientos();
                this.movimientos.remove(0);
                this.movimientos.add(new Movimiento("Cantidad retirada: "+cantidad,LocalDateTime.now()));
            } 
            if (this.saldo<0 && this.saldo>-50) {
                System.out.println("AVISO: Saldo negativo");
            }
            if (cantidad>3000) {
                System.out.println("AVISO: Notificar a Hacienda");
            }
        }

    }
    
    public void ordenarMovimientos(){
        Collections.sort(this.movimientos);
    }
    
    
/*
    public void ordenarMovimientos(){
        Collections.sort(this.movimientos,new Comparator<Movimiento>(){
            @Override
            public int compare(Movimiento m1, Movimiento m2) {
		return m1.getFechaMovimiento().compareTo(m2.getFechaMovimiento());
            }
        });
    }
*/
    
    public String datosCuenta(){
        return "IBAN: "+this.IBAN+"\nTitular: "+this.titular+"\nSaldo: "+this.saldo;
    }
    
    public void imprimirMovimientos(){
        for (Movimiento movimiento : this.movimientos) {
            System.out.println(movimiento.getMovimiento()+"     "+movimiento.getFechaMovimiento().format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm")));
        }
        System.out.println("Saldo total: "+this.getSaldo());
    }
    
}
