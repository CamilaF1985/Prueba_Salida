package model.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import model.entity.HistoriaClinica;
import org.springframework.data.jpa.repository.Query;

public interface IHistoriaClinicaRepository extends JpaRepository<HistoriaClinica, Long> {

    @Query("SELECT hc FROM HistoriaClinica hc")
    List<HistoriaClinica> findAllHistoriasClinicas();
}
