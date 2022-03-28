/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.EjercicioDawBank;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class DawBank {
    
    public static void main(String[] args) {
        // TODO code application logic here
        EjecutarMenu();
    }
    
/*TODO*/
 public static void EjecutarMenu(){
    Scanner sc= new Scanner(System.in);
    int opcion;
    double cantidad;
    CuentaBancaria cliente1=new CuentaBancaria("ES6621000418401234567891","Jorge Pérez López");
    do {
        opcion= menu();
        switch (opcion) {
            case 1:
                System.out.println(cliente1.datosCuenta());
                break;
            case 2:
                System.out.println("Indique la cantidad que quiere ingresar");
                cantidad=sc.nextDouble();
                cliente1.Ingresar(cantidad);
                break;
            case 3:
                System.out.println("Indique la cantidad que quiere retirar");
                cantidad=sc.nextDouble();
                cliente1.Retirar(cantidad);
                break;  
            case 4:
                cliente1.imprimirMovimientos();
                break;  
            case 5:
                System.out.println("FIN");
                break;                   
            default:
                System.out.println("Esa opcion no existe");;
        }
    } while (opcion!=5);    
}
    
    
    
    public static int menu(){
    Scanner sc1= new Scanner(System.in);
    int opcion;
    System.out.println("Seleccione una opcion: \n1.Mostrar Saldo.\n2.Ingresar dinero\n3.Retirar dinero\n4.Mostrar movimientos\n5.Salir");
    if (sc1.hasNextInt()) {
        opcion=sc1.nextInt();
    }else{
        System.out.println("No se puede meter una letra");
        opcion=menu();
    }
    return opcion;
    }
}
