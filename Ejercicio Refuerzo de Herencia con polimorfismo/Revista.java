/*
Universidad del Valle de Guatemala
cc2008 - POO
Seccion 10
Ejercicio #1
Eliazar Canastuj
carnet: 23384
*/

class Revista extends publicacion {
    private int anio;
    private int numero;

    public Revista(int id, String titulo, int anio, int numero, String materia, int cantidadEjemplares, String estado) {
        super(id, titulo, materia, cantidadEjemplares, estado);
        this.anio = anio;
        this.numero = numero;
    }

    // Getter para el año
    public int getAnio() {
        return anio;
    }

    // Setter para el año
    public void setAnio(int anio) {
        this.anio = anio;
    }

    // Getter para el número
    public int getNumero() {
        return numero;
    }

    // Setter para el número
    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Revista [ID: " + getId() + ", Título: " + getTitulo() + ", Año: " + anio + ", Número: " + numero + ", Materia: " + getMateria() + ", Cantidad de Ejemplares: " + getCantidadEjemplares() + ", Estado: " + getEstado() + "]";
    }
}