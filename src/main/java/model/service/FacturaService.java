package model.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.entity.Factura;
import model.repository.IFacturaRepository;

@Service
public class FacturaService {

    @Autowired
    private IFacturaRepository facturaRepository;

    public FacturaService(IFacturaRepository facturaRepository) {
        this.facturaRepository = facturaRepository;
    }

    public Factura registrarFactura(Factura factura) {
        Factura facturaRegistrada = facturaRepository.save(factura);
        return facturaRegistrada;
    }

    public Factura getFacturaById(Long id) {
        return facturaRepository.getOne(id);
    }

    public List<Factura> getFacturas() {
        return facturaRepository.findAll();
    }

    public void update(Factura factura) {
        facturaRepository.save(factura);
    }

    @Transactional
    public Long getFacturaIdFromDatabase(Long facturaId) {
        Factura factura = facturaRepository.getOne(facturaId);
        if (factura != null) {
            return factura.getId();
        } else {
            throw new RuntimeException("Factura no encontrada");
        }
    }
}

