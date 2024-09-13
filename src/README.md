## EJERCICIO #1

### Sistema de Gestion de Biblioteca

Por: Tadeo Gaviria

Este es un ejercicio de Java enfocado a explorar las funcionalidades del modulo 1 y con el desarrollamos un sistema de gestión de una biblioteca en Java, aplicando los principios
de Programación Orientada a Objetos. El sistema debe permitir gestionar libros, usuarios y préstamos.

Para la ejecucion de este sistema vamos a darle click derecho en la clase Main y seleccionaremos la opcion Run 'Main.main()'

Despues podremos ver en la ejecucion la siguiente informacion:

// Crear un Usuario y un Bibliotecario
````
Usuario usuario1 = new Usuario("Teo", "Gaviria", "U123");
Bibliotecario bibliotecario1 = new Bibliotecario("Ana", "Palacio", "B456");
````
// Mostrar los datos de Usuario y Bibliotecario registrados
````
usuario1.mostrarDatos();
bibliotecario1.mostrarDatos();
````
Imprime:

Usuario: Teo Gaviria, ID de usuario: U123, Libros prestados: 0

Bibliotecario: Ana Palacio, ID de empleado: B456

// Mostrar información del libro accediendo a los atributos a través de los getters

````
System.out.println("Título: " + libro1.getTitulo());
System.out.println("Autor: " + libro1.getAutor());
System.out.println("ISBN: " + libro1.getIsbn());
System.out.println("Disponible: " + (libro1.isDisponible() ? "Sí" : "No"));
````
Imprime:

Título: El lobo estepario
Autor: Hermann Hesse
ISBN: 12345678

// Ejercicio de intentar prestar el libro sin cargarlo a un usuario, solo consulta(no utiliza los metodos prestarLibro() y devolverLibro())
````
libro1.prestar(); //Cambia a no disponible
System.out.println("Disponible: " + (libro1.isDisponible() ? "Sí" : "No"));
// Devolver el libro
libro1.devolver();// Cambia a disponible
System.out.println("Disponible: " + (libro1.isDisponible() ? "Sí" : "No"));
//Intenta devolver de nuevo el mismo libro
libro1.devolver();//ya esta disponible
````
Imprime:

Disponible: Sí

El libro ha sido prestado.

Disponible: No

El libro ha sido devuelto.

Disponible: Sí

El libro ya está disponible.

// Crear libros
````
Libro libro1 = new Libro("El lobo estepario", "Hermann Hesse",12345678);
Libro libro2 = new Libro("La metamorfosis", "Franz Kafka",19876543);
Libro libro3 = new Libro("La trilogia de Nueva York", "Paul Auster",11223344);
Libro libro4 = new Libro("Cien años de soledad", "Gabriel García Márquez",16778899);
````

// Intentar prestar más libros al mismo usuario (hasta alcanzar el máximo)

````
bibliotecario1.prestarLibro(libro1, usuario1);  // Presta primer libro
bibliotecario1.prestarLibro(libro2, usuario1);  // Presta segundo libro
bibliotecario1.prestarLibro(libro3, usuario1);  // Presta tercer libro
bibliotecario1.prestarLibro(libro4, usuario1);  // Intenta prestar cuarto libro (sale mensaje que ya excede el tope)
````

Imprime:

El libro ha sido prestado.

La bibliotecaria Ana Palacio ha registrado el préstamo del libro 'El lobo estepario' al usuario Teo.

El libro ha sido prestado.

La bibliotecaria Ana Palacio ha registrado el préstamo del libro 'La metamorfosis' al usuario Teo.

El libro ha sido prestado.

La bibliotecaria Ana Palacio ha registrado el préstamo del libro 'La trilogia de Nueva York' al usuario Teo.

El usuario Teo ya tiene el máximo de préstamos permitidos.

// Mostrar el estado final del usuario
````
usuario1.mostrarDatos();
````
Imprime:

Usuario: Teo Gaviria, ID de usuario: U123, Libros prestados: 3

