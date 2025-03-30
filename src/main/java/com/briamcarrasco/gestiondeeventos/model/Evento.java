package com.briamcarrasco.gestiondeeventos.model;

import java.util.ArrayList;
import java.util.List;

public class Evento {
    private int id;
    private String nombreEvento;
    private String fechaEvento;
    private String lugarEvento;
    private String descripcionEvento;
    private List<Participante> participantes;

    public Evento(int id, String nombreEvento, String fechaEvento, String lugarEvento, String descripcionEvento, List<Participante> participantes) {
        this.id = id;
        this.nombreEvento = nombreEvento;
        this.fechaEvento = fechaEvento;
        this.lugarEvento = lugarEvento;
        this.descripcionEvento = descripcionEvento;
        this.participantes = participantes != null ? participantes : new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public String getFechaEvento() {
        return fechaEvento;
    }

    public String getLugarEvento() {
        return lugarEvento;
    }

    public String getDescripcionEvento() {
        return descripcionEvento;
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }
}
