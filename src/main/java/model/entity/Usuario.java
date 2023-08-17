package model.entity;

import javax.persistence.*;

@Entity
@Table(name = "usuarios") // Nombre de la tabla en la base de datos
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "user")
    private String user;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "rol")
    private String rol;

    @Column(name = "tipo")
    private String tipo; // Puede ser "Cliente" o "Administrador"
    
    @OneToOne(mappedBy = "usuario")
    private Paciente paciente;

    // Constructor, getters y setters

    public Usuario() {
    }

    public Usuario(String user, String password, String email, String rol, String tipo) {
        this.user = user;
        this.password = password;
        this.email = email;
        this.rol = rol;
        this.tipo = tipo;
    }

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
