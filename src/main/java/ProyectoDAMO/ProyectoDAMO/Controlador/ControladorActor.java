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

    //Listar
    @GetMapping("/lista")
    public List<Actor> listar() {
        return servicioActor.listar();
    }

    //Crear
    @PostMapping("/crear")
    public Actor crear(@RequestBody Actor actor) {
        return servicioActor.crearActor(actor);
    }

    // Buscar por id
    @GetMapping("/buscar/{id}")
    public Actor obtener(@PathVariable Long id) {
        return servicioActor.buscarActorPorID(id);
    }

    // Borrar por id
    @DeleteMapping("/borrar/{id}")
    public void eliminar(@PathVariable Long id) {
        servicioActor.borrarActorPorID(id);
    }

    // Actualizar
    @PutMapping("actualizar/{id}")
    public Actor actualizar(@PathVariable Long id, @RequestBody Actor actor) {
        return servicioActor.actualizar(id, actor);
    }
}
