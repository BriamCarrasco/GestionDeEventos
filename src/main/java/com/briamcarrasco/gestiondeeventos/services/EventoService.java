package com.briamcarrasco.gestiondeeventos.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.briamcarrasco.gestiondeeventos.model.Evento;
import com.briamcarrasco.gestiondeeventos.model.Participante;

@Service
public class EventoService {

    private final List<Evento> evento = new ArrayList<>();
    private ParticipanteService participanteService;

    public EventoService(ParticipanteService participanteService){
        this.participanteService = participanteService;

        List<Participante> participantes = participanteService.obtenerParticipantes();//sE obtiene la lista de participantes desde el servicio ParticipanteService.
        List<Participante> participantesConPerros = participantes.stream()//sE crea una lista de participantes con perros.
        .filter(participante -> participante.tienePerro()) 
        .collect(Collectors.toList());//Filtra los participantes que tienen perros.
        evento.add(new Evento(1, "Competencia de Agilidad", "2023-10-15", "Parque Central", "Competencia de agilidad para perros", participantesConPerros));
        evento.add(new Evento(2, "Exposicion de mascotas", "2023-11-20", "Centro de Eventos", "Exposición de mascotas general", participantes));
    }//Constructor de la clase EventoService. Inicializa la lista de eventos y agrega algunos eventos de ejemplo.

    public List<Evento> obtenerEvento() {
        return evento;
    } //Devuelve la lista de eventos.

    public Optional<Evento> obtenerEventoPorId(int id) {
        return evento.stream()
                       .filter(evento -> evento.getId() == id)
                       .findFirst();
    } //Devuelve un evento por su id.
}
