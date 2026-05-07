package ProyectoDAMO.ProyectoDAMO;

import ProyectoDAMO.ProyectoDAMO.Dominio.Actor;
import ProyectoDAMO.ProyectoDAMO.Dominio.Pelicula;
import ProyectoDAMO.ProyectoDAMO.Repositorio.RepositorioActor;
import ProyectoDAMO.ProyectoDAMO.Repositorio.RepositorioPelicula;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
class ProyectoDamoApplicationTests {
	@Autowired
	private RepositorioPelicula repositorioPelicula;
	@Autowired
	private RepositorioActor repositorioActor;

	@Test
	public void pruebaDeGuardadoYAtributos() {
		Pelicula pelicula = new Pelicula(null,"Robocop","Accion",1985);
		Pelicula pelicula2 = new Pelicula(null,"Robocop 2","Accion",1987);

		Pelicula guardada = repositorioPelicula.save(pelicula);

		assertNotNull(guardada.getId(), "El ID del guardado no puede ser null");
		assertEquals("Robocop", guardada.getTitulo(), "El titulo debe coincidir");
		assertNotEquals(0, guardada.getId(), "El ID del guardado no puede ser 0");
		assertInstanceOf(Long.class, guardada.getId(), "El ID debe ser LONG");

		Actor actor = new Actor(null,"Pablo Motos", "Español");
		Actor guardado = repositorioActor.save(actor);
		assertNotNull(guardado.getId(), "El ID no puede ser null");
		assertEquals("Pablo Motos", guardado.getNombre(), "El nombre debe coincidir");
		assertTrue(guardado.getId() > 0, "El ID debe ser positivo");
	}

}
