package ProyectoDAMO.ProyectoDAMO.Repositorio;

import ProyectoDAMO.ProyectoDAMO.Dominio.Pelicula;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class RepositorioPelicula {
    private ArrayList<Pelicula> peliculas = new ArrayList<>();

    public RepositorioPelicula(){
        peliculas.add(new Pelicula(1L,"Pelicula1","Terror",2004));
        peliculas.add(new Pelicula(2L,"Pelicula2","Comedia",1995));
        peliculas.add(new Pelicula(3L,"Pelicula3","Acción",2022));
    }
    public ArrayList<Pelicula> listarPeliculas(){
        return peliculas;
    }
    public Pelicula addPelicula(Pelicula pelicula){
       peliculas.add(pelicula);
        return pelicula;
    }
}
