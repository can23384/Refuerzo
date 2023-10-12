/*
Universidad del Valle de Guatemala
cc2008 - POO
Seccion 10
Ejercicio #1
Eliazar Canastuj
carnet: 23384
*/

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Crear algunas publicaciones
        Libro libro1 = new Libro(123456, "El Libro de Java", "John Doe", "Editorial A", "Programación", 5, "Disponible");
        Revista revista1 = new Revista(789012, "Revista Informática", 2023, 1, "Tecnología", 10, "Disponible");
        Articulo articulo1 = new Articulo(456789, "Artículo de Investigación", "Dr. Smith", "Ciencia", 3, "Disponible");

        // Agregar las publicaciones a la biblioteca
        biblioteca.agregarPublicacion(libro1);
        biblioteca.agregarPublicacion(revista1);
        biblioteca.agregarPublicacion(articulo1);

        // Crear un cliente
        Cliente cliente1 = new Cliente(1001, "Juan Pérez", "Calle Principal, 123");

        // Realizar un préstamo
        biblioteca.realizarPrestamo(cliente1, libro1);
        biblioteca.realizarPrestamo(cliente1, revista1);

        // Mostrar información de libros en la biblioteca
        biblioteca.mostrarInformacionLibros();

    }
}