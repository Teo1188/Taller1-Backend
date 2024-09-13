import java.util.ArrayList;

// Clase Usuario que hereda de Persona
class Usuario extends Persona {
    private String idUsuario;
    private ArrayList<Libro> librosPrestados;
    private final int MAX_PRESTAMOS = 3;

    public Usuario(String nombre, String apellido, String idUsuario) {
        super(nombre, apellido);
        this.idUsuario = idUsuario;
        this.librosPrestados = new ArrayList<>();
    }
         public String getNombre() {
             return nombre;
         }
        // Obtener el número de libros prestados
        public int getNumeroDePrestamos() {
            return librosPrestados.size();
        }

        // Comprobar si el usuario puede pedir más libros
        public boolean puedePedirPrestamo() {
            return librosPrestados.size() < MAX_PRESTAMOS;
        }

        // Añadir un libro a la lista de libros prestados
        public void agregarPrestamo(Libro libro) {
            if (puedePedirPrestamo()) {
                librosPrestados.add(libro);
            }
        }
    //sobreescribe el metodo abstracto de la clase padre
    @Override
    public void mostrarDatos() {
        System.out.println("Usuario: " + nombre + " " + apellido + ", ID de usuario: " + idUsuario + ", Libros prestados: " + librosPrestados.size());
    }

}