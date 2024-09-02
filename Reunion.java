import java.util.ArrayList;
import java.util.List;

public class Reunion {

    private String descripcion;
    private String fecha;
    private String hora;
    private List<Contacto> asistentes;

    public Reunion(String descripcion, String fecha, String hora) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.asistentes = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Reunion [descripcion=" + descripcion + ", fecha=" + fecha + ", hora=" + hora + ", asistentes=" + asistentes + "]";
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public List<Contacto> getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(List<Contacto> asistentes) {
        this.asistentes = asistentes;
    }

    public void agregarContacto(Contacto contacto) {
        if (!verificarContacto(contacto.getNombre(), contacto.getTelefono())) {
            asistentes.add(contacto);
        }
    }

    public void removerContacto(String nombre, String telefono) {
        for (Contacto contacto : asistentes) {
            if (contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telefono)) {
                asistentes.remove(contacto);
                break;
            }
        }
    }

    private boolean verificarContacto(String nombre, String telefono) {
        for (Contacto contacto : asistentes) {
            if (contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telefono)) {
                return true;
            }
        }
        return false;
    }
}


