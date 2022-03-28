/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_agenda_ampliado;

import java.time.LocalDate;


/**
 *
 * @author DAW
 */
public class ContactoPersona extends Contacto{
    
    private LocalDate fechaCumpleanos;
    
    public ContactoPersona(String nombre, String telefono,LocalDate fechaCumpleanos){
        super(nombre, telefono);
        this.fechaCumpleanos=fechaCumpleanos;
    }

    public LocalDate getFechaCumpleanos() {
        return fechaCumpleanos;
    }

    public void setFechaCumpleanos(LocalDate fechaCumpleanos) {
        this.fechaCumpleanos = fechaCumpleanos;
    }
    

    @Override
    public String mostrarDatosContacto() {
        return "Nombre: "+this.getNombre()+"\nTelefono: "+this.getTelefono()+"\nFecha cumpleaños: "+this.fechaCumpleanos;                
    }
    
}
