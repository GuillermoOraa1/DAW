/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.Ejercicio5;

import java.util.ArrayList;

/**
 *
 * @author DAW
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado persona1=new Empleado("Pedro", "507607",27000.0);
        Empleado persona2=new Empleado("Antonio", "777666",18000.0);
        Empleado persona3=new Empleado("Ana", "1111222",21000.0);
        Empleado persona4=new Empleado("Jose", "44443333",38000.0);
        Empresa empresa1=new Empresa("Maercisa","506111111","915443322", "Calle Pez 23");
        
        System.out.println("Mostrar datos de un empleado sin toda la informacion");
        System.out.println(persona1.mostrarDatosEmpleado());
        
        /*Creo la empresa y le meto el array de empleados*/
        ArrayList empleados=new ArrayList();
        persona1.setTelefono("918883322");
        persona1.setDireccion("Plaza mayor 40");
        persona1.setEdad(40);
        persona2.setTelefono("957776600");
        persona2.setDireccion("Calle Menor 50");
        persona2.setEdad(30);
        empleados.add(persona1);
        empleados.add(persona2);
        empresa1.setEmpleados(empleados);
        
        System.out.println("Mostrar datos de un empleado con toda la informacion");
        System.out.println(persona1.mostrarDatosEmpleado());
        
        System.out.println("Mostrar informacion completa de empleados");
        empresa1.mostrarInformacionEmpleados();
        /*metemos empleados en la empresa*/
        empresa1.anadirEmpleados(persona3);
        empresa1.anadirEmpleados(persona4);
        
        System.out.println("Mostrar informacion limitada empleados");
        empresa1.mostrarInformacionSimplificadaEmpleados();
        
        empresa1.quitarEmpleado(persona4);
        System.out.println("Mostrar informacion limitada empleados despues de quitar a Jose");
        empresa1.mostrarInformacionSimplificadaEmpleados();
        
        System.out.println("Calcular totalidad sueldos brutos");
        System.out.println(empresa1.calcularTotalidadSueldosBrutos());
        System.out.println("Calcular sueldos neto empleado1");
        System.out.println(persona1.calcularSueldoNeto());
        System.out.println("Calcular sueldos neto empleado2");
        System.out.println(persona2.calcularSueldoNeto());
        System.out.println("Calcular totalidad sueldos netos");
        System.out.println(empresa1.calcularTotalidadSueldosNetos());
    }
    
}
