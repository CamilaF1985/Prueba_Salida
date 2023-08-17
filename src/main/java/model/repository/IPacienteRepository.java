package model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import model.entity.Paciente;

public interface IPacienteRepository extends JpaRepository<Paciente, Long> {

    @Query("SELECT p FROM Paciente p")
    List<Paciente> findAllPacientes();

    @Query("SELECT p FROM Paciente p INNER JOIN p.usuario u WHERE u.user = :user")
    Paciente findPacienteByUsuarioUser(@Param("user") String user);
}


