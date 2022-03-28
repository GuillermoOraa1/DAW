/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenguillermooraasegundaevaluacion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author DAW
 */
public class Grupo {
    
    private String nombre;
    private Date fechaDeInicio;
    private Profesora tutora;
    private ArrayList<Alumna> alumnas=new ArrayList<Alumna>();
    
    /*En el constructor hacemos una conversión de String a Date en la fecha de inicio del curso, asi podemos recibir
    desde el main la fecha en forma de String, que es mas comun*/
    /*El constructor lanza una excepcion por el parseo de String a Date*/
    public Grupo(String nombre, String fechaDeInicio,Profesora tutora) throws ParseException {
        this.nombre=nombre;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        this.fechaDeInicio=formato.parse(fechaDeInicio);
        this.tutora=tutora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(Date fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public Profesora getTutora() {
        return tutora;
    }

    public void setTutora(Profesora tutora) {
        this.tutora = tutora;
    }

    public ArrayList<Alumna> getAlumnas() {
        return alumnas;
    }

    public void setAlumnas(ArrayList<Alumna> alumnas) {
        this.alumnas = alumnas;
    }
    
    /*Antes de insertar la alumna, verificamos si existe */
    public void anadirAlumna(Alumna alumna){
        if (this.verificarAlumna(alumna.getNumeroDeAlumna())) System.out.println("No se ha podido añadir. La alumna ya está en este grupo."); 
        else {
            this.alumnas.add(alumna);
            System.out.println("Añadida la alumna "+alumna.getNombre()+" al curso "+this.getNombre());
        }
            
        
    }
    
    /*Antes de elimina la alumna, verificamos si existe */
    public void eliminarAlumna(Alumna alumna){
        if (this.verificarAlumna(alumna.getNumeroDeAlumna())){
            this.alumnas.remove(alumna);
            System.out.println("Se ha eliminado el perfil de "+alumna.getNombre()+" con exito.");
        }else{
            System.out.println("no se ha podido eliminar, la alumna no está en este grupo.");
        }
    }
    
    /**
     *Este metodo verifica si una alumna existe o no en la lista de alumnas del curso
     */
    public boolean verificarAlumna(String numeroAlumna){
        for (int i = 0; i < this.alumnas.size(); i++){
           if (((Alumna)this.alumnas.get(i)).getNumeroDeAlumna().equals(numeroAlumna)) return true;
        }
        return false;
    }
    
    public String mostrarDatosGrupo(){
        String cadena="Nombre del Grupo: "+this.nombre+"\nFecha de inicio: "+this.fechaDeInicio+"\nTutora: "+
                this.tutora.getNombre()+"\nAlumnas:";
        for (int i = 0; i < this.alumnas.size(); i++){
            cadena+="\n\t"+((Alumna)this.alumnas.get(i)).mostrar();
        }       
        return cadena;
    }
    
    public String mostrarNumerosDeAlumnas(){
       String cadena="Numeros de identificacion de las alumnas del curso: ";
       for (int i = 0; i < this.alumnas.size(); i++){
           cadena+="\n\tNombre: "+((Alumna)this.alumnas.get(i)).getNombre()
                   +" Numero: "+((Alumna)this.alumnas.get(i)).getNumeroDeAlumna();
       }
       return cadena;
    }    
    
    public double calcularMediaSobresalientes(){
        double totalSobresalientes=0.0;
        for (int i = 0; i < this.alumnas.size(); i++){
           totalSobresalientes+=((Alumna)this.alumnas.get(i)).getNumeroDeSobresalientes();
        }
        return totalSobresalientes/this.alumnas.size();
    }
    
    public String listaAlumnasConNSobresalientes(int n){
        String cadena="Listado de alumnas con mas de "+n+" sobresalientes: ";
        for (int i = 0; i < this.alumnas.size(); i++){
            if (((Alumna)this.alumnas.get(i)).getNumeroDeSobresalientes()>n) {
                cadena+="\n\tNombre: "+((Alumna)this.alumnas.get(i)).getNombre()+
                        " Numero de sobresalientes: "+((Alumna)this.alumnas.get(i)).getNumeroDeSobresalientes();
            }  
        }
        return cadena;
    }

}
