package ProyectoDAMO.ProyectoDAMO.Repositorio;


import ProyectoDAMO.ProyectoDAMO.Dominio.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RepositorioActor  extends JpaRepository<Actor,Long> {



    }


