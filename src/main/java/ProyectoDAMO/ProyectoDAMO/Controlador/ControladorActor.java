package ProyectoDAMO.ProyectoDAMO.Controlador;

import ProyectoDAMO.ProyectoDAMO.Dominio.Actor;
import ProyectoDAMO.ProyectoDAMO.Servicio.ServicioActor;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
@AllArgsConstructor
@RequestMapping("/actores")
public class ControladorActor {


        private final ServicioActor servicioActor;

        @GetMapping("/lista")
        public List<Actor> obtenerTodos(){
            return servicioActor.obtenerTodos();
        }
        @PostMapping("/guardar")
        public Actor guardar (@RequestBody Actor actor){
            return  servicioActor.guardar(actor);
        }
}
