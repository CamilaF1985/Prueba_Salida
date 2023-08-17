package model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import model.entity.Doctor;
import model.service.DoctorService;

@Controller

public class DoctorController {

    private final DoctorService doctorService;

    @Autowired
    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping("/verDoctores")
    public String listDoctores(Model model) {
        List<Doctor> doctores = doctorService.getDoctoresWithEspecialidad();
        model.addAttribute("doctores", doctores);
        return "verDoctores"; // Nombre de la vista a renderizar (verDoctores.jsp)
    }
}

