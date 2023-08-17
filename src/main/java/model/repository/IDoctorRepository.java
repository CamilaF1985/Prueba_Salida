package model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import model.entity.Doctor;

public interface IDoctorRepository extends JpaRepository<Doctor, Long> {

    @Query("SELECT d FROM Doctor d")
    List<Doctor> findAllDoctors();
       
    @Query("SELECT d FROM Doctor d JOIN FETCH d.especialidad")
    List<Doctor> getDoctoresWithEspecialidad();
    
    @Query("SELECT d.id AS DoctorID, d.nombre AS DoctorNombre, e.nombre AS EspecialidadNombre "
            + "FROM Doctor d "
            + "JOIN d.especialidad e "
            + "WHERE d.especialidad.id = e.id")
    List<Object[]> findDoctoresWithEspecialidad();

}









