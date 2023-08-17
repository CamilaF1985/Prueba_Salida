package model.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "doctores")
public class Doctor {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Experiencia")
    private Integer experiencia;

    @ManyToOne
    @JoinColumn(name = "Especialidad_ID")
    private Especialidad especialidad;

    @OneToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
    
    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
    private List<HistoriaClinica> historiasClinicas;

    // Constructor, getters y setters

    public Doctor() {
    }

    public Doctor(Long id, String nombre, Integer experiencia) {
        this.id = id;
        this.nombre = nombre;
        this.experiencia = experiencia;
    }

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Integer experiencia) {
        this.experiencia = experiencia;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
