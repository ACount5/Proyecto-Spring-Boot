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
    public List<Actor> obtenerTodos(){
        return repositorioActor.listarActores();
    }
    public  Actor guardar(Actor actor){
        return  repositorioActor.addActor(actor);
    }
}
