package cl.spring.prueba.pruebaSalida;

import model.entity.Especialidad;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EspecialidadTest {

    @Test
    public void testConstructorAndGetters() {
        Especialidad especialidad = new Especialidad(1L, "Cardiología");

        assertEquals(1L, especialidad.getId());
        assertEquals("Cardiología", especialidad.getNombre());
    }

    @Test
    public void testSetters() {
        Especialidad especialidad = new Especialidad();

        especialidad.setId(2L);
        especialidad.setNombre("Dermatología");

        assertEquals(2L, especialidad.getId());
        assertEquals("Dermatología", especialidad.getNombre());
    }
}

