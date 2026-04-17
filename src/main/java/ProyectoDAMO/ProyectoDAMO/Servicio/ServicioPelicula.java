package ProyectoDAMO.ProyectoDAMO.Servicio;

import ProyectoDAMO.ProyectoDAMO.Dominio.Pelicula;
import ProyectoDAMO.ProyectoDAMO.Repositorio.RepositorioPelicula;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServicioPelicula {
    private final RepositorioPelicula repositorioPelicula;

    public List<Pelicula> obtenerTodas(){
        return repositorioPelicula.listarPeliculas();
    }
    public  Pelicula guardar(Pelicula pelicula){
        return  repositorioPelicula.addPelicula(pelicula);
    }
}
