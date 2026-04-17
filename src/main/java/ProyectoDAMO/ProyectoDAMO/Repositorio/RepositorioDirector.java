package ProyectoDAMO.ProyectoDAMO.Repositorio;


import ProyectoDAMO.ProyectoDAMO.Dominio.Director;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class RepositorioDirector {

    private ArrayList<Director> directores = new ArrayList<>();

    public RepositorioDirector(){
        directores.add(new Director(1L,"Director1",35));
        directores.add(new Director(2L,"Director2",20));
        directores.add(new Director(3L,"Director3",40));

    }
    public ArrayList<Director> listarDirectores(){
        return directores;
    }
    public Director addDirector(Director director){
        directores.add(director);
        return director;
    }
}
