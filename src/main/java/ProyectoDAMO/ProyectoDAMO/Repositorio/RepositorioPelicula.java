package ProyectoDAMO.ProyectoDAMO.Repositorio;

import ProyectoDAMO.ProyectoDAMO.Dominio.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepositorioPelicula extends JpaRepository<Pelicula,Long> {

}
