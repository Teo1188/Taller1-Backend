// Interfaz Gestionable
public interface Gestionable {
    // Métodos para prestar y devolver libros
    void prestarLibro(Libro libro, Usuario usuario);
    void devolverLibro(Libro libro, Usuario usuario);
}
