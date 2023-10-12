/*
Universidad del Valle de Guatemala
cc2008 - POO
Seccion 10
Ejercicio #1
Eliazar Canastuj
carnet: 23384
*/


class Libro extends publicacion {
    private String autor;
    private String editorial;

    // Constructor
    public Libro(int id, String titulo, String autor, String editorial, String materia, int cantidadEjemplares, String estado) {
        super(id, titulo, materia, cantidadEjemplares, estado);
        this.autor = autor;
        this.editorial = editorial;
    }

    // Getters y Setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "ID=" + getId() +
                ", Título='" + getTitulo() + '\'' +
                ", Autor='" + autor + '\'' +
                ", Editorial='" + editorial + '\'' +
                ", Materia='" + getMateria() + '\'' +
                ", Cantidad de Ejemplares=" + getCantidadEjemplares() +
                ", Estado='" + getEstado() + '\'' +
                '}';
    }
}