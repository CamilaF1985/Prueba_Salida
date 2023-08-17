package model.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.entity.Cita;
import model.entity.Factura;
import model.entity.Paciente;
import model.repository.ICitaRepository;
import model.repository.IFacturaRepository;

@Service
public class CitaService {

    @Autowired
    private ICitaRepository citaRepository;

    @Autowired
    private IFacturaRepository facturaRepository; // Inyecta el repositorio de facturas

    public CitaService(ICitaRepository citaRepository, IFacturaRepository facturaRepository) {
        this.citaRepository = citaRepository;
        this.facturaRepository = facturaRepository;
    }

    public Cita registrarCita(Cita cita) {
        // Crear una nueva factura
        Factura factura = new Factura();
        factura.setMonto(0.0); // Monto inicial (puede cambiar según tus necesidades)
        factura.setFechaPago(null); // Fecha de pago inicial (puede cambiar según tus necesidades)
        
        // Guardar la factura en la base de datos
        factura = facturaRepository.save(factura);
        
        // Asociar la factura a la cita
        cita.setFactura(factura);
        
        // Guardar la cita en la base de datos
        Cita citaRegistrada = citaRepository.save(cita);
        
        return citaRegistrada;
    }


    public Cita getCitaById(Long id) {
        return citaRepository.getOne(id);
    }

    public List<Cita> getCitas() {
        return citaRepository.findAll();
    }

    public void update(Cita cita) {
        citaRepository.save(cita);
    }
    
    public List<Cita> getCitasByPaciente(Paciente paciente) {
        return citaRepository.findByPacienteId(paciente.getId());
    }

    @Transactional
    public Long getCitaIdFromDatabase(Long citaId) {
        Cita cita = citaRepository.getOne(citaId);
        if (cita != null) {
            return cita.getId();
        } else {
            throw new RuntimeException("Cita no encontrada");
        }
    }
}

