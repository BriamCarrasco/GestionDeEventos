package com.briamcarrasco.gestiondeeventos.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briamcarrasco.gestiondeeventos.model.Mascota;
import com.briamcarrasco.gestiondeeventos.services.MascotaService;

@RestController
@RequestMapping("/mascotas")
public class MascotaController {
    private final MascotaService mascotaService;
    public MascotaController(MascotaService mascotaService) {
        this.mascotaService = mascotaService;
    }

    @GetMapping
    public List<Mascota> listarMascotas() {
        return mascotaService.obtenerMascotas();
    }//obtiene lista de mascotas.

    @GetMapping("/{id}")
    public Optional<Mascota> obtenerMascotaPorId(@PathVariable int id) {
        return mascotaService.obtenerMascotaPorId(id);
    }//obtiene mascota por id.
}
