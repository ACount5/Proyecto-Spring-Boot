package ProyectoDAMO.ProyectoDAMO.Repositorio;


import ProyectoDAMO.ProyectoDAMO.Dominio.Director;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepositorioDirector extends JpaRepository<Director,Long> {


}
