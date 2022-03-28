/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Ejercicio5;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 *
 * @author DAW
 */
public class Empresa {
    private String nombre;
    private String CIF;
    private String telefono;
    private String direccion;
    private ArrayList <Empleado> empleados= new ArrayList <Empleado>();
    
    public Empresa(String nombre, String CIF, String telefono, String direccion){
        this.nombre=nombre;
        this.CIF=CIF;
        this.telefono=telefono;
        this.direccion=direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCIF() {
        return CIF;
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

    public ArrayList getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList empleados) {
        this.empleados = empleados;
    }
    
    public void anadirEmpleados(Empleado empleado1){
        this.empleados.add(empleado1);
    }
    
    public void quitarEmpleado(Empleado empleado1){
       if(this.empleados.remove(empleado1)){
           System.out.println("Empleado eliminado.");
       }else System.out.println("No se ha encontrado el empleado."); 
    }
    
    public void mostrarInformacionEmpleados(){
        /*
        for(int i=0; i<this.empleados.size();i++){
            ((Empleado)this.empleados.get(i)).mostrarDatosEmpleado();
        }
        */
        this.empleados.stream().map(a->((Empleado)a).mostrarDatosEmpleado()).forEach(a->System.out.println(a));
    }
    
    public void mostrarInformacionSimplificadaEmpleados(){
        /*
        for(int i=0; i<this.empleados.size();i++){
            ((Empleado)this.empleados.get(i)).mostrarDatosSimplificadosEmpleado();
        }
        */
        this.empleados.stream().map(a->((Empleado)a).mostrarDatosSimplificadosEmpleado()).forEach(a->System.out.println(a));
    }
    
    public double calcularTotalidadSueldosBrutos(){
        /*
        double total=0
        for(int i=0; i<this.empleados.size();i++){
            total+=((Empleado)this.empleados.get(i)).getSueldoBruto();
        }
        return total;
        */
        return this.empleados.stream().mapToDouble(a->((Empleado)a).getSueldoBruto()).sum();
    }
    
    public double calcularTotalidadSueldosNetos(){
        /*
        double total=0; 
        for(int i=0; i<this.empleados.size();i++){
            total+=((Empleado)this.empleados.get(i)).calcularSueldoNeto();
        }
        return total;
        */
        return this.empleados.stream().mapToDouble(a->((Empleado)a).calcularSueldoNeto()).sum();
        
    }
}
