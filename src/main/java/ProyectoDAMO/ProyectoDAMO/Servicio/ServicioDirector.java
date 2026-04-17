package ProyectoDAMO.ProyectoDAMO.Servicio;

import ProyectoDAMO.ProyectoDAMO.Dominio.Director;
import ProyectoDAMO.ProyectoDAMO.Repositorio.RepositorioActor;
import ProyectoDAMO.ProyectoDAMO.Repositorio.RepositorioDirector;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServicioDirector {
    private final RepositorioDirector repositorioDirector;
    public List<Director> obtenerTodos(){
        return repositorioDirector.listarDirectores();
    }
    public  Director guardar(Director director){
        return  repositorioDirector.addDirector(director);
    }
}
