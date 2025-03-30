package com.briamcarrasco.gestiondeeventos.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.briamcarrasco.gestiondeeventos.model.Evento;
import com.briamcarrasco.gestiondeeventos.model.Participante;

@Service
public class EventoService {

    private final List<Evento> evento = new ArrayList<>();
    private ParticipanteService participanteService;

    public EventoService(ParticipanteService participanteService){
        this.participanteService = participanteService;

        List<Participante> participantes = participanteService.obtenerParticipantes();
        evento.add(new Evento(1, "Competencia de Agilidad", "2023-10-15", "Parque Central", "Competencia de agilidad para perros", participantes.get(0)));
    }

    public List<Evento> obtenerEvento() {
        return evento;
    } //Devuelve la lista de participantes.

    public Optional<Evento> obtenerParticipantePorId(int id) {
        return evento.stream()
                       .filter(evento -> evento.getId() == id)
                       .findFirst();
    } //Devuelve un participante por su id.
}
