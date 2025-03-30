package com.briamcarrasco.gestiondeeventos.controller;
import java.util.List;
import java.util.Optional;
import com.briamcarrasco.gestiondeeventos.services.ParticipanteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.briamcarrasco.gestiondeeventos.model.Participante;

@RestController
@RequestMapping("/participantes")
public class ParticipanteController {

    private final ParticipanteService participanteService;


    public ParticipanteController(ParticipanteService participanteService) {
        this.participanteService = participanteService;
    }

    @GetMapping
    public List<Participante> listarParticipantes() {
        return participanteService.obtenerParticipantes();
    }//obtiene lista de eventos.

    @GetMapping("/{id}")
    public Optional<Participante> obtenerParticipantePorId(@PathVariable int id) {
        return participanteService.obtenerParticipantePorId(id);
    }//obtiene evento por id.
}
