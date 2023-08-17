package cl.spring.prueba.pruebaSalida;

import model.controller.EspecialidadRestController;
import model.service.DoctorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class EspecialidadRestControllerTest {

    @Mock
    private DoctorService doctorService;

    @InjectMocks
    private EspecialidadRestController especialidadRestController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetDoctorNamesWithEspecialidades() {
        List<String> doctorNames = new ArrayList<>();
        doctorNames.add("Dr. Ramirez");
        doctorNames.add("Dra. Rodriguez");

        when(doctorService.getDoctorNamesByEspecialidad()).thenReturn(doctorNames);

        ResponseEntity<List<String>> responseEntity = especialidadRestController.getDoctorNamesWithEspecialidades();

        assertEquals(200, responseEntity.getStatusCodeValue());
        assertEquals(doctorNames, responseEntity.getBody());
        verify(doctorService, times(1)).getDoctorNamesByEspecialidad();
    }
}
