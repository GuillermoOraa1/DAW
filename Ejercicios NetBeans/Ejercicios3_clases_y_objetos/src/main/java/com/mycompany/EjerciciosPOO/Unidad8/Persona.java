/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.EjerciciosPOO.Unidad8;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Persona {
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    
    public Persona(){}
    
    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void pedirDatos(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Escriba el nombre");
        this.nombre=sc.nextLine();
        System.out.println("Escriba los apellidos");
        this.apellidos=sc.nextLine();
        System.out.println("Escriba el DNI");
        this.dni=sc.nextLine();
        System.out.println("Escriba la edad");
        this.edad=sc.nextInt();
    }
    public void imprimirMensaje(){
        if (this.edad>=18) System.out.printf("%s %s con DNI %s es mayor de edad",this.nombre,this.apellidos,this.dni); 
        else System.out.printf("%s %s con DNI %s es menor de edad",this.nombre,this.apellidos,this.dni); 
    }
}
