package model.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.entity.Doctor;
import model.entity.Especialidad;
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
        return doctorRepository.getDoctoresWithEspecialidad();
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
    
    public List<String> getDoctorNamesByEspecialidad() {
        List<Object[]> resultados = doctorRepository.findDoctoresWithEspecialidad();
        List<String> nombresDoctores = new ArrayList<>();

        for (Object[] resultado : resultados) {
            Long doctorId = (Long) resultado[0]; // ID del doctor
            String doctorNombre = (String) resultado[1]; // Nombre del doctor
            String especialidadNombre = (String) resultado[2]; // Nombre de la especialidad
            nombresDoctores.add(doctorId + " - " + doctorNombre + " - " + especialidadNombre);
        }

        return nombresDoctores;
    }
 
    public List<Especialidad> getEspecialidades() {
        List<Doctor> doctores = doctorRepository.findAll();
        Set<Especialidad> especialidades = new HashSet<>();

        for (Doctor doctor : doctores) {
            Especialidad especialidad = doctor.getEspecialidad();
            if (especialidad != null) {
                especialidades.add(especialidad);
            }
        }

        return new ArrayList<>(especialidades);
    }
}

