package cl.spring.prueba.pruebaSalida;

import model.entity.Paciente;
import model.entity.Usuario;
import org.junit.jupiter.api.Test;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PacienteTest {

    @Test
    public void testConstructorAndGetters() throws ParseException {
        Usuario usuario = new Usuario();
        Date fechaNacimiento = new Date(new SimpleDateFormat("yyyy-MM-dd").parse("1985-03-15").getTime());

        Paciente paciente = new Paciente(1L, "Juan Pérez", fechaNacimiento);
        paciente.setUsuario(usuario);

        assertEquals(1L, paciente.getId());
        assertEquals("Juan Pérez", paciente.getNombre());
        assertEquals(fechaNacimiento, paciente.getFechaNacimiento());
        assertEquals(usuario, paciente.getUsuario());
    }

    @Test
    public void testSetters() throws ParseException {
        Paciente paciente = new Paciente();

        Usuario usuario = new Usuario();
        Date fechaNacimiento = new Date(new SimpleDateFormat("yyyy-MM-dd").parse("1990-07-25").getTime());

        paciente.setId(2L);
        paciente.setNombre("María López");
        paciente.setFechaNacimiento(fechaNacimiento);
        paciente.setUsuario(usuario);

        assertEquals(2L, paciente.getId());
        assertEquals("María López", paciente.getNombre());
        assertEquals(fechaNacimiento, paciente.getFechaNacimiento());
        assertEquals(usuario, paciente.getUsuario());
    }
}

