/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Ejercicio5;

/**
 *
 * @author DAW
 */
public class Empleado {
    private String nombre;
    private String DNI;
    private double sueldoBruto;
    private int edad;
    private String telefono;
    private String direccion;
    
    public Empleado(String nombre, String DNI,double sueldoBruto){
        this.nombre=nombre;
        this.DNI=DNI;
        this.sueldoBruto=sueldoBruto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
   
    public String mostrarDatosEmpleado(){
        String descripcionEmpleado="Nombre: "+this.nombre+"\nDNI: "+this.DNI+"\nSueldo Bruto: "+this.sueldoBruto;
        if (edad!=0) {
            descripcionEmpleado+="\nEdad: "+this.edad;
        }
        if (this.telefono!=null) {
            descripcionEmpleado+="\nTelefono: "+this.telefono;
        }
        if (this.direccion!=null) {
            descripcionEmpleado+="\nDireccion: "+this.direccion;
        }
        return descripcionEmpleado;
    }
       
    public String mostrarDatosSimplificadosEmpleado(){
        return "Nombre: "+this.nombre+"\nDNI: "+this.DNI+"\nSueldo Bruto: "+this.sueldoBruto+"\nSueldo neto: "+
                this.calcularSueldoNeto();
    }
    public double calcularSueldoNeto(){
        double sueldoBrutoMensual=this.sueldoBruto/12;
        if(this.sueldoBruto<12000) return sueldoBrutoMensual-((sueldoBrutoMensual/100)*20);
        else if (this.sueldoBruto<25000) return sueldoBrutoMensual-((sueldoBrutoMensual/100)*30);
        else return sueldoBrutoMensual-((sueldoBrutoMensual/100)*40);
    }
}
