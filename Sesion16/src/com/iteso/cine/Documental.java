package com.iteso.cine;

public class Documental extends Pelicula{
    String tema;

    public Documental(String titulo, String director, int anio, String tema) {
        super(titulo, director, anio);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public String obtenerDescripcion() {
        return "Documental sobre " +tema;
    }

    @Override
    public String toString() {
        return super.toString() + "- Tema: " +tema;
    }
}
