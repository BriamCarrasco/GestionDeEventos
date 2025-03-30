package com.briamcarrasco.gestiondeeventos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briamcarrasco.gestiondeeventos.model.Evento;
import com.briamcarrasco.gestiondeeventos.services.EventoService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



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
    }
    
    
    
}
