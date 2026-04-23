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

    //Crear
    public Pelicula crearPelicula(Pelicula pelicula){
        return repositorioPelicula.save(pelicula);
    }
    //Listar
    public List<Pelicula> listar(){

        return repositorioPelicula.findAll();
    }
    //Buscar por ID
    public Pelicula buscarPeliculaPorID(Long id){

        return repositorioPelicula.findById(id).orElse(null);
    }
    //Borrar por ID
    public void borrarPeliculaPorID(Long id){
        repositorioPelicula.deleteById(id);
        System.out.println("La película con id: " + id + "ha sido eliminada.");
    }
    //Actualizar
    public Pelicula actualizar(Long id, Pelicula nueva) {
       Pelicula existente = buscarPeliculaPorID(id);

        existente.setTitulo(nueva.getTitulo());
        existente.setGenero(nueva.getGenero());
        existente.setAnio(nueva.getAnio());

        return repositorioPelicula.save(existente);
    }
}
