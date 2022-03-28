
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author DAW
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        /*Funcion que dado el precio de un artículo y el precio de venta real nos muestre el
        porcentaje de descuento realizado.*/
        /*
;
        System.out.println("Escribe el precio del articulo");
        double precioArticulo=sc.nextDouble();
        System.out.println("Escribe el precio original del articulo");
        double precioReal=sc.nextDouble();
        int descuento=Ejercicio1.CalcularDescuentos((float)precioArticulo, (float)precioReal);
        System.out.println(descuento);
        */
        
        /*procedimiento que lea un valor correspondiente a una distancia en millas marinas y
        escriba la distancia en metros. Sabiendo que una milla marina equivale a 1.852 metros.*/
        /*
         System.out.println("Escriba una distancia en millas.");
        double millas=sc.nextDouble();
        double metros=Ejercicio1.CalcularMillas(millas);
        System.out.println(String.format("La distancia es de %s kilometros",metros));

        */
               
        /*calcular el coste del viaje de fin de curso con una funcion que recibe el numero de alumnos*/
        /*
        System.out.println("Escriba el numero de alumnos.");  
        int alumnos=sc.nextInt();
        Ejercicio1.CalcularPrecioViaje(alumnos);
        */
        //costo por el servicio de transporte se basa en el peso del paquete y la zona a la que va dirigido.
//        System.out.println("Escribe el peso del paquete");
//        float peso=sc.nextFloat();
//        System.out.println("Escribe la zona a la que se envia");
//        int zona = sc.nextInt();
//        Ejercicio1.CalcularPrecioEnvio(peso, zona);

        //. Escribe un programa que lee dos números, calcula y muestra el valor de su suma, resta,
        //producto y división. (Ten en cuenta la división por cero).
//        System.out.println("Escriba un número");
//        int num1=sc.nextInt();
//        System.out.println("Escriba un número");
//        int num2=sc.nextInt();
//        Ejercicio1.CalcularOperaciones(num1, num2);
        //Escribe un programa que lee 2 números y muestra el mayor y nos diga si uno de los números es negativo
//        System.out.println("Escriba un número");
//        int num1=sc.nextInt();  
//        System.out.println("Escriba un número");
//        int num2=sc.nextInt();
//        Ejercicio1.ExaminarNumeros(num1, num2);
        //Escribe un programa que lea tres números distintos y nos diga cuál es el mayor.
//        System.out.println("Escriba un número:");
//        int num1=sc.nextInt();
//        System.out.println("Escriba un número:");
//        int num2=sc.nextInt();
//        System.out.println("Escriba un número:");
//        int num3=sc.nextInt();
//        int[] numeros= new int[3];
//        numeros=Ejercicio1.OrdenarNumeros(num1, num2, num3);
//        for (int numero : numeros) {
//            System.out.println(numero);
//        }
//        System.out.printf("El mayor es %s",numeros[2]);

    }
    
    private static int[] OrdenarNumeros(int num1,int num2, int num3){
        int[] numeros= new int[] {num1,num2,num3};
        Arrays.sort(numeros);
    return numeros;
    }
    private static void ExaminarNumeros(int num1, int num2){
        if (num1<=num2) {
            System.out.printf("El número mayor es %s",num1);
        }else{
            System.out.printf("El número mayor es %s",num2);
        }
        if (num1<=0 || num2<=0) {
            System.out.println("Uno de los valores es negativo.");
        }
    }
    private static void CalcularOperaciones(int num1, int num2){
        System.out.printf("La suma es %s",num1+num2);
        System.out.printf("La resta es %s", num1-num2);
        System.out.printf("La multiplicación es %s", num1*num2);
        if (num2==0) {
            System.out.println("No se puede hacer la división con un divisor 0.");
        }else{
           System.out.printf("La division es %s",num1/num2); 
        }       
    }
    public static int CalcularDescuentos(float num1, float num2){
        System.out.println(String.format("El total descontado es %s",num2-num1));
        int descuento=(int)((num2-num1)/num2)*100;
        return descuento;
    }
    
    public static double CalcularMillas(double millas){
        int metros=(int)(millas*1.852);
        return metros;
    }
    
    public static void CalcularPrecioViaje(int alumnos){
        if (alumnos>100) {
            System.out.println(String.format("El coste es %s euros.", alumnos*65));
        }
        else if(alumnos>50&&alumnos<99){
            System.out.println(String.format("El coste es %s euros.", alumnos*70));
        }
        else if (alumnos>30&&alumnos<49) {
            System.out.println(String.format("El coste es %s euros.", alumnos*95));
        }
        else{
            System.out.println("El coste es de 4000 euros");
        }
    }
    private static void CalcularPrecioEnvio(float peso, int zona){
      switch (zona)
      {
        case 1:
            System.out.printf("El precio es: %.2f", peso*24);
            break;
        case 2:
            System.out.printf("El precio es: %.2f", peso*20);
            break;
        case 3:
            System.out.printf("El precio es: %.2f", peso*21);
            break;
        case 4:
            System.out.printf("El precio es: %.2f", peso*10);
            break;
        case 5:
            System.out.printf("El precio es: %.2f", peso*18);
      }
              
    }
}
