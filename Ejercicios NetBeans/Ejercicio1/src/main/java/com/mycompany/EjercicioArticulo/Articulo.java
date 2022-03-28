/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.EjercicioArticulo;

/**
 *
 * @author DAW
 */
public class Articulo {
    private String nombre;
    private int precio;
    static final int iva=21;
    static final int ivaReducido=10;
    static final int ivaSuperReducido=4;
    private int cuantosQuedan;

    public Articulo(String nombre, int precio, int cuantosQuedan) {
        this.nombre = nombre;
        if (precio>1000) {
            System.out.println("El precio es demasiado elevado, corrijalo.");
        }else{
            this.precio = precio;
        }
        this.cuantosQuedan = cuantosQuedan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        if (precio>1000) {
            System.out.println("El precio es demasiado elevado, corrijalo.");
        }else{
            this.precio = precio;
        }
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public void setCuantosQuedan(int cuantosQuedan) {
        this.cuantosQuedan = cuantosQuedan;
    }

    @Override
    public String toString() {
        return "Articulo{" + "nombre=" + nombre + ", precio=" + precio + ", cuantosQuedan=" + cuantosQuedan + '}';
    }
    
    public int getPVP(){
        return this.precio+(this.precio/100)*Articulo.iva;
    }
    
    public int getPVPDescuento(int descuento){
        return this.precio+((this.precio/100)*Articulo.iva)-descuento;
    }
    
    public boolean Vender(int cantidad){
        if (this.cuantosQuedan>=cantidad) {
           this.cuantosQuedan=this.cuantosQuedan-cantidad;
           return true;
        }else{
           return false;
        }
    }
    
    public boolean almacenar(int cantidad){
        if (this.cuantosQuedan<=100) {
           this.cuantosQuedan=this.cuantosQuedan+cantidad;
           return true;
        }else{
           return false;
        }
    }   
}
