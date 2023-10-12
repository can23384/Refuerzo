/*
Universidad del Valle de Guatemala
cc2008 - POO
Seccion 10
Ejercicio #1
Eliazar Canastuj
carnet: 23384
*/

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<publicacion> listaPublicaciones = new ArrayList<>();

    // Método para agregar una publicación a la biblioteca
    public void agregarPublicacion(publicacion publicacion) {
        listaPublicaciones.add(publicacion);
    }

    // Método para buscar una publicación por su ID
    public publicacion buscarPublicacionPorId(int id) {
        for (Publicacion publicacion : listaPublicaciones) {
            if (publicacion.getId() == id) {
                return publicacion;
            }
        }
        return null; 
    }
}