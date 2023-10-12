/*
Universidad del Valle de Guatemala
cc2008 - POO
Seccion 10
Ejercicio #1
Eliazar Canastuj
carnet: 23384
*/


public class publicacion {
    private int id;
    private String titulo;
    private String materia;
    private int cantidadEjemplares;
    private String estado;

    // Constructor
    public publicacion(int id, String titulo, String materia, int cantidadEjemplares, String estado) {
        this.id = id;
        this.titulo = titulo;
        this.materia = materia;
        this.cantidadEjemplares = cantidadEjemplares;
        this.estado = estado;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMateria() {
        return materia;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Título: " + titulo + ", Materia: " + materia + ", Cantidad de Ejemplares: " + cantidadEjemplares + ", Estado: " + estado;
    }
}