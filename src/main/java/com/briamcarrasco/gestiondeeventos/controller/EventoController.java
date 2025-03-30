package com.briamcarrasco.gestiondeeventos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briamcarrasco.gestiondeeventos.model.Evento;
import com.briamcarrasco.gestiondeeventos.model.Mascota;
import com.briamcarrasco.gestiondeeventos.services.EventoService;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/eventos")
public class EventoController {
    private final EventoService eventoService;


    public EventoController(EventoService eventoService) {
        this.eventoService = eventoService;
    }

    @GetMapping
    public List<Evento> listarEventos() {
        return eventoService.obtenerEvento();
    }//obtiene lista de eventos.

    @GetMapping("/{id}")
    public Optional<Evento> obtenerEventoporId(@PathVariable int id) {
        return eventoService.obtenerEventoPorId(id);
    }//obtiene evento por id.
    
    
    
}
