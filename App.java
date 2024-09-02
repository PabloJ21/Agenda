public class App {

    public static void imprimir(String mensaje) {
        System.out.println(mensaje);
    }

    public static void main(String[] args) {
        // Crear un contacto
        Contacto contacto1 = new Contacto("Juana", "Juanita", "123 armenia", "129109", "juana@gmail.com");
        Contacto contacto2 = new Contacto("Maria", "Lopez", "456 Calarca", "555453", "maria@gmail.com");

        // Crear un grupo sin especificar una categoría concreta
        Grupo grupo = new Grupo("Madrid", "Oficina"); // Categoria generalizada como "General"

        // Agregar contactos al grupo
        grupo.agregarContacto(contacto1);
        grupo.agregarContacto(contacto2);

        // Imprimir grupo
        imprimir(grupo.toString());

        // Crear una reunión
        Reunion reunion = new Reunion("Reunión de Trabajo", "2024-09-01", "10:00");

        // Agregar contactos a la reunión
        reunion.agregarContacto(contacto1);
        reunion.agregarContacto(contacto2);

        // Imprimir reunión
        imprimir(reunion.toString());
    }
}
