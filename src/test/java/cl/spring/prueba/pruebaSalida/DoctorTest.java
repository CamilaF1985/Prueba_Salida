package cl.spring.prueba.pruebaSalida;

import model.entity.Doctor;
import model.entity.Usuario;
import model.entity.Especialidad;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoctorTest {

    @Test
    public void testConstructorAndGetters() {
        Especialidad especialidad = new Especialidad();
        Usuario usuario = new Usuario();

        Doctor doctor = new Doctor(1L, "Dr. Ramírez", 5);
        doctor.setEspecialidad(especialidad);
        doctor.setUsuario(usuario);

        assertEquals(1L, doctor.getId());
        assertEquals("Dr. Ramírez", doctor.getNombre());
        assertEquals(5, doctor.getExperiencia());
        assertEquals(especialidad, doctor.getEspecialidad());
        assertEquals(usuario, doctor.getUsuario());
    }

    @Test
    public void testSetters() {
        Doctor doctor = new Doctor();

        Especialidad especialidad = new Especialidad();
        Usuario usuario = new Usuario();

        doctor.setId(2L);
        doctor.setNombre("Dra. Rodríguez");
        doctor.setExperiencia(10);
        doctor.setEspecialidad(especialidad);
        doctor.setUsuario(usuario);

        assertEquals(2L, doctor.getId());
        assertEquals("Dra. Rodríguez", doctor.getNombre());
        assertEquals(10, doctor.getExperiencia());
        assertEquals(especialidad, doctor.getEspecialidad());
        assertEquals(usuario, doctor.getUsuario());
    }
}

