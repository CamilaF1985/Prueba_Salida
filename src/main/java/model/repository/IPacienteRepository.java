package model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import model.entity.Paciente;

public interface IPacienteRepository extends JpaRepository<Paciente, Long> {

    @Query("SELECT p FROM Paciente p")
    List<Paciente> findAllPacientes();
}

