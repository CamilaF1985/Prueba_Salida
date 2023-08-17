package model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import model.entity.Usuario;



public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query("SELECT u FROM Usuario u")
    List<Usuario> findAllUsuarios();
}