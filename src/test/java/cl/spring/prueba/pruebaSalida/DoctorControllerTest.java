package cl.spring.prueba.pruebaSalida;

import model.controller.DoctorController;
import model.entity.Doctor;
import model.service.DoctorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class DoctorControllerTest {

    @Mock
    private DoctorService doctorService;

    @InjectMocks
    private DoctorController doctorController;

    @Mock
    private Model model;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testListDoctores() {
        List<Doctor> doctores = new ArrayList<>();
        doctores.add(new Doctor(1L, "Dr. Ramirez", 5));
        doctores.add(new Doctor(2L, "Dra. Rodriguez", 5));

        when(doctorService.getDoctoresWithEspecialidad()).thenReturn(doctores);

        String viewName = doctorController.listDoctores(model);

        assertEquals("verDoctores", viewName);
        verify(model, times(1)).addAttribute("doctores", doctores);
    }
}
