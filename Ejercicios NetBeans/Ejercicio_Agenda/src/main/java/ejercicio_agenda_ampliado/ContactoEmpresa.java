/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_agenda_ampliado;

/**
 *
 * @author DAW
 */
public class ContactoEmpresa extends Contacto{
    
    private String web;
    
    public ContactoEmpresa(String nombre, String telefono,String web){
        super(nombre, telefono);
        this.web=web;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }
    
    @Override
    public String mostrarDatosContacto() {
        return "Nombre empresa: "+this.getNombre()+"\nTelefono: "+this.getTelefono()+"\nWeb: "+this.web; 
    }
    
}
