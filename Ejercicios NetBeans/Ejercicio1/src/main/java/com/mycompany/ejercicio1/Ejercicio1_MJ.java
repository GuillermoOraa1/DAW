/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicio1;
import java.util.Scanner;
import java.time.*;

/**
 *
 * @author DAW
 */
public class Ejercicio1_MJ {

    /**
     * @param args the command line arguments
     */
    private static Scanner sc= new Scanner(System.in);  
    public static void main(String[] args) {

        // Escribe un programa que lea una calificación numérica entre 0 y 10 y la transforma en
        //calificación alfabética, escribiendo el resultado.
        //de 0 a <3 Muy Deficiente, de 3 a <5 Insuficiente,de 5 a <6 Bien,de 6 a <9 Notable,de 9 a 10 Sobresaliente
//        System.out.println("Escriba la calificación:");
//        int calificacion = sc.nextInt();
//        Ejercicio1_MJ.Calificar(calificacion);
        // Escribe un programa que recibe como datos de entrada una hora expresada en horas, minutos y
        //segundos que nos calcula y escribe la hora, minutos y segundos que serán, transcurrido un
        //segundo.
//        System.out.println("Escriba la hora en formato HH:MM:SS");
//        String hora=sc.nextLine();
//        Ejercicio1_MJ.PasarHora(hora);

        //Escribe un programa que calcula el salario neto semanal de un trabajador en función del
        //número de horas trabajadas y la tasa de impuestos de acuerdo a las siguientes hipótesis:
//        • Las primeras 35 horas se pagan a tarifa normal.
//        • Las horas que pasen de 35 se pagan a 1,5 veces la tarifa normal.
//        • Las tasas de impuestos son:
//        • Los primeros 500 euros son libres de impuestos.
//        • Los siguientes 400 tienen un 25% de impuestos.
//        • Los restantes un 45% de impuestos.
//        Escribir nombre, salario bruto, tasas y salario neto.
//        System.out.println("El sueldo por hora es de 20 euros");
//        System.out.println("Escriba el nombre del trabajador");
//        String nombre=sc.nextLine();
//        System.out.println("Escriba las horas trabajadas");
//        int horas=sc.nextInt();
//        Ejercicio1_MJ.CalcularSalario(nombre, horas);

        //Ejercicio de Enums con la clase Vehiculo
        
//        Vehiculo coche1= new Vehiculo("222",MarcaDeVehiculo.RENAULT);
//        System.out.println("EXITO");
//        coche1.ToString();
    }
    
    
    private static void CalcularSalario(String nombre,int horas){
        double sueldoPorEncimaDe500,sueldo,neto,sueldoPorEncimaDe900;
        System.out.printf("El nombre del trabajador es %s.\n",nombre);
        if (horas<=35 && horas*20<=500) {
            System.out.printf("El sueldo bruto es %s y no se pagan tasas.",horas*20);
        }
        else if (horas<=35 && horas*20>500){
            sueldoPorEncimaDe500=horas*20-500;
            sueldoPorEncimaDe500=sueldoPorEncimaDe500-(sueldoPorEncimaDe500*0.25);
            neto=500+sueldoPorEncimaDe500;
            System.out.printf("El sueldo bruto es %s, se paga una tasa del 25 por ciento a partir de los 500 euros y\n el sueldo neto es %s.",horas*20,neto);
        }else if(horas>35 && (((horas-35)*30)+(horas*20))<900){
            sueldo= (horas-35)*30+(35*20);
            sueldoPorEncimaDe500=sueldo-500;
            sueldoPorEncimaDe500=sueldoPorEncimaDe500-(sueldoPorEncimaDe500*0.25);
            neto=500+sueldoPorEncimaDe500;
            System.out.printf("El sueldo bruto es %s, se paga una tasa del 25 por ciento a partir de los 500 euros y\n el sueldo neto es %s.",sueldo,neto);
        }else{
            sueldo= (horas-35)*30+(35*20);
            sueldoPorEncimaDe500=sueldo-500;
            sueldoPorEncimaDe500=sueldoPorEncimaDe500-(sueldoPorEncimaDe500*0.25);
            sueldoPorEncimaDe900=sueldo-900;
            sueldoPorEncimaDe900=sueldoPorEncimaDe900-(sueldoPorEncimaDe900*0.45);
            neto=500+sueldoPorEncimaDe500+sueldoPorEncimaDe900;
            System.out.printf("El sueldo bruto es %s, se paga una tasa del 25 por ciento a partir de los 500 euros y\n de 45 por ciento a partir de los 900 euros y el sueldo neto es %s.",sueldo,neto);
        }
    }
    
    private static void PasarHora(String hora){
        LocalTime hoy =LocalTime.parse(hora);
        System.out.println(hoy.plusSeconds(10));
        
    }
    private static void Calificar(int calificacion){
        if (calificacion<3) {
            System.out.println("Muy deficiente");
        }else if(calificacion>=3 & calificacion<5){
            System.out.println("Insuficiente");
        }else if (calificacion>=5 && calificacion<6){
            System.out.println("Bien");
        }else if (calificacion>=6 & calificacion<9){
            System.out.println("Notable");
        }else{
            System.out.println("Sobresaliente");
        }
            
    }
}
