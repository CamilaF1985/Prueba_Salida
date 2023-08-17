package model.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.entity.Especialidad;
import model.repository.IEspecialidadRepository;

@Service
public class EspecialidadService {

    @Autowired
    private IEspecialidadRepository especialidadRepository;

    public EspecialidadService(IEspecialidadRepository especialidadRepository) {
        this.especialidadRepository = especialidadRepository;
    }

    public Especialidad registrarEspecialidad(Especialidad especialidad) {
        Especialidad especialidadRegistrada = especialidadRepository.save(especialidad);
        return especialidadRegistrada;
    }

    public Especialidad getEspecialidadById(Long id) {
        return especialidadRepository.getOne(id);
    }

    public List<Especialidad> getEspecialidades() {
        return especialidadRepository.findAll();
    }

    public void update(Especialidad especialidad) {
        especialidadRepository.save(especialidad);
    }

    @Transactional
    public Long getEspecialidadIdFromDatabase(Long especialidadId) {
        Especialidad especialidad = especialidadRepository.getOne(especialidadId);
        if (especialidad != null) {
            return especialidad.getId();
        } else {
            throw new RuntimeException("Especialidad no encontrada");
        }
    }
}
