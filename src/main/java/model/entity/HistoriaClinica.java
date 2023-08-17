package model.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "historia_clinica")
public class HistoriaClinica {

    @Id
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "Paciente_ID")
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "Doctor_ID")
    private Doctor doctor;

    @Column(name = "Fecha_Cita")
    private Date fechaCita;

    @Column(name = "Sintomas", columnDefinition = "TEXT")
    private String sintomas;

    @Column(name = "Diagnostico", columnDefinition = "TEXT")
    private String diagnostico;

    @Column(name = "Tratamiento", columnDefinition = "TEXT")
    private String tratamiento;

    // Constructor, getters y setters

    public HistoriaClinica() {
    }

    public HistoriaClinica(Long id, Paciente paciente, Doctor doctor, Date fechaCita, String sintomas, String diagnostico, String tratamiento) {
        this.id = id;
        this.paciente = paciente;
        this.doctor = doctor;
        this.fechaCita = fechaCita;
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
    }

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
}
