package model.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "facturas")
public class Factura {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "Monto")
    private Double monto;

    @Column(name = "Fecha_Pago")
    private Date fechaPago;

    // Constructor, getters y setters

    public Factura() {
    }

    public Factura(Long id, Double monto, Date fechaPago) {
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

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }
}
