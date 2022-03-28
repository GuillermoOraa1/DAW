
import java.util.ArrayList;

/**
 * La clasae agenda sirve para crear y manejar un objeto agenda mediante
 * metodos, y que esta contenga contactos, ya sean de personasa o de empresas
 *
 * @author Marcos
 * @version 1.0
 */
public class Agenda {

    static ArrayList<Contacto> contactos = new ArrayList<Contacto>();

    /**
     * Añade contacto en agenda sino hay otro con el mismo nombre, y devuelve
     * true, en caso de que ya tenga un cotacto con ese nombre en la agenda,
     * devuelve false, y no guarda el contacto
     *
     * @param Contactos Contacto que se quiere añador
     * @return true Si se añade a la lista
     * @return false sino se añade a la lista
     */
    boolean anadirContacto(Contacto c) {
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getNombre().equalsIgnoreCase(c.getNombre())) {
                return false;

            }
        }
        contactos.add(c);
        return true;
    }

    /**
     * Se elimina contacto si este existe en la agenda
     *
     * @param nombre Nombre del contacto que se desea eliminar
     * @return true si se encuentra y elimina el contacto
     * @return false sino se encuentra el contacto en la agenda
     */
    boolean eliminarContacto(String nombre) {
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                contactos.remove(contactos.get(i));
                return true;
            }
        }
        return false;
    }

    /**
     * Se busca el contacto en la lista agenda
     *
     * @param Nombre Nombre del contacto que se desea saber si existe en la
     * lista
     * @return true , el nombre, por lo cual el contacto existen en la lisa
     * @return false, no se encuentra en la lista
     */
    boolean existeContacto(String nombre) {
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Muestra los objetos de la lista agenda y sus atributos.
     */
    void listarContactos() {
        for (int i = 0; i < contactos.size(); i++) {
            System.out.println(contactos.get(i).toString());
        }
    }

    /**
     * Se busca el contacto en la lista agenda
     *
     * @param Nombre Nombre del contacto que se desea saber si existe en la
     * lista
     * @return la posicion del contacto en la lista agenda.
     */
    int buscarContacto(String nombre) {

        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getNombre().equals(nombre)) {
                System.out.println("Se encuentra en la posición " + i);
                return i;
            }
        }
        return -1;
    }
    
        /**
     * Se obteiene un contacto por nombre
     *
     * @param Nombre Nombre del contacto que se desea saber si existe en la
     * lista
     * @return el contacto obtenido o null.
     */
    Contacto obtenerContacto(String nombre) {

        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getNombre().equals(nombre)) {
                System.out.println("Se encuentra en la posición " + i);
                return contactos.get(i);
            }
        }
        return null;
    }
    
    
    

    /**
     * Imprimos los datos del contacto de una posición dada
     *
     * @param index es la posición de la lista en la que se encuentra el
     * contacto.
     */
    void mostrarContactoPorPosicion(int index) throws PosicionNoEncontradaException {
        
        if (index > contactos.size()) throw new PosicionNoEncontradaException();
        
        System.out.println(contactos.get(index).toString());
    }
    
    public Contacto obtenerContactoPorNombre(String nombre){
        for (Contacto contacto: contactos){
            if (contacto.getNombre().equalsIgnoreCase(nombre))
                return contacto;
        }
        return null;
    }
    
    public void mostrarTrabajadoresEmpresa(String Empresa){
        Contacto empresa = obtenerContactoPorNombre(Empresa);
        
//        if (empresa instanceof ContactoEmpresa){
            for (ContactoPersona trabajador : ((ContactoEmpresa) empresa).getTrabajadores())
            System.out.println(trabajador.toString());
//        }
    }
}
