package ProyectoDAMO.ProyectoDAMO.Controlador;

import ProyectoDAMO.ProyectoDAMO.Dominio.Pelicula;
import ProyectoDAMO.ProyectoDAMO.Servicio.ServicioPelicula;
import jakarta.validation.Valid;
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

    //Listar
    @GetMapping("/lista")
    public List<Pelicula> listar() {
        return servicioPelicula.listar();
    }

    //Crear
    @Valid
    @PostMapping("/crear")
    public Pelicula crear(@RequestBody Pelicula pelicula) {
        return servicioPelicula.crearPelicula(pelicula);
    }

    // Buscar por id
    @GetMapping("/buscar/{id}")
    public Pelicula obtener(@PathVariable Long id) {
        return servicioPelicula.buscarPeliculaPorID(id);
    }

    // Borrar por id
    @DeleteMapping("/borrar/{id}")
    public void eliminar(@PathVariable Long id) {
        servicioPelicula.borrarPeliculaPorID(id);
    }

    // Actualizar
    @PutMapping("actualizar/{id}")
    public Pelicula actualizar(@PathVariable Long id, @RequestBody Pelicula pelicula) {
        return servicioPelicula.actualizar(id, pelicula);
    }
}
