package ProyectoDAMO.ProyectoDAMO.Dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pelicula {
    @Id
    @GeneratedValue
    private long id;
    private String titulo;
    private String genero;
    private int anio;
}
