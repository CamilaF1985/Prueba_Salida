package model.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import model.entity.Cita;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ICitaRepository extends JpaRepository<Cita, Long> {

    @Query("SELECT c FROM Cita c")
    List<Cita> findAllCitas();
    
    @Query("SELECT c FROM Cita c WHERE c.paciente.id = :pacienteId")
    List<Cita> findByPacienteId(@Param("pacienteId") Long pacienteId);
}

