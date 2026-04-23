package ProyectoDAMO.ProyectoDAMO.Servicio;

import ProyectoDAMO.ProyectoDAMO.Dominio.Actor;
import ProyectoDAMO.ProyectoDAMO.Repositorio.RepositorioActor;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServicioActor {
    private final RepositorioActor repositorioActor;
    //Crear
    public Actor crearActor(Actor actor){
        return repositorioActor.save(actor);
    }
    //Listar
    public List<Actor> listar(){

        return repositorioActor.findAll();
    }
    //Buscar por ID
    public Actor buscarActorPorID(Long id){

        return repositorioActor.findById(id).orElse(null);
    }
    //Borrar por ID
    public void borrarActorPorID(Long id){
        repositorioActor.deleteById(id);
        System.out.println("El actor con id: " + id + "ha sido eliminado.");
    }
    //Actualizar
    public Actor actualizar(Long id, Actor nuevo) {
        Actor existente = buscarActorPorID(id);

        existente.setNombre(nuevo.getNombre());
        existente.setNacionalidad(nuevo.getNacionalidad());

        return repositorioActor.save(existente);
    }
}
