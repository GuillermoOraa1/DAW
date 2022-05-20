/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ejercicio1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc= new Scanner(System.in); 
        System.out.println("Introduzca el nombre del archivo");
        String nombreArchivo=sc.nextLine();
        String ruta="sources\\tenerife\\"+nombreArchivo;
        try{
            File archivoTemperatura= new File(ruta);
            Scanner datosTemperaturas= new Scanner(archivoTemperatura);
            ArrayList<String[]> lineas= new ArrayList<String[]>();
            while(datosTemperaturas.hasNext()){ 
                lineas.add(datosTemperaturas.nextLine().split(" "));
            } 
            temperaturaMaxima(lineas);
            temperaturaMinima(lineas);
            temperaturaMaximaMedia(lineas);
            temperaturaMinimaMedia(lineas);
            temperaturaMedia(lineas);
            mayorDiferenciaTemperatura(lineas);
        }catch(FileNotFoundException f){
            f.getMessage();
        }
    }
    
    public static void temperaturaMaxima(ArrayList<String[]> lineas){
        ArrayList<String> temperaturasMaximas=new ArrayList<String>();
        for (int x = 0; x < lineas.size(); x++) {
            String[]linea=lineas.get(x);
            temperaturasMaximas.add(linea[1]);
            Collections.sort(temperaturasMaximas);
        }
        System.out.println("La temperatura maxima las alta y la mas baja son        "
                + ""+temperaturasMaximas.get(temperaturasMaximas.size()-1)+"        "+temperaturasMaximas.get(0));
    }

    public static void temperaturaMinima(ArrayList<String[]> lineas){  
        ArrayList<String> temperaturasMinimas=new ArrayList<String>();
        for (int x = 0; x < lineas.size(); x++) {
            String[]linea=lineas.get(x);
            temperaturasMinimas.add(linea[2]);
            Collections.sort(temperaturasMinimas);
        }
        System.out.println("La temperatura minima mas alta y la mas baja son        "
                + ""+temperaturasMinimas.get(temperaturasMinimas.size()-1)+"        "+temperaturasMinimas.get(0));
          
    } 
    
    public static void temperaturaMaximaMedia(ArrayList<String[]> lineas){
        ArrayList<String> temperaturasMaximas=new ArrayList<String>();
        double sumaTemperaturas=0;
        for (int x = 0; x < lineas.size(); x++) {
            String[]linea=lineas.get(x);
            temperaturasMaximas.add(linea[1]);
        }
        for (int i = 0; i < temperaturasMaximas.size(); i++) {
            sumaTemperaturas+=Double.valueOf(temperaturasMaximas.get(i));
        }
        System.out.printf("La temperatura maxima media (suma "
                + "de maximas/dias)      %.2f",sumaTemperaturas/temperaturasMaximas.size());
    }
    
    public static void temperaturaMinimaMedia(ArrayList<String[]> lineas){
        ArrayList<String> temperaturasMinimas=new ArrayList<String>();
        double sumaTemperaturas=0;
        for (int x = 0; x < lineas.size(); x++) {
            String[]linea=lineas.get(x);
            temperaturasMinimas.add(linea[2]);
        }
        for (int i = 0; i < temperaturasMinimas.size(); i++) {
            sumaTemperaturas+=Double.valueOf(temperaturasMinimas.get(i));
        }
        System.out.printf("\nLa temperatura minima media (suma "
                + "de maximas/dias)      %.2f",sumaTemperaturas/temperaturasMinimas.size());
    }

    public static void temperaturaMedia(ArrayList<String[]> lineas){
        ArrayList<String> temperaturasMaximas=new ArrayList<String>();
        double sumaTemperaturasMaximas=0;
        for (int x = 0; x < lineas.size(); x++) {
            String[]linea=lineas.get(x);
            temperaturasMaximas.add(linea[1]);
        }
        for (int i = 0; i < temperaturasMaximas.size(); i++) {
            sumaTemperaturasMaximas+=Double.valueOf(temperaturasMaximas.get(i));
        }
        
        ArrayList<String> temperaturasMinimas=new ArrayList<String>();
        double sumaTemperaturasMinimas=0;
        for (int x = 0; x < lineas.size(); x++) {
            String[]linea=lineas.get(x);
            temperaturasMinimas.add(linea[2]);
        }
        for (int i = 0; i < temperaturasMinimas.size(); i++) {
            sumaTemperaturasMinimas+=Double.valueOf(temperaturasMinimas.get(i));
        }
        double total=(sumaTemperaturasMaximas/temperaturasMaximas.size())+(sumaTemperaturasMinimas/temperaturasMaximas.size());
        System.out.printf("\nLa temperatura intermedia de las dos medias anteriores"
                + "  %.2f",(total)/2);
    }
    
    public static void mayorDiferenciaTemperatura(ArrayList<String[]> lineas){
        String fecha="";
        double temperaturaMaxima=0;
        double temperaturaMinima=0;
        for (int x = 0; x < lineas.size(); x++) {
            String[]linea=lineas.get(x);
            if((Double.valueOf(linea[1])-Double.valueOf(linea[2]))>(temperaturaMaxima-temperaturaMinima)){
                temperaturaMaxima=Double.valueOf(linea[1]);
                temperaturaMinima=Double.valueOf(linea[2]);
                fecha=linea[0];
            }
        }
        System.out.printf("\nMayor diferencia de temperatura en un mismo dia         "
                + "%.2f      %s",(temperaturaMaxima-temperaturaMinima),fecha);
    }
}
