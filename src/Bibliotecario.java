// Clase Bibliotecario que hereda de Persona y a su vez implementa la interfaz Gestionable
class Bibliotecario extends Persona implements Gestionable{
    private String idEmpleado;
    //Constructor de Bibliotecario
    public Bibliotecario(String nombre, String apellido, String idEmpleado) {
        super(nombre, apellido);
        this.idEmpleado = idEmpleado;
    }
    // Sobrecarga del metodo prestar para registrar qué usuario solicitó el libro
    @Override
    public void prestarLibro(Libro libro, Usuario usuario) {
        if (!libro.isDisponible()) {
            System.out.println("El libro ya está prestado.");
        } else if (!usuario.puedePedirPrestamo()) {
            System.out.println("El usuario " + usuario.getNombre() + " ya tiene el máximo de préstamos permitidos.");
        } else {
            libro.prestar();
            usuario.agregarPrestamo(libro);
            System.out.println("La bibliotecaria " + nombre + " " + apellido + " ha registrado el préstamo del libro '" + libro.getTitulo() + "' al usuario " + usuario.getNombre() + ".");
        }
    }

    // Implementación del metodo devolverLibro de la interfaz Gestionable
    @Override
    public void devolverLibro(Libro libro, Usuario usuario) {
        if (libro.isDisponible()) {
            System.out.println("El libro ya está disponible y no puede ser devuelto.");
        } else {
            libro.devolver();
            System.out.println("El bibliotecario " + nombre + " " + apellido + " ha registrado la devolución del libro '" + libro.getTitulo() + "' por el usuario " + usuario.getNombre() + ".");
        }
    }

    //sobreescribe el metodo abstracto de la clase padre
    @Override
    public void mostrarDatos() {
        System.out.println("Bibliotecario: " + nombre + " " + apellido + ", ID de empleado: " + idEmpleado);
    }
}

