
/**
 * Esta clase representa a objetos que son contactos de personas
 *
 * @author Marcos
 */
public class ContactoPersona extends Contacto {

    private String cumpleanos;

    public ContactoPersona(String cumpleanos,
             String nombre, String telefono) {
        super(nombre, telefono);
        this.cumpleanos = cumpleanos;
        ;
    }

    public void setCumpleaños(String cumpleaños) {
        this.cumpleanos = cumpleaños;
    }

    public String getCumpleanos() {
        return cumpleanos;
    }

    @Override
    public String toString() {
        return "Persona{ cumpleaños: " + cumpleanos
                + " Nombre: " + super.getNombre()
                + " Telefono: " + super.getTelefono() + '}';
    }

}
