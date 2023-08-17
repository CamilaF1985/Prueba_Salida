package cl.spring.prueba.pruebaSalida;

import model.entity.Cita;
import model.entity.Paciente;
import model.entity.Doctor;
import model.entity.Factura;
import org.junit.jupiter.api.Test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CitaTest {

    @Test
    public void testConstructorAndGetters() throws ParseException {
        Paciente paciente = new Paciente();
        Doctor doctor = new Doctor();
        Factura factura = new Factura();
        Date fecha = new SimpleDateFormat("yyyy-MM-dd").parse("2023-07-25");

        Cita cita = new Cita(1L, paciente, doctor, fecha, factura);

        assertEquals(1L, cita.getId());
        assertEquals(paciente, cita.getPaciente());
        assertEquals(doctor, cita.getDoctor());
        assertEquals(fecha, cita.getFecha());
        assertEquals(factura, cita.getFactura());
    }

    @Test
    public void testSetters() throws ParseException {
        Cita cita = new Cita();

        Paciente paciente = new Paciente();
        Doctor doctor = new Doctor();
        Factura factura = new Factura();
        Date fecha = new SimpleDateFormat("yyyy-MM-dd").parse("2023-07-26");

        cita.setId(2L);
        cita.setPaciente(paciente);
        cita.setDoctor(doctor);
        cita.setFecha(fecha);
        cita.setFactura(factura);

        assertEquals(2L, cita.getId());
        assertEquals(paciente, cita.getPaciente());
        assertEquals(doctor, cita.getDoctor());
        assertEquals(fecha, cita.getFecha());
        assertEquals(factura, cita.getFactura());
    }
}


