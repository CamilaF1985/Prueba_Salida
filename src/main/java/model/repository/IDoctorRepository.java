package model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import model.entity.Doctor;

public interface IDoctorRepository extends JpaRepository<Doctor, Long> {

    @Query("SELECT d FROM Doctor d")
    List<Doctor> findAllDoctors();
}
