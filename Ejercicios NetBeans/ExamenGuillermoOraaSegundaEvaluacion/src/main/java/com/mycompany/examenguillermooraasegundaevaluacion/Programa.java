/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examenguillermooraasegundaevaluacion;

import java.text.ParseException;

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
        try{
            /*Crea varias alumnas, profesoras y los dos grupos*/
            Alumna alumna0= new Alumna("G123456");
            Alumna alumna1= new Alumna("Gabriela","912223344","G123456",12);  
            Alumna alumna2= new Alumna("Camila","916665577","C123456",2);           
            Alumna alumna3= new Alumna("Raquel","918887766","R123456",0);         
            Alumna alumna4= new Alumna("María","915556677","M123456",5);            
            Alumna alumna5= new Alumna("Estela","912227744","E123456",9);       
            Alumna alumna6= new Alumna("Diana","911112233","C123456",1);
            Alumna alumna7= new Alumna("Daniela","919994433","L123456",5);
            Alumna alumna8= new Alumna("Yvonne","915554477","Y123456",7);
            
            Profesora profesora1=new Profesora("67683475C","Cristina","912226677",10);
            Profesora profesora2=new Profesora("64423405R","Raquel","914442299",5);
            
            
            Grupo DAW1= new Grupo("DAW1","12/03/2016",profesora1);
            Grupo ASIR1= new Grupo("ASIR1","12/03/2016",profesora2);
            
            
            System.out.println("AÑADIMOS ALUMNAS Y CAMBIAMOS LAS TUTORAS A LOS GRUPOS");
            DAW1.setTutora(profesora2);
            ASIR1.setTutora(profesora1);
            DAW1.anadirAlumna(alumna1);
            DAW1.anadirAlumna(alumna2);
            DAW1.anadirAlumna(alumna3);
            DAW1.anadirAlumna(alumna4);
            ASIR1.anadirAlumna(alumna5);
            ASIR1.anadirAlumna(alumna6);
            ASIR1.anadirAlumna(alumna7);
            ASIR1.anadirAlumna(alumna8);
            
            System.out.println("AÑADIMOS A UN GRUPO UNA ALUMNA QUE YA EXISTE EN ESE GRUPO");
            ASIR1.anadirAlumna(alumna5);
            
            System.out.println("MOSTRAMOS TODA LA INFORMACION DE UN GRUPO");
            System.out.println(ASIR1.mostrarDatosGrupo());
            
            System.out.println("MOSTRAR LOS NUMEROS DE LAS ALUMNAS DE UN GRUPO");
            System.out.println(ASIR1.mostrarNumerosDeAlumnas());
            
            System.out.println("ELIMINAMOS UNA ALUMNA DE UN GRUPO. PRIMERO LO HACEMOS CON UNA ALUMNA QUE NO ESTA EN EL GRUPO"
                    + "Y LUEGO CON UNA ALUMNA QUE SI ESTA");
            ASIR1.eliminarAlumna(alumna4);
            ASIR1.eliminarAlumna(alumna5);
            
            System.out.println("CAMBIAMOS LA TUTORA DE UN GRUPO");
            ASIR1.setTutora(profesora2);
            
            System.out.println("MOSTRAMOS TODA LA INFORMACION DE UN GRUPO PARA QUE SE VEA QUE HEMOS CAMBIADO A LA TUTORA"
                    + "Y ELIMINADO UNA ALUMNA");
            System.out.println(ASIR1.mostrarDatosGrupo());
            
            System.out.println("MOSTRAMOS LAS ALUMNAS DE DAW1 QUE TIENEN MAS DE TRES SOBRESALIENTES");
            System.out.println(DAW1.listaAlumnasConNSobresalientes(3));
            
            System.out.println("MUESTRA LA MEDIA DE SOBRESALIENTES DE ASIR1");
            System.out.printf("La media(total sobresalientes/nº de alumnas) es: %.1f",ASIR1.calcularMediaSobresalientes());
           
            System.out.println("\nINTENTAMOS CREAR UNA ALUMNA CUYO NUMERO NO CUMPLA LOS REQUISITOS");
            Alumna alumna9= new Alumna("Yvonne","915554477","123456Y",9);
            
            
        }catch(ExcepcionPatron e){
            System.out.println(e.getMessage());
        }catch(ParseException e){
            System.out.println(e.getMessage());
        }

        
    }
    
}