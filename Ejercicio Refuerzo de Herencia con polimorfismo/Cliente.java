/*
Universidad del Valle de Guatemala
cc2008 - POO
Seccion 10
Ejercicio #1
Eliazar Canastuj
carnet: 23384
*/

public class Cliente {
    private int numeroIdentidad;
    private String nombre;
    private String direccion;
    private int cantidadPrestamos;

    // Constructor
    public Cliente(int numeroIdentidad, String nombre, String direccion) {
        this.numeroIdentidad = numeroIdentidad;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantidadPrestamos = 0;
    }

    // Getters y Setters para acceder a los atributos de la clase
    public int getNumeroIdentidad() {
        return numeroIdentidad;
    }

    public void setNumeroIdentidad(int numeroIdentidad) {
        this.numeroIdentidad = numeroIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantidadPrestamos() {
        return cantidadPrestamos;
    }

    public void setCantidadPrestamos(int cantidadPrestamos) {
        this.cantidadPrestamos = cantidadPrestamos;
    }

}