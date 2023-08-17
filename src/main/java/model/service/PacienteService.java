package model.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.entity.Paciente;
import model.repository.IPacienteRepository;

@Service
public class PacienteService {

    @Autowired
    private IPacienteRepository pacienteRepository;

    public PacienteService(IPacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    public Paciente registrarPaciente(Paciente paciente) {
        Paciente pacienteRegistrado = pacienteRepository.save(paciente);
        return pacienteRegistrado;
    }

    public Paciente getPacienteById(Long id) {
        return pacienteRepository.getOne(id);
    }

    public List<Paciente> getPacientes() {
        return pacienteRepository.findAll();
    }

    public void update(Paciente paciente) {
        pacienteRepository.save(paciente);
    }

    @Transactional
    public Long getPacienteIdFromDatabase(Long pacienteId) {
        Paciente paciente = pacienteRepository.getOne(pacienteId);
        if (paciente != null) {
            return paciente.getId();
        } else {
            throw new RuntimeException("Paciente no encontrado");
        }
    }
}
