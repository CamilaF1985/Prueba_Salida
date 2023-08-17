package model.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import model.entity.Cita;
import org.springframework.data.jpa.repository.Query;

public interface ICitaRepository extends JpaRepository<Cita, Long> {

    @Query("SELECT c FROM Cita c")
    List<Cita> findAllCitas();
}

