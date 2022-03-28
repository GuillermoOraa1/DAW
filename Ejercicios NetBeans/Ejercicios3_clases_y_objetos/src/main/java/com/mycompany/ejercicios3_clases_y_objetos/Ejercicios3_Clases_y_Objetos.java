/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios3_clases_y_objetos;

/**
 *
 * @author DAW
 */
public class Ejercicios3_Clases_y_Objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ejercicios3_Clases_y_Objetos.CambioTienda(20.56, 21.00);
        Ejercicios3_Clases_y_Objetos.DiasSemana('m');
        Figura figura1=new Figura(3);
        Figura figura2=new Figura(4);
        Ejercicios3_Clases_y_Objetos.EvaluarFiguras(figura1, figura2);      
    }
    /*
    Escribimos un programa que se ejecutará en el ordenador de una caja de una tienda. Tiene que escribir un método 
    que reciba el total de la compra efectuada y el importe que entrega el cliente. El método mostrará por pantalla 
    "falta importe" cuando la cantidad entregada sea inferior al total de la compra. "Gracias por su compra" si el 
    importe entregado es exacto al de la compra. Y, "su cambio es X", donde X es el cambio a devolver si la cantidad 
    entregada supera al total de la compra.
    */
    private static void CambioTienda(double factura,double dineroPagado){
        if (factura>dineroPagado) {
            System.out.println("Falta importe");
        }else if (factura==dineroPagado){
            System.out.println("Gracias por su compra");
        }else{
            System.out.printf("Su cambio es %.2f.\n", dineroPagado-factura);
            System.out.println("");
        }
    }
    
   /*Escribir un método que reciba la inicial del día de la semana (L,M,X,J,V,S,D) y devuelva el nombre completo del día.*/
    private static void DiasSemana(char inicial){
        String iniciales=String.valueOf(inicial).toUpperCase();
        switch (iniciales) {
            case "L":
                System.out.println("Lunes");
                break;
            case "M":
                System.out.println("Martes");
                break;
            case "X":
                System.out.println("Miercoles");
                break;
            default:
                System.out.println("No hay un dia con esa inicial");
                throw new AssertionError();
        }
    }
    
    /*Dados dos objetos Figura, donde simplemente, una figura está representada por el número de lados. Crear un 
      método que reciba dos objetos de la clase Figura y determine si son iguales. Vamos a suponer que dos figuras 
      son iguales si tienen el mismo número de lados.
    */
    private static void EvaluarFiguras(Figura figura1, Figura figura2){
        if (figura1.getNumeroLados()==figura2.getNumeroLados()) System.out.println("Las figuras son iguales");
        else System.out.println("Las figuras no son iguales");  
    }
    
    /*programa que imprime los números múltiplos de cuatro menores que 100 (incluido el 100):*/
    private static void ImprimirMultiplosCuatro(){
        int x = 0;
        do {
            if (x%4==0) {
                System.out.printf("%s es multiplo de 4",x); 
            }
            x+=1;
        } while (x<101);
        
    }
    /*transformamos un for "for( a=0,b=0; a < 7; a++,b+=2 )" en un bucle while*/
    private static void CambiarBucle(){
        int a=0;
        int b=0;
        while (a<7) {
            a++;
            b+=2;
            System.out.println(a+"-"+b);
        }
    }
}
