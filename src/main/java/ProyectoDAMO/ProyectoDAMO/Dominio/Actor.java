package ProyectoDAMO.ProyectoDAMO.Dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Actor {
    private long id;
    private String nombre;
    private String nacionalidad;
}
