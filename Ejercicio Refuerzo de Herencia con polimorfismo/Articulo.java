/*
Universidad del Valle de Guatemala
cc2008 - POO
Seccion 10
Ejercicio #1
Eliazar Canastuj
carnet: 23384
*/

public class Articulo extends publicacion {
    private String arbitro;

    public Articulo(int id, String titulo, String arbitro, String materia, int cantidadEjemplares, String estado) {
        super(id, titulo, materia, cantidadEjemplares, estado);
        this.arbitro = arbitro;
    }

    public String getArbitro() {
        return arbitro;
    }

    public void setArbitro(String arbitro) {
        this.arbitro = arbitro;
    }

    @Override
    public String toString() {
        return "Artículo{" +
               "ID=" + getId() +
               ", Título='" + getTitulo() + '\'' +
               ", Arbitro='" + arbitro + '\'' +
               ", Materia='" + getMateria() + '\'' +
               ", Cantidad de Ejemplares=" + getCantidadEjemplares() +
               ", Estado='" + getEstado() + '\'' +
               '}';
    }
}