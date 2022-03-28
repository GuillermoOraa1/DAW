

/**
 * Clase que representa los tipos los datos básicos de un contacto en la agenda
 * @author Marcos
 */
public class Contacto {
    private String nombre;
    private String telefono;

    public Contacto(String nombre, String telefono) {
        
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
