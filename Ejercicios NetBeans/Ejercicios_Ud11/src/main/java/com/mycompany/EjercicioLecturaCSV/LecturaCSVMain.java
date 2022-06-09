/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.EjercicioLecturaCSV;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import static java.util.stream.Collectors.toMap;
import java.util.stream.Stream;

/**
 *
 * @author DAW
 */
public class LecturaCSVMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc;
        ArrayList<Intervencion>intervenciones=new ArrayList<Intervencion>();
        try{
           String ruta=System.getProperty("user.dir");           
           File ficheroBomberos= new File(ruta+File.separator+"sources"+File.separator+"Bomberos");          
           File[]lista=ficheroBomberos.listFiles();
           for(File archivo:lista){
              File ficheroBomberosPorAno= new File(archivo.getPath());
              if (ficheroBomberosPorAno.exists()){
                sc= new Scanner(ficheroBomberosPorAno);
                sc.useDelimiter(",");
                while(sc.hasNext()){
                  String[]linea=sc.nextLine().split(";");
                  if(linea.length>2){
                    if(!linea[9].equals("SERVICIOS VARIOS")){ 
                      Intervencion intervencion= new Intervencion(linea[0],linea[1],linea[2],linea[3],linea[4],linea[5],
                      linea[6],linea[7],linea[8],linea[9],linea[10]);
                      intervenciones.add(intervencion);
                    }                  
                  } 
                }
                sc.close();
              }
           }
           /* asi verifico que los datos esten insertados en orden
            for (Intervencion intervencion:intervenciones) {
                System.out.println(intervencion.getAno()+"  "+intervencion.getMes()+"  "+intervencion.getDistrito());
            }
           */
           intervencionConMasYMenosSalidas(intervenciones);
           System.out.println("*********************");
           Intervencion intervencion2=intervencionConMenosSalidas2(intervenciones);
           System.out.println(intervencion2.toString());
           System.out.println("*********************");
           //calcularIntervencionesMediasMesAno(intervenciones);
           calcularIntervencionesMediasMesAno2(intervenciones);
           System.out.println("*********************");
           calcularIntervencionesPorDistrito(intervenciones);      
        }catch(FileNotFoundException f){
            f.getMessage();
        }
        
    }
    
    public static void intervencionConMasYMenosSalidas(ArrayList<Intervencion>intervenciones){
        Map<String, Integer>mapaIncidentes = Stream.of(
         new SimpleEntry<>("Fuegos", 0),
         new SimpleEntry<>("Construccion", 0),
         new SimpleEntry<>("Salvamentos", 0),
         new SimpleEntry<>("Agua", 0),
         new SimpleEntry<>("Diversos", 0),
         new SimpleEntry<>("Salidas sin intervencion", 0),
         new SimpleEntry<>("Varios", 0))
        .collect(toMap(SimpleEntry::getKey, SimpleEntry::getValue));
          
        for(Intervencion intervencion:intervenciones){       
            mapaIncidentes.replace("Fuegos",(mapaIncidentes.get("Fuegos")+intervencion.getFuegos()));
            mapaIncidentes.replace("Construccion",(mapaIncidentes.get("Construccion")+intervencion.getConstruccion()));
            mapaIncidentes.replace("Salvamentos",(mapaIncidentes.get("Salvamentos")+intervencion.getSalvamentos()));
            mapaIncidentes.replace("Agua",(mapaIncidentes.get("Agua")+intervencion.getDanosPorAgua()));
            mapaIncidentes.replace("Diversos",(mapaIncidentes.get("Diversos")+intervencion.getDiversos()));
            mapaIncidentes.replace("Salidas sin intervencion",(mapaIncidentes.get("Salidas sin intervencion")+intervencion.getSalidasSinIntervencion()));
            mapaIncidentes.replace("Varios",(mapaIncidentes.get("Varios")+intervencion.getVarios()));
        }
        List<Entry<String, Integer>> listaIncidentes = new ArrayList<>(mapaIncidentes.entrySet());
        listaIncidentes.sort(Entry.comparingByValue());
        System.out.println("La mayor cantidad de incidentes esta provocada por "+listaIncidentes.get(listaIncidentes.size()-1));
        System.out.println("La menor cantidad de incidentes esta provocada por "+listaIncidentes.get(0));
    }
    
    public static Intervencion intervencionConMenosSalidas2(ArrayList<Intervencion>intervenciones){
        int numeroMenor=10;
        int numeroControl;
        Intervencion in= new Intervencion();
        for(Intervencion intervencion:intervenciones){
            numeroControl=numeroMenor;
            if (intervencion.getFuegos()<numeroMenor) numeroMenor= intervencion.getFuegos();
            if (intervencion.getConstruccion()<numeroMenor) numeroMenor= intervencion.getConstruccion();
            if (intervencion.getSalvamentos()<numeroMenor) numeroMenor= intervencion.getSalvamentos();
            if (intervencion.getDanosPorAgua()<numeroMenor) numeroMenor= intervencion.getDanosPorAgua();
            if (intervencion.getDiversos()<numeroMenor) numeroMenor= intervencion.getDiversos();
            if (intervencion.getSalidasSinIntervencion()<numeroMenor) numeroMenor= intervencion.getSalidasSinIntervencion();
            if (intervencion.getVarios()<numeroMenor) numeroMenor= intervencion.getVarios();
            if (numeroControl>numeroMenor) in=intervencion;
        }
        return in;
    }
    
    public static void calcularIntervencionesMediasMesAno(ArrayList<Intervencion>intervenciones){
        HashMap<String, Integer>lista= new HashMap<String, Integer>();
        String nombre;
        int totalintervenciones;
        int contador=0;
        for(Intervencion intervencion:intervenciones){
            nombre=intervencion.getAno()+"-"+intervencion.getMes();
            totalintervenciones=intervencion.getTotal();
            if (lista.containsKey(nombre)) {
                int intervencionesPrevias=lista.get(nombre);
                lista.replace(nombre,(totalintervenciones+intervencionesPrevias));
            }else{
                lista.put(nombre, totalintervenciones);
            }
            
        }

        for (String fecha: lista.keySet()) {
            String[]identificadores= fecha.split("-");
            /**
            * rastreo para cada clave cuantas veces aparece un objeto Intervencion conel mismo mes y 
            * ano en el arrayList "intervenciones" 
            */
            for(Intervencion intervencion:intervenciones){
                if(intervencion.getAno().equals(identificadores[0])&& intervencion.getMes().equals(identificadores[1])){
                    contador=contador+1;
                }               
            }
            System.out.println("Media de incidentes de "+identificadores[0]+"-"+identificadores[1]+": "+(lista.get(fecha)/contador));
            contador=0;
        }
    }
    
    public static void calcularIntervencionesMediasMesAno2(ArrayList<Intervencion>intervenciones){
        Intervencion intervencionBase= new Intervencion();
        ArrayList<Intervencion>intervencionesPorAnoMes= new ArrayList<Intervencion>();
        for(Intervencion intervencion:intervenciones){
            if (intervencionBase.getAno().equals(intervencion.getAno())&& intervencionBase.getMes().equals(intervencion.getMes())) {
                intervencionBase.setTotal(intervencionBase.getTotal()+intervencion.getTotal());
            }else{
               intervencionesPorAnoMes.add(intervencionBase);
               intervencionBase= new Intervencion();
               intervencionBase.setAno(intervencion.getAno());
               intervencionBase.setMes(intervencion.getMes());
               intervencionBase.setTotal(intervencion.getTotal());
            }
        }
        for (int i = 1; i < intervencionesPorAnoMes.size(); i++) {
           System.out.println(intervencionesPorAnoMes.get(i).getAno()+" "+intervencionesPorAnoMes.get(i).getMes()+": "+(intervencionesPorAnoMes.get(i).getTotal()/22)); 
        }
    }
    
    public static void calcularIntervencionesPorDistrito(ArrayList<Intervencion>intervenciones){
        Scanner sc= new Scanner(System.in);
        HashMap<String, Integer>lista= new HashMap<String, Integer>();
        String nombre;
        int totalintervenciones;
        for(Intervencion intervencion:intervenciones){
            nombre=intervencion.getDistrito();
            totalintervenciones=intervencion.getTotal();
            if (lista.containsKey(nombre)) {
                int intervencionesPrevias=lista.get(nombre);
                lista.replace(nombre,(totalintervenciones+intervencionesPrevias));
            }else{
                lista.put(nombre, totalintervenciones);
            }
        }
        /* Asi veo todos los distritos para poder comparar los datos con el que solicito al usuario mas abajo
        for (String distrito: lista.keySet()) {
            System.out.println("Distrito: "+distrito+": "+lista.get(distrito));
        }*/
        boolean cierto=true;
        while(cierto){
            System.out.println("Por favor inserte un distrito");
            String nombreDistrito=sc.nextLine();
            if (lista.containsKey(nombreDistrito.toUpperCase())) {
                System.out.println("El distrito "+nombreDistrito.toUpperCase()+" tuvo: "+lista.get(nombreDistrito.toUpperCase())+" incidentes.");
                cierto=false;
            }else{
                System.out.println("Ese distrito no existe, vuelva a insertar un distrito");
            }
        }
        
    }    
}
