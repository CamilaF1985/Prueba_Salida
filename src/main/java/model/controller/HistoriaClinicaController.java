package model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import model.entity.HistoriaClinica;
import model.service.HistoriaClinicaService;

@Controller
public class HistoriaClinicaController {

    private final HistoriaClinicaService historiaClinicaService;

    @Autowired
    public HistoriaClinicaController(HistoriaClinicaService historiaClinicaService) {
        this.historiaClinicaService = historiaClinicaService;
    }

    @RequestMapping(value = "/verHistoriasClinicas", method = {RequestMethod.GET, RequestMethod.POST})
    public String verHistoriasClinicas(@RequestParam(required = false) String nombrePaciente, Model model) {
        if (nombrePaciente != null) {
            List<HistoriaClinica> historiasClinicas = historiaClinicaService.findByPacienteNombre(nombrePaciente);
            model.addAttribute("historiasClinicas", historiasClinicas);
        }
        return "verHistoriasClinicas"; // nombre de la vista a renderizar (verHistoriaClinicaPorNombre.jsp)
    }

}






