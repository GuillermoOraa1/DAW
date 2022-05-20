/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here     
        
        Scanner sc= new Scanner(System.in);
        int numeroAlumnos;int numeroBombones;int bombones;
        HashMap<String, Integer> alumnosBombones = new HashMap<String, Integer>();
        String linea; String nombreAlumno;
        String[] lineas;
        RandomAccessFile alumnos = null;
        System.out.println("¿Cuantos alumnos juegan?");
        numeroAlumnos=sc.nextInt();
        System.out.println("¿Cuantos bombones como máximo puede tener cada alumno?");
        numeroBombones=sc.nextInt();
        try{
            File ficheroAlumnos = new File("sources\\participants.csv");
            alumnos = new RandomAccessFile(ficheroAlumnos, "r");
            for (int i = 0; i <=numeroAlumnos; i++) {
                
              long posicionNombres=(long) (Math.random()*(alumnos.length()));
              alumnos.seek(posicionNombres);
              alumnos.readLine();
              linea= alumnos.readLine();           
              System.out.println(linea);
              bombones= (int)(Math.random()* numeroBombones);
              alumnosBombones.put(linea,bombones);
              alumnos.seek(0);
            }
            alumnos.close();
            for (String i : alumnosBombones.keySet()) {
                System.out.println("Alumno: " + i + " bombones: " + alumnosBombones.get(i));
            }
            buscarAlumno(alumnosBombones); //esto no funciona por que no soy capaz de meter correrectamente el nombre del alumno
            
        }catch(FileNotFoundException f){
            f.getMessage();
        }catch(IOException f){
            f.getMessage();
        }catch(NoHayBombonesParaTiExcepcion b){
            b.getMessage();
        } 

        
    }
    
    public static void buscarAlumno(HashMap<String, Integer>lista)throws NoHayBombonesParaTiExcepcion{
        Scanner sc= new Scanner(System.in);
        System.out.println("¿Que alumno quieres buscar?");
        String nombreAlumno=sc.next();
        if(lista.get(nombreAlumno)!=null){
            System.out.println("El numero de bombones de "+nombreAlumno+" es de "+lista.get(nombreAlumno));
        }else{
            throw new NoHayBombonesParaTiExcepcion();
        }
    }
    
}
