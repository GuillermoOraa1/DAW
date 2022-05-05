/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.Ejercicio2B;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio2BMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejercicio2BMain.mostrarDatosDelAlumno();
    }
    
    public static void mostrarDatosDelAlumno(){
        File FicheroDatosDeLosAlumnos= new File("sources\\DatosParaEjerciciosFicheros-2\\alumnos_notas.txt");     
        Scanner datosDeLosAlumnos=null;
        try{
            datosDeLosAlumnos= new Scanner(FicheroDatosDeLosAlumnos);
            double notaMedia=0;
            ArrayList<String[]> lineas= new ArrayList<String[]>();
            ArrayList<Alumno>alumnos= new ArrayList<Alumno>();
            while(datosDeLosAlumnos.hasNext()){ 
                lineas.add(datosDeLosAlumnos.nextLine().split(" "));
            }
            
            for (int x = 0; x < lineas.size(); x++) {
                for (int i = 2; i < lineas.get(x).length; i++) {
                    notaMedia+=Double.parseDouble(lineas.get(x)[i]);          
                }
                alumnos.add(new Alumno(lineas.get(x)[0], lineas.get(x)[1], (notaMedia/(lineas.get(x).length-2))));
                notaMedia=0;
            } 
            alumnos.sort(new Comparator<Alumno>(){
                public int compare(Alumno a1, Alumno a2) {
                    if (a1.getNotaMedia()>a2.getNotaMedia()) return -1;
                    if (a1.getNotaMedia()<a2.getNotaMedia()) return 1; 
                    return 0;                   
                }
            });
            
            for(Alumno alumno:alumnos){
                //System.out.println(alumno.getNombre()+" "+alumno.getApellido()+" "+alumno.getNotaMedia());
                System.out.printf("%s %s: %.2f\n",alumno.getNombre(),alumno.getApellido(),alumno.getNotaMedia());
            }
        
        }catch(FileNotFoundException f){
            f.getMessage();
        } finally{
            datosDeLosAlumnos.close();
        }
    }
}
