package ProyectoDAMO.ProyectoDAMO.Repositorio;

import ProyectoDAMO.ProyectoDAMO.Dominio.Actor;
import ProyectoDAMO.ProyectoDAMO.Dominio.Director;
import ProyectoDAMO.ProyectoDAMO.Dominio.Pelicula;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final RepositorioDirector repositorioDirector;
    private final  RepositorioActor repositorioActor;
    private final  RepositorioPelicula repositorioPelicula;

    public DataLoader (RepositorioPelicula repositorioPelicula,RepositorioActor repositorioActor, RepositorioDirector repositorioDirector){
    this.repositorioPelicula = repositorioPelicula;
    this.repositorioActor = repositorioActor;
    this.repositorioDirector = repositorioDirector;
    }

    @Override
    public void run(String... args) throws Exception {
        if (repositorioPelicula.count() == 0) {
            // 2 Películas
            repositorioPelicula.save(new Pelicula(null, "Matrix", "Ciencia Ficción", 1999));
            repositorioPelicula.save(new Pelicula(null, "Inception", "Ciencia Ficción", 2010));

            // 2 Actores
            repositorioActor.save(new Actor(null, "Keanu Reeves", "Libanés/Canadiense"));
            repositorioActor.save(new Actor(null, "Leonardo DiCaprio", "Estadounidense"));

            // 2 Directores
            repositorioDirector.save(new Director(null, "Lana Wachowski", 58));
            repositorioDirector.save(new Director(null, "Christopher Nolan", 53));

            System.out.println("✅ DATOS DE PRUEBA (PELIS, ACTORES, DIRECTORES) LISTOS");
        }
    }


    }

