package model.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import model.entity.HistoriaClinica;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IHistoriaClinicaRepository extends JpaRepository<HistoriaClinica, Long> {

    @Query("SELECT hc FROM HistoriaClinica hc")
    List<HistoriaClinica> findAllHistoriasClinicas();

    @Query("SELECT hc FROM HistoriaClinica hc JOIN FETCH hc.paciente p JOIN FETCH hc.doctor d WHERE p.nombre = :nombrePaciente")
    List<HistoriaClinica> findByPacienteNombre(@Param("nombrePaciente") String nombrePaciente);
}

