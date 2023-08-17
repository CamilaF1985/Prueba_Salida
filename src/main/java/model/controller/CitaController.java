package model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import model.entity.Cita;
import model.service.CitaService;


@Controller

public class CitaController {

    @Autowired
    private CitaService citaService;


    public CitaController(CitaService citaService) {
        this.citaService = citaService;
    }

    @GetMapping("/verCitas")
    public String listCitas(Model model) {
        List<Cita> citas = citaService.getCitas();
        model.addAttribute("citas", citas);
        return "verCitas"; // nombre de la vista a renderizar (listadoCitas.jsp)
    }
    
}




