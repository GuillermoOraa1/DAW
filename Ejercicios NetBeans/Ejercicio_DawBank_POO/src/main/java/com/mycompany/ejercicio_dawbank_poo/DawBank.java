package com.mycompany.ejercicio_dawbank_poo;



import java.util.Scanner;

/**
* Esta es la clase principal desde el cual operamos con las clases CuentaBancaria y Movimiento.
* @author Guillermo
* @version 1.0
* @see CuentaBancaria
* */
public class DawBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        EjecutarMenu();
	}
	 /**
	 * Metodo que define el menu de opciones que puede seleccionar el usuario.
         * @see DawBank#menu() 
	 * */
	 public static void EjecutarMenu(){
		    Scanner sc= new Scanner(System.in);
		    int opcion;
		    double cantidad;
                    try{
                        CuentaBancaria cliente1=new CuentaBancaria("ES6621000418403334567891","Jorge Perez Lopez");		    
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
                    
                    }catch (ExcepcionIban e){
                        System.out.println(e.getMessage());
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
        }
		    
		    
	 /**
	 * Metodo que muestra al usuario las opciones del menu que puede seleccionar.
         * @return Devuelve un int con la opcion seleccionada por el usuario.
         * @see DawBank#EjecutarMenu()
	 * */	    
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
