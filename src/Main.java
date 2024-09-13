// Clase principal para probar
public class Main {
    public static void main(String[] args) {
        // Crear un Usuario y un Bibliotecario
        Usuario usuario1 = new Usuario("Teo", "Gaviria", "U123");
        Bibliotecario bibliotecario1 = new Bibliotecario("Ana", "Palacio", "B456");

        // Mostrar los datos de Usuario y Bibliotecario
        usuario1.mostrarDatos();
        bibliotecario1.mostrarDatos();

        // Crear libros
        Libro libro1 = new Libro("El lobo estepario", "Hermann Hesse",12345678);
        Libro libro2 = new Libro("La metamorfosis", "Franz Kafka",19876543);
        Libro libro3 = new Libro("La trilogia de Nueva York", "Paul Auster",11223344);
        Libro libro4 = new Libro("Cien años de soledad", "Gabriel García Márquez",16778899);

        // Mostrar información del libro accediendo a los atributos a través de los getters
        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("ISBN: " + libro1.getIsbn());
        System.out.println("Disponible: " + (libro1.isDisponible() ? "Sí" : "No"));

        //Intentar prestar el libro sin cargarlo a un usuario (no utiliza los metodos prestarLibro() y devolverLibro())
        libro1.prestar(); //Cambia a no disponible
        System.out.println("Disponible: " + (libro1.isDisponible() ? "Sí" : "No"));

        // Devolver el libro
        libro1.devolver();//Cambia a disponible
        System.out.println("Disponible: " + (libro1.isDisponible() ? "Sí" : "No"));
        //Intenta devolver de nuevo el mismo libro
        libro1.devolver();//ya esta disponible

        // Intentar prestar más libros al mismo usuario (hasta alcanzar el máximo)
        bibliotecario1.prestarLibro(libro1, usuario1);  // Presta primer libro
        bibliotecario1.prestarLibro(libro2, usuario1);  // Presta segundo libro
        bibliotecario1.prestarLibro(libro3, usuario1);  // Presta tercer libro
        bibliotecario1.prestarLibro(libro4, usuario1);  // Intenta prestar cuarto libro (sale mensaje que ya excede el tope)

        // Mostrar el estado final del usuario
        usuario1.mostrarDatos();
    }
}
