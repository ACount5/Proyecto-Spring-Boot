package ProyectoDAMO.ProyectoDAMO.Repositorio;


import ProyectoDAMO.ProyectoDAMO.Dominio.Actor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class RepositorioActor {


        private ArrayList<Actor> actores = new ArrayList<>();

        public RepositorioActor(){
            actores.add(new Actor(1L,"Keanu Reaves","Canadiense"));
            actores.add(new Actor(2L,"Scarlett Johansson","Estadounidense"));
            actores.add(new Actor(3L,"Pepe Viyuela","Español"));

        }
        public ArrayList<Actor> listarActores(){
            return actores;
        }
        public Actor addActor(Actor actor){
            actores.add(actor);
            return actor;
        }
    }


