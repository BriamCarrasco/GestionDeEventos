package com.briamcarrasco.gestiondeeventos.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.briamcarrasco.gestiondeeventos.model.Mascota;
import com.briamcarrasco.gestiondeeventos.model.Participante;

@Service
public class ParticipanteService {
    
    private final List<Participante> participantes = new ArrayList<>();

    private MascotaService mascotaService;
    
    
    public ParticipanteService(MascotaService mascotaService) {
        this.mascotaService = mascotaService;
        List<Mascota> mascotas = mascotaService.obtenerMascotas(); 
        participantes.add(new Participante(1, "Ignacio Perez", "20369258-9", "ignacioperez@gmail.com", "+569 7894 5612", "San Martin 12", mascotas.get(0)));
        participantes.add(new Participante(2, "Luis Faundez", "20563258-3", "luisfaundez@gmail.com", "+569 4594 5612", "San Gregorio 132", mascotas.get(1)));
        participantes.add(new Participante(3, "Lucia Godoy", "20963214-4", "luciagodoy@gmail.com", "+569 6794 5612", "Los alerces 122", mascotas.get(2)));
        participantes.add(new Participante(4, "Patricio Alvarez", "20203158-9", "patricioalvarez@gmail.com", "+569 9994 5612", "Prieto 212", mascotas.get(3)));
        participantes.add(new Participante(5, "Pablo Briones", "20478963-5", "pablobriones@gmail.com", "+569 7894 3312", "Estacion 934", mascotas.get(4)));
        participantes.add(new Participante(6, "Elizabeth Toledo", "20203458-6", "elizabethtoledo@gmail.com", "+569 3494 5612", "Las Industrias 2312", mascotas.get(5)));
        participantes.add(new Participante(7, "Mireya Medina", "20123698-2", "mireyamedina@gmail.com", "+569 2194 5612", "Los Jazmines 123", mascotas.get(6)));
        participantes.add(new Participante(8, "Eduardo Marin", "20796314-1", "eduardomarin@gmail.com", "+569 1194 5612", "Alonso de rivera 788", mascotas.get(7)));
    }

        public List<Participante> obtenerParticipantes() {
        return participantes;
    } //Devuelve la lista de participantes.

    public Optional<Participante> obtenerParticipantePorId(int id) {
        return participantes.stream()
                       .filter(participantes -> participantes.getId() == id)
                       .findFirst();
    } //Devuelve un participante por su id.
}