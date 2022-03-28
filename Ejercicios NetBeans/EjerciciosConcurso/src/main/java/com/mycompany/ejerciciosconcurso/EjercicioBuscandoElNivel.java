/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejerciciosconcurso;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class EjercicioBuscandoElNivel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        	Scanner sc= new Scanner(System.in);
		int desplazamiento=0,numeroPruebas=0;
		System.out.println("Escribe los datos");
		String caso=sc.nextLine();
		String[]casos=caso.split(" ");
		int niveles=Integer.parseInt(casos[0]);
		if(niveles<=100 && niveles>=1)
		{
			do {
				System.out.println("Escribe el numero de pruebas");
				numeroPruebas=sc.nextInt();
				if(numeroPruebas>1 && numeroPruebas<10000)
				{
					for(int i=0;i<numeroPruebas;i++) {
						System.out.println("Escribe el ultimo nivel cargado");
						int valor1=sc.nextInt();
						System.out.println("Escribe el nivel a cargar");
						int valor2=sc.nextInt();
						if (valor1>=1 &&valor2>=1 && valor1<=niveles && valor2<=niveles)
						{
							if(valor2>valor1) {
								for(int x=valor1+1;x<valor2;x++) {
									desplazamiento+=Integer.parseInt(casos[x]);
								}
								System.out.println("Desplazamiento: "+desplazamiento);
								desplazamiento=0;
							}else {
								for(int x=valor1;x>=valor2;x--) {
									desplazamiento-=Integer.parseInt(casos[x]);
								}
								System.out.println("Desplazamiento: "+desplazamiento);
								desplazamiento=0;			
							}
						}else {
							System.out.println("El valor de los niveles no es correcto");
						}

					}
					System.out.println("---");
				}else {
					System.out.println("El número de pruebas no es correcto");
				}

			} while(numeroPruebas!=0);
			
		}else {
			System.out.println("El número de niveles no es correcto");
		}
    }
    
}
