package cl.spring.prueba.pruebaSalida;

import model.entity.HistoriaClinica;
import model.entity.Paciente;
import model.entity.Doctor;
import org.junit.jupiter.api.Test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HistoriaClinicaTest {

    @Test
    public void testConstructorAndGetters() throws ParseException {
        Paciente paciente = new Paciente();
        Doctor doctor = new Doctor();
        Date fechaCita = new SimpleDateFormat("yyyy-MM-dd").parse("2023-07-25");

        HistoriaClinica historiaClinica = new HistoriaClinica(1L, paciente, doctor, fechaCita, "Dolor en el pecho", "Angina de pecho", "Medicación y reposo");

        assertEquals(1L, historiaClinica.getId());
        assertEquals(paciente, historiaClinica.getPaciente());
        assertEquals(doctor, historiaClinica.getDoctor());
        assertEquals(fechaCita, historiaClinica.getFechaCita());
        assertEquals("Dolor en el pecho", historiaClinica.getSintomas());
        assertEquals("Angina de pecho", historiaClinica.getDiagnostico());
        assertEquals("Medicación y reposo", historiaClinica.getTratamiento());
    }

    @Test
    public void testSetters() throws ParseException {
        HistoriaClinica historiaClinica = new HistoriaClinica();

        Paciente paciente = new Paciente();
        Doctor doctor = new Doctor();
        Date fechaCita = new SimpleDateFormat("yyyy-MM-dd").parse("2023-07-26");

        historiaClinica.setId(2L);
        historiaClinica.setPaciente(paciente);
        historiaClinica.setDoctor(doctor);
        historiaClinica.setFechaCita(fechaCita);
        historiaClinica.setSintomas("Erupción cutánea");
        historiaClinica.setDiagnostico("Alergia");
        historiaClinica.setTratamiento("Antihistamínicos");

        assertEquals(2L, historiaClinica.getId());
        assertEquals(paciente, historiaClinica.getPaciente());
        assertEquals(doctor, historiaClinica.getDoctor());
        assertEquals(fechaCita, historiaClinica.getFechaCita());
        assertEquals("Erupción cutánea", historiaClinica.getSintomas());
        assertEquals("Alergia", historiaClinica.getDiagnostico());
        assertEquals("Antihistamínicos", historiaClinica.getTratamiento());
    }
}

