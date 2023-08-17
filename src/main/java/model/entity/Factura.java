package model.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "facturas")
public class Factura {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "Monto")
    private BigDecimal monto;

    @Column(name = "Fecha_Pago")
    private Date fechaPago;

    // Constructor, getters y setters

    public Factura() {
    }

    public Factura(Long id, BigDecimal monto, Date fechaPago) {
        this.id = id;
        this.monto = monto;
        this.fechaPago = fechaPago;
    }

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }
}
