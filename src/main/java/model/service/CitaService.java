package model.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.entity.Cita;
import model.repository.ICitaRepository;

@Service
public class CitaService {

    @Autowired
    private ICitaRepository citaRepository;

    public CitaService(ICitaRepository citaRepository) {
        this.citaRepository = citaRepository;
    }

    public Cita registrarCita(Cita cita) {
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

