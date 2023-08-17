package model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import model.entity.Cita;
import model.entity.Paciente; // Asegúrate de importar la entidad Paciente
import model.service.CitaService;
import model.service.PacienteService; // Asegúrate de importar el servicio PacienteService

@Controller
public class CitaController {

    private final CitaService citaService;
    private final PacienteService pacienteService; // Inyecta el servicio PacienteService

    @Autowired
    public CitaController(CitaService citaService, PacienteService pacienteService) {
        this.citaService = citaService;
        this.pacienteService = pacienteService;
    }

    @GetMapping("/verCitas")
    public String listCitas(Model model) {
        // Obtiene la autenticación actual desde el contexto de seguridad
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        // Obtiene el nombre de usuario del usuario autenticado
        String username = authentication.getName();

        // Utiliza el nombre de usuario para obtener el paciente asociado (ajusta esto según tu implementación)
        Paciente paciente = pacienteService.getPacienteByUserName(username);

        // Obtiene las citas del paciente actual por su ID
        List<Cita> citas = citaService.getCitasByPaciente(paciente);

        model.addAttribute("citas", citas);
        return "verCitas"; // nombre de la vista a renderizar (verCitas.jsp)
    }
}








