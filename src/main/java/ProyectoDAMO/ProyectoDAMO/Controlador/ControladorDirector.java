package ProyectoDAMO.ProyectoDAMO.Controlador;

import ProyectoDAMO.ProyectoDAMO.Dominio.Director;
import ProyectoDAMO.ProyectoDAMO.Servicio.ServicioDirector;
import lombok.AllArgsConstructor;
import lombok.Data;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
@AllArgsConstructor
@RequestMapping("/directores")
public class ControladorDirector {
    private final ServicioDirector servicioDirector;

    //Listar
    @GetMapping("/lista")
    public List<Director> listar() {
        return servicioDirector.listar();
    }

    //Crear
    @PostMapping("/crear")
    public Director crear(@RequestBody Director director) {
        return servicioDirector.crearDirector(director);
    }

    // Buscar por id
    @GetMapping("/buscar/{id}")
    public Director obtener(@PathVariable Long id) {
        return servicioDirector.buscarDirectorPorID(id);
    }

    // Borrar por id
    @DeleteMapping("/borrar/{id}")
    public void eliminar(@PathVariable Long id) {
        servicioDirector.borrarDirectorPorID(id);
    }

    // Actualizar
    @PutMapping("actualizar/{id}")
    public Director actualizar(@PathVariable Long id, @RequestBody Director director) {
        return servicioDirector.actualizar(id, director);
    }
}
