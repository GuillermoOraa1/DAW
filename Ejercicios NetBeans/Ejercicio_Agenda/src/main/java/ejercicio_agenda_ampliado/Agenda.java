/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_agenda_ampliado;

import java.util.ArrayList;

/**
 *
 * @author DAW
 */
public class Agenda {
    private ArrayList<Contacto>contactos=new ArrayList<Contacto>();
    
    public Agenda(){}
    
    public Agenda(ArrayList<Contacto>contactos){
        this.contactos=contactos;
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }
    
    public boolean añadirContacto(Contacto c){
        if(this.existeContacto(c.getNombre())){
            System.out.println("Ya existe el contacto.");
            return false;
        }else{
            System.out.println("Contacto anadido.");
            return this.contactos.add(c);
        }       
    }
    
    public boolean eliminarContacto(String nombre){
        if(this.existeContacto(nombre) && this.buscaContacto(nombre)!=-1){
            this.contactos.remove(this.buscaContacto(nombre));
            System.out.println("Contacto eliminado.");
            return true;
        }else{
            System.out.println("No existe un contacto con ese nombre");
            return false;
        }   
    }
    
    public boolean existeContacto(String nombre){
        for (int i = 0; i < this.contactos.size(); i++) {
            if(((Contacto)this.contactos.get(i)).getNombre().equals(nombre)) return true;
        }
        return false;   
    }
    
    public void listarContactos(){     
        this.contactos.stream().map(a->((Contacto)a).mostrarDatosContacto()).forEach(a->System.out.println(a));        
    }
    
    public int buscaContacto(String nombre){
        for (int i = 0; i < this.contactos.size(); i++) {
            if(((Contacto)this.contactos.get(i)).getNombre().equals(nombre)) return i;
        }
        return -1;   
    }
}
