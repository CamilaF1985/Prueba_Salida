package model.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.entity.Doctor;
import model.repository.IDoctorRepository;

@Service
public class DoctorService {

    @Autowired
    private IDoctorRepository doctorRepository;

    public DoctorService(IDoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public Doctor registrarDoctor(Doctor doctor) {
        Doctor doctorRegistrado = doctorRepository.save(doctor);
        return doctorRegistrado;
    }

    public Doctor getDoctorById(Long id) {
        return doctorRepository.getOne(id);
    }

    public List<Doctor> getDoctores() {
        return doctorRepository.findAll();
    }

    public void update(Doctor doctor) {
        doctorRepository.save(doctor);
    }
    
    @Transactional
    public List<Doctor> getDoctoresWithEspecialidad() {
        return doctorRepository.findAllWithEspecialidad();
    }

    @Transactional
    public Long getDoctorIdFromDatabase(Long doctorId) {
        Doctor doctor = doctorRepository.getOne(doctorId);
        if (doctor != null) {
            return doctor.getId();
        } else {
            throw new RuntimeException("Doctor no encontrado");
        }
    }
}

