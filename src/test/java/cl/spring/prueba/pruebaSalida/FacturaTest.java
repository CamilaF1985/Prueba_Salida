package cl.spring.prueba.pruebaSalida;

import model.entity.Factura;
import org.junit.jupiter.api.Test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacturaTest {

    @Test
    public void testConstructorAndGetters() throws ParseException {
        Date fechaPago = new SimpleDateFormat("yyyy-MM-dd").parse("2023-07-26");

        Factura factura = new Factura(1L, 100.00, fechaPago);

        assertEquals(1L, factura.getId());
        assertEquals(100.00, factura.getMonto());
        assertEquals(fechaPago, factura.getFechaPago());
    }

    @Test
    public void testSetters() throws ParseException {
        Factura factura = new Factura();

        Date fechaPago = new SimpleDateFormat("yyyy-MM-dd").parse("2023-07-27");

        factura.setId(2L);
        factura.setMonto(150.00);
        factura.setFechaPago(fechaPago);

        assertEquals(2L, factura.getId());
        assertEquals(150.00, factura.getMonto());
        assertEquals(fechaPago, factura.getFechaPago());
    }
}

