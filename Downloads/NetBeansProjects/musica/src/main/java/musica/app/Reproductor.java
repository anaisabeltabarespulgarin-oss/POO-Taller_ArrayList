/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musica.app;

/**
 *
 * @author Ana
 */

import java.util.ArrayList;
import musica.modelo.Cancion;
import musica.modelo.Playlist;

public class Reproductor {
    public static void main(String[] args) {
        Cancion c1 = new Cancion("Lluvia en Manizales", "Nevado", 200);
        Cancion c2 = new Cancion("Bajo el guadual", "Café Trío", 245);
        Cancion c3 = new Cancion("Noche en Chipre", "Nevado", 185);
        Playlist favoritas = new Playlist("Favoritas");
        
        favoritas.agregar(c1);
        favoritas.agregar(c2);
        favoritas.agregar(c3);
        System.out.println(favoritas.agregar(c1));
        favoritas.mostrar();
        System.out.println(favoritas.duracionTotal());
        
        Playlist viaje = new Playlist("Viaje");
        viaje.agregar(c1);
        viaje.agregar(c2);
        
        System.out.println(favoritas.eliminarArtista("Nevado"));
        favoritas.mostrar();
        viaje.mostrar();
        
        System.out.println(favoritas.buscar("bajo el guadual").getArtista());
        System.out.println(favoritas.buscar("Lluvia en Manizales"));
        
        Cancion c4 = new Cancion("Río Chinchiná", "Nevado", 230);
        
        System.out.println(viaje.agregar(c3)); 
        System.out.println(viaje.agregar(c4));
        System.out.println(Cancion.getTotalCanciones());
        System.out.println(Playlist.MAX_CANCIONES);
        
        Playlist viaje = new Playlist("Viaje");
        viaje.eliminarArtistaConError("Nevado");
        
        ArrayList<Cancion> copia = viaje.getCanciones();
        copia.clear(); 
        System.out.println(viaje.duracionTotal());
        
        ArrayList<Cancion> lista = new ArrayList<>();
        Cancion x = new Cancion("A", "Uno", 100);
        lista.add(x);
        lista.add(x);
        lista.add(new Cancion("A", "Uno", 100));

        System.out.println(lista.size());
        System.out.println(lista.get(0) == lista.get(1));
        System.out.println(lista.get(0) == lista.get(2));

        lista.remove(x);

        System.out.println(lista.size());
        System.out.println(lista.contains(x));
        
        
    }
    
}
