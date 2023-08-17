package model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.service.DoctorService;

@RestController
@RequestMapping("/api/especialidades")
public class EspecialidadRestController {

    private final DoctorService doctorService;

    @Autowired
    public EspecialidadRestController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping("/doctores")
    public ResponseEntity<List<String>> getDoctorNamesWithEspecialidades() {
        List<String> nombresDoctoresEspecialidad = doctorService.getDoctorNamesByEspecialidad();
        return ResponseEntity.ok(nombresDoctoresEspecialidad);
    }
}




