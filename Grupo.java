public class Grupo {

    private String nombre;
    private String categoria; 
    private String contactos; 

    public Grupo(String nombre, String categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.contactos = ""; 
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getContactos() {
        return contactos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setContactos(String contactos) {
        this.contactos = contactos;
    }

    // Método para agregar un contacto al grupo
    public void agregarContacto(Contacto contacto) {
        String nombreContacto = contacto.getNombre() + " " + contacto.getAlias();
        if (!verificarContacto(nombreContacto)) {
            if (contactos.isEmpty()) {
                contactos = nombreContacto;
            } else {
                contactos += ", " + nombreContacto;
            }
        }
    }

    // Método para verificar si un contacto ya existe en el grupo
    private boolean verificarContacto(String nombreContacto) {
        return contactos.contains(nombreContacto);
    }

      @Override
    public String toString() {
        return "Grupo [nombre=" + nombre + ", categoria=" + categoria + ", contactos=" + contactos + "]";
    }

}
