/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios3_clases_y_objetos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 *
 * @author DAW
 */
public class coleccionLIFO {
    ArrayList<Integer>elementos=new ArrayList<Integer>();
    

    public coleccionLIFO() {    
    }
    
    public void InsertarElemento(int n){
        this.elementos.add(n);
    }
    public void EliminarElemento(int n){
        for (int i = 0; i <=this.elementos.size(); i++) {
            if (this.elementos.get(i)==n){
                this.elementos.remove(i);
                break;
            }
        }
    }
    
    public void ConsultarContenidoVacio(){
        if (this.elementos.size()==0) System.out.println("La pila esta vacia.");
    }
    
    public void ConsultarContenido(){
        System.out.printf("La pila tiene %s elementos.\n",this.elementos.size());
    }
    
    public void ToString(){
        for (int numero:this.elementos) {
            System.out.println(numero);
        }
    }
    
    public void MeterPila(int[]array){
        
        for (int i = 0; i <=array.length-1; i++) {
            this.elementos.add(array[i]);
        }
    }
    
    public void CopiarEnOtroArray(ArrayList<Integer> array){
        array=(ArrayList<Integer>)this.elementos.clone();
    }
    
    public int BuscarMayorValor(){
        return Collections.max(this.elementos);
    }
    
    public int CalcularSumatorio(){
        return this.elementos.stream().mapToInt(a->a).sum();   
    }
    
    public double CalcularMedia(){
        return(this.elementos.stream().mapToInt(a->a).sum())/this.elementos.size();   
    }
    
    public void RecorrerDeFormaCircular(){
        //TODO
       int i=0;
       do {
           System.out.println("------------------");  
           for (Integer elemento : this.elementos) {
               System.out.println(elemento);
           }
           i++;
        } while (i<3);
        
    }
    
    public void MostrarPares(){
        ArrayList<Integer> array=(ArrayList<Integer>)this.elementos.stream().filter(a->a%2==0).collect(Collectors.toList());
        for (Integer integer : array) {
            System.out.println(integer);
        }
        System.out.printf("El primer valor par seria %s",array.get(0));
    }


}
