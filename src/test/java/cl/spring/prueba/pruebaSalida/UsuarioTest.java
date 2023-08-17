package cl.spring.prueba.pruebaSalida;

import model.entity.Usuario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {

    @Test
    public void testConstructorAndGetters() {
        Usuario usuario = new Usuario("ramirez", "$2a$12$SwioMN5fx7J1pmYwgoeZpeeO3kL0uoxcCQk5Qq0aNM8V3NpukYjp.", "ramirez@gmail.com", "ROLE_doctor", "Doctor");

        assertEquals("ramirez", usuario.getUser());
        assertEquals("$2a$12$SwioMN5fx7J1pmYwgoeZpeeO3kL0uoxcCQk5Qq0aNM8V3NpukYjp.", usuario.getPassword());
        assertEquals("ramirez@gmail.com", usuario.getEmail());
        assertEquals("ROLE_doctor", usuario.getRol());
        assertEquals("Doctor", usuario.getTipo());
    }

    @Test
    public void testSetters() {
        Usuario usuario = new Usuario();

        usuario.setUser("rodriguez");
        usuario.setPassword("$2a$12$SwioMN5fx7J1pmYwgoeZpeeO3kL0uoxcCQk5Qq0aNM8V3NpukYjp.");
        usuario.setEmail("rodriguez@gmail.com");
        usuario.setRol("ROLE_doctor");
        usuario.setTipo("Doctor");

        assertEquals("rodriguez", usuario.getUser());
        assertEquals("$2a$12$SwioMN5fx7J1pmYwgoeZpeeO3kL0uoxcCQk5Qq0aNM8V3NpukYjp.", usuario.getPassword());
        assertEquals("rodriguez@gmail.com", usuario.getEmail());
        assertEquals("ROLE_doctor", usuario.getRol());
        assertEquals("Doctor", usuario.getTipo());
    }
}

