package model.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import model.entity.Especialidad;
import org.springframework.data.jpa.repository.Query;

public interface IEspecialidadRepository extends JpaRepository<Especialidad, Long> {

    @Query("SELECT e FROM Especialidad e")
    List<Especialidad> findAllEspecialidades();
}

