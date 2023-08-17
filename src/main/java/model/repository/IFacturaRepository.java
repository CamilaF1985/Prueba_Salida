package model.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import model.entity.Factura;
import org.springframework.data.jpa.repository.Query;

public interface IFacturaRepository extends JpaRepository<Factura, Long> {

    @Query("SELECT f FROM Factura f")
    List<Factura> findAllFacturas();
}

