package ProyectoDAMO.ProyectoDAMO.Servicio;

import ProyectoDAMO.ProyectoDAMO.Dominio.Director;

import ProyectoDAMO.ProyectoDAMO.Repositorio.RepositorioDirector;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServicioDirector {
    private final RepositorioDirector repositorioDirector;
    //Crear
    public Director crearDirector(Director director){
        return repositorioDirector.save(director);
    }
    //Listar
    public List<Director> listar(){

        return repositorioDirector.findAll();
    }
    //Buscar por ID
    public Director buscarDirectorPorID(Long id){

        return repositorioDirector.findById(id).orElse(null);
    }
    //Borrar por ID
    public void borrarDirectorPorID(Long id){
        repositorioDirector.deleteById(id);
        System.out.println("El director con id: " + id + "ha sido eliminado.");
    }
    //Actualizar
    public Director actualizar(Long id, Director nuevo) {
        Director existente = buscarDirectorPorID(id);

        existente.setNombre(nuevo.getNombre());
        existente.setEdad(nuevo.getEdad());

        return repositorioDirector.save(existente);
    }
}
