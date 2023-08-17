package cl.spring.prueba.pruebaSalida;

import model.controller.CitaController;
import model.entity.Cita;
import model.entity.Paciente;
import model.service.CitaService;
import model.service.PacienteService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CitaControllerTest {

    @Mock
    private CitaService citaService;

    @Mock
    private PacienteService pacienteService;

    @InjectMocks
    private CitaController citaController;

    @Mock
    private Authentication authentication;

    @Mock
    private Model model;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testListCitas() {
        Paciente paciente = new Paciente();
        paciente.setId(1L);
        List<Cita> citas = new ArrayList<>();
        citas.add(new Cita());

        when(authentication.getName()).thenReturn("jperez");
        when(pacienteService.getPacienteByUserName("jperez")).thenReturn(paciente);
        when(citaService.getCitasByPaciente(paciente)).thenReturn(citas);

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String viewName = citaController.listCitas(model);

        assertEquals("verCitas", viewName);
        verify(model, times(1)).addAttribute("citas", citas);
    }
}


