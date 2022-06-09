/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.EjercicioLecturaCSVconFormulario;

import com.mycompany.EjercicioLecturaCSV.*;

/**
 *
 * 
El Ayuntamiento de Madrid quiere analizar los datos de intervenciones de los bomberos. Para ello te proporcionan el histórico de salidas mensuales por distritos de los últimos años (descomprime el archivo bomberos.zip). Crea un programa Java que cumpla los siguientes requisitos:
a) Maneja los posibles errores y excepciones. Avisar al usuario correctamente en
cada caso.
b) No escribas todo el código directamente en la función ‘main’, implementa funciones adicionales para evitar repetir código y que el programa sea modular.
c) Para que el programa sea eficiente, asegúrate de leer la información de los archivo una sola vez.
d) Leerá los datos de los archivos y mostrará por pantalla la siguiente información:
◦ Intervención con más salidas y número de dichas salidas.
◦ Intervención con menos salidas y número de dichas salidas.
◦ Intervenciones media por mes y año.
e) También almacenará el número de intervenciones por distrito en un HashMap.
f) Tras mostrar los datos del apartado d) le preguntará al usuario de qué distrito
quiere información, por ejemplo “SAN BLAS” y le mostrará las intervenciones totales para ese distrito.
Fíjate que en los archivos, los datos están separados por “;”.
Si te aparecen comillas al leer los archivos, crea una función que las elimine.

 */
public class Intervencion {
    private String ano="";
    private String mes="";
    private String distrito="";
    private int fuegos=0;
    private int construccion=0;    
    private int salvamentos=0;
    private int danosPorAgua=0;
    private int diversos=0;
    private int salidasSinIntervencion=0;
    private int varios=0;
    private int total=0;
    
    public Intervencion(){}
    
    public Intervencion(String ano,String mes,int total){
        this.ano=ano;
        this.mes=mes;
        this.total=total;
    }
    
    public Intervencion(String ano,String mes,String distrito,String fuegos,String construccion,String salvamentos,
            String danosPorAgua,String diversos,String salidasSinIntervencion,String varios,String total){
        this.ano=ano;
        this.mes=mes;
        this.distrito=distrito;
        this.fuegos=Integer.valueOf(fuegos);
        this.construccion=Integer.valueOf(construccion);
        this.salvamentos=Integer.valueOf(salvamentos);
        this.danosPorAgua=Integer.valueOf(danosPorAgua);
        this.diversos=Integer.valueOf(diversos);
        this.salidasSinIntervencion=Integer.valueOf(salidasSinIntervencion);
        this.varios=Integer.valueOf(varios);
        this.total=Integer.valueOf(total);
    }

    public String getAno() {
        return ano;
    }

    public String getMes() {
        return mes;
    }

    public String getDistrito() {
        return distrito;
    }

    public int getFuegos() {
        return fuegos;
    }

    public int getConstruccion() {
        return construccion;
    }

    public int getSalvamentos() {
        return salvamentos;
    }

    public int getDanosPorAgua() {
        return danosPorAgua;
    }

    public int getDiversos() {
        return diversos;
    }

    public int getSalidasSinIntervencion() {
        return salidasSinIntervencion;
    }

    public int getVarios() {
        return varios;
    }

    public int getTotal() {
        return total;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    public String toString(){
    return this.getAno()+" "+this.getMes()+" "+this.getDistrito()+" FUEGOS:"+this.getFuegos()
                +" CONSTRUCCION:"+this.getConstruccion()+" SALVAMENTOS:"+this.getSalvamentos()+" AGUA:"
                +this.getDanosPorAgua()+" DIVERSOS:"+this.getDiversos()+" NO INTERVENCION:"+this.getSalidasSinIntervencion()
                +" VARIOS:"+this.getVarios();
     
    }

}
