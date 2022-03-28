/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_agenda_ampliado;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

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
        
        ContactoPersona contactoPersona1= new ContactoPersona("Jose","915554433",LocalDate.of(LocalDate.now().getYear(), Month.APRIL, 14));
        ContactoPersona contactoPersona2= new ContactoPersona("Hugo","915554433",LocalDate.of(LocalDate.now().getYear(), Month.AUGUST, 9));
        ContactoPersona contactoPersona3= new ContactoPersona("Victo","915554433",LocalDate.of(LocalDate.now().getYear(), Month.FEBRUARY, 28));
        ContactoEmpresa contactoEmpresa1= new ContactoEmpresa("APAP","915554433","www.apap.es");
        ContactoEmpresa contactoEmpresa2= new ContactoEmpresa("Conservas Isabel","915554433","www.ConserveraIsabel.com");
        
        System.out.println("********AÑADIMOS CONTACTOS");
        agenda1.añadirContacto(contactoPersona1);
        agenda1.añadirContacto(contactoPersona2);
        agenda1.añadirContacto(contactoPersona3);
        agenda1.añadirContacto(contactoEmpresa1);
        agenda1.añadirContacto(contactoEmpresa2);
        
        System.out.println("********AÑADIMOS UN CONTACTO YA EXISTENTE EN LA LISTA");
        agenda1.añadirContacto(contactoEmpresa1);
        
        System.out.println("********ELIMINAMOS UN CONTACTO QUE TODAVIA NO ESTA EN LA LISTA, "
                + "DESPUES LO AÑADIMOS Y LO VOLVEMOS A ELIMINAR");
        ContactoPersona contactoPersona4= new ContactoPersona("Raul","915554433",LocalDate.of(LocalDate.now().getYear(), Month.MAY, 2));
        
        agenda1.eliminarContacto(contactoPersona4.getNombre());
        
        agenda1.añadirContacto(contactoPersona4);
        
        agenda1.eliminarContacto(contactoPersona4.getNombre());
        
        /*
        Los metodos existeContacto() y buscaContacto() ya estan implementados dentro
        de los propios metodos añadirContacto() y eliminarContacto(), asi que no los verificamos
        */
        System.out.println("********MOSTRAMOS LOS DATOS DE TODOS LOS CONTACTOS DE LA LISTA");
        agenda1.listarContactos();
        
    }
    
}
