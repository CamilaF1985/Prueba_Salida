package model.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.entity.HistoriaClinica;
import model.repository.IHistoriaClinicaRepository;

@Service
public class HistoriaClinicaService {

    @Autowired
    private IHistoriaClinicaRepository historiaClinicaRepository;

    public HistoriaClinicaService(IHistoriaClinicaRepository historiaClinicaRepository) {
        this.historiaClinicaRepository = historiaClinicaRepository;
    }

    public HistoriaClinica registrarHistoriaClinica(HistoriaClinica historiaClinica) {
        HistoriaClinica historiaClinicaRegistrada = historiaClinicaRepository.save(historiaClinica);
        return historiaClinicaRegistrada;
    }

    public HistoriaClinica getHistoriaClinicaById(Long id) {
        return historiaClinicaRepository.getOne(id);
    }

    public void update(HistoriaClinica historiaClinica) {
        historiaClinicaRepository.save(historiaClinica);
    }

    @Transactional
    public Long getHistoriaClinicaIdFromDatabase(Long historiaClinicaId) {
        HistoriaClinica historiaClinica = historiaClinicaRepository.getOne(historiaClinicaId);
        if (historiaClinica != null) {
            return historiaClinica.getId();
        } else {
            throw new RuntimeException("Historia clínica no encontrada");
        }
    }
}

