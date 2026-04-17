package ProyectoDAMO.ProyectoDAMO.Controlador;

import ProyectoDAMO.ProyectoDAMO.Dominio.Pelicula;
import ProyectoDAMO.ProyectoDAMO.Servicio.ServicioPelicula;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
@AllArgsConstructor
@RequestMapping("/peliculas")

public class ControladorPelicula {
    private final ServicioPelicula servicioPelicula;

    @GetMapping("/lista")
    public List<Pelicula> obtenerTodas(){
        return servicioPelicula.obtenerTodas();
    }
    @PostMapping("/guardar")
    public Pelicula guardar (@RequestBody Pelicula pelicula){
        return  servicioPelicula.guardar(pelicula);
    }
}
