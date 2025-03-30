package com.briamcarrasco.gestiondeeventos.model;

public class Participante {
    private int id;
    private String nombre;
    private String rut;
    private String correo;
    private String telefono;
    private String direccion;
    private Mascota mascota;

    public Participante(int id, String nombre, String rut, String correo, String telefono, String direccion, Mascota mascota) {
        this.id = id;
        this.nombre = nombre;
        this.rut = rut;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.mascota = mascota;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public Mascota getMascota() {
        return mascota;
    }
    
    public boolean tienePerro() {
        return mascota != null && "Perro".equalsIgnoreCase(mascota.getEspecie());
    }
}
