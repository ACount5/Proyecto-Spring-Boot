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

    @GetMapping("/lista")
    public List<Director> obtenerTodos(){
        return servicioDirector.obtenerTodos();
    }
    @PostMapping("/guardar")
    public Director guardar (@RequestBody Director director){
        return  servicioDirector.guardar(director);
    }
}
