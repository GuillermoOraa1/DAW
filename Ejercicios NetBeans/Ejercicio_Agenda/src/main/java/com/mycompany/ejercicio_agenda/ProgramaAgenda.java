/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicio_agenda;

/**
 *
 * @author DAW
 */
public class ProgramaAgenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Agenda agenda1=new Agenda();
        
        Contacto contacto1= new Contacto("Jose","915554433");
        Contacto contacto2= new Contacto("Hugo","915554433");
        Contacto contacto3= new Contacto("Victo","915554433");
        Contacto contacto4= new Contacto("Ana","915554433");
        Contacto contacto5= new Contacto("Isabel","915554433");
        
        System.out.println("********AÑADIMOS CONTACTOS");
        agenda1.añadirContacto(contacto1);
        agenda1.añadirContacto(contacto2);
        agenda1.añadirContacto(contacto3);
        agenda1.añadirContacto(contacto4);
        agenda1.añadirContacto(contacto5);
        
        System.out.println("********AÑADIMOS UN CONTACTO YA EXISTENTE EN LA LISTA");
        agenda1.añadirContacto(contacto4);
        
        System.out.println("********ELIMINAMOS UN CONTACTO QUE TODAVIA NO ESTA EN LA LISTA, "
                + "DESPUES LO AÑADIMOS Y LO VOLVEMOS A ELIMINAR");
        Contacto contacto6= new Contacto("Raul","915554433");
        
        agenda1.eliminarContacto(contacto6.getNombre());
        
        agenda1.añadirContacto(contacto6);
        
        agenda1.eliminarContacto(contacto6.getNombre());
        
        /*
        Los metodos existeContacto() y buscaContacto() ya estan implementados dentro
        de los propios metodos añadirContacto() y eliminarContacto(), asi que no los verificamos
        */
        System.out.println("********MOSTRAMOS LOS DATOS DE TODOS LOS CONTACTOS DE LA LISTA");
        agenda1.listarContactos();

    }
    
}
