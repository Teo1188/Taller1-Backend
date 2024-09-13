public class Libro {
    // Atributos privados (Encapsulamiento)
    private String titulo;
    private String autor;
    private int isbn;
    private boolean disponible;

    //Constructor
    public Libro(String titulo, String autor, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true;//por defecto, el libro esta disponible
    }

    // Métodos get para acceder a los atributos (Encapsulamiento)
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getIsbn() {
        return isbn;
    }

    // No hay un metodo set para disponible, ya que es controlado internamente
    public boolean isDisponible() {
        return disponible;
    }

    // Métodos set para modificar los atributos (Encapsulamiento)
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    // Metodo para prestar el libro (Encapsulamiento y Abstracción)
    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro ha sido prestado.");
        } else {
            System.out.println("El libro no está disponible.");
        }
    }

    // Metodo para devolver el libro (Encapsulamiento y Abstracción)
    public void devolver() {
        if (!disponible) {
            disponible = true;
            System.out.println("El libro ha sido devuelto.");
        } else {
            System.out.println("El libro ya está disponible.");
        }
    }
}

