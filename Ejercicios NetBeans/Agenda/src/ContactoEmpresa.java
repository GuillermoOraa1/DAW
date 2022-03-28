
import java.util.List;

/**
 * Esta clase representa a objetos que son contactos de Empresas.
 * @author Marcos
 */
public class ContactoEmpresa extends Contacto{
    private String pagweb;
    private List<ContactoPersona> trabajadores;

    public ContactoEmpresa(String pagweb, String nombre, String telefono) {
        super(nombre, telefono);
        this.pagweb = pagweb;
    }

    public String getPagweb() {
        return pagweb;
    }

    public void setPagweb(String pagweb) {
        this.pagweb = pagweb;
    }

    public List<ContactoPersona> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(List<ContactoPersona> trabajadores) {
        this.trabajadores = trabajadores;
    }

    @Override
    public String toString() {
        return "ContactoEmpresa{" + " pagweb: " + pagweb 
                +  " Nombre: " + super.getNombre() 
                + " Telefono: " + super.getTelefono() +'}';
    }


    
}
