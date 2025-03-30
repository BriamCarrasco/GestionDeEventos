package com.briamcarrasco.gestiondeeventos.model;

public class Mascota {
    private int id;
    private String nombre;
    private int edad;
    private String especie;
    private String raza;
    private String color;
    private String genero;


    public Mascota(int id, String nombre, int edad, String especie, String raza, String color, String genero) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public String getGenero() {
        return genero;
    }

    
}
