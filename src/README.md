## EJERCICIO #1

Por: Tadeo Gaviria

Este es un ejercicio de Java enfocado a explorar las funcionalidades del modulo 1 y con el desarrollamos un sistema de gestión de una biblioteca en Java, aplicando los principios
de Programación Orientada a Objetos. El sistema debe permitir gestionar libros, usuarios y préstamos.

Para la ejecucion de este sistema vamos a darle click derecho en la clase Main y seleccionaremos la opcion Run 'Main.main()'

Despues podremos ver en la ejecucion la siguiente informacion:

// Mostrar los datos de Usuario y Bibliotecario registrados
Usuario: Teo Gaviria, ID de usuario: U123, Libros prestados: 0
Bibliotecario: Ana Palacio, ID de empleado: B456

// Mostrar información del libro accediendo a los atributos a través de los getters
Título: El lobo estepario
Autor: Hermann Hesse
ISBN: 12345678

// Ejercicio de intentar prestar el libro sin cargarlo a un usuario (no utiliza los metodos prestarLibro() y devolverLibro())
Disponible: Sí
El libro ha sido prestado.
Disponible: No

// Ejercicio de devolver el libro
El libro ha sido devuelto.
Disponible: Sí

//Intenta devolver de nuevo el mismo libro - Ya esta disponible
El libro ya está disponible.

// Intentar prestar más libros al mismo usuario (hasta alcanzar el máximo)
El libro ha sido prestado.
La bibliotecaria Ana Palacio ha registrado el préstamo del libro 'El lobo estepario' al usuario Teo.
El libro ha sido prestado.
La bibliotecaria Ana Palacio ha registrado el préstamo del libro 'La metamorfosis' al usuario Teo.
El libro ha sido prestado.
La bibliotecaria Ana Palacio ha registrado el préstamo del libro 'La trilogia de Nueva York' al usuario Teo.
El usuario Teo ya tiene el máximo de préstamos permitidos.

// Mostrar el estado final del usuario
Usuario: Teo Gaviria, ID de usuario: U123, Libros prestados: 3

