/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2VersionClase;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio2CorreccionClase {

    /**
     * @param args the command line arguments
     */
    static Scanner sc= new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        EjecutarMenu();
        
    }
    
    public static void EjecutarMenu(){
        int opcion;
        do {
            opcion= menu();
            switch (opcion) {
                case 1:
                    System.out.println("El perimetro es "+perimetro(pideLado()));
                    break;
                case 2:
                    System.out.println("El area es "+area(pideLado()));
                    break;
                case 3:
                    System.out.println("FIN");
                    break;             
                default:
                    System.out.println("Esa opcion no existe");;
            }
        } while (opcion!=3);    
    }
    
    public static int menu(){
        Scanner sc1= new Scanner(System.in);
        int opcion;
        System.out.println("Seleccione una opcion: \n1.Perimetro\n2.Area\n3.Salir del Programa");
        if (sc1.hasNextInt()) {
            opcion=sc1.nextInt();
        }else{
            System.out.println("No se puede meter una letra");
            opcion=menu();
        }
        return opcion;
    }
    
    public static double pideLado(){
        return 3;
    }
    
    public static double area(double l){
        return 3.0;
    }
    
    public static double perimetro(double l){
        return 3.0;
    }
    
}
