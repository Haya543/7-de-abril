package com.iteso.cine;

public class Largometraje extends Pelicula{
    String genero;
    int duracionMinutos;

    public Largometraje(String titulo, String director, int anio, String genero, int duracionMinutos) {
        super(titulo, director, anio);
        this.genero = genero;
        this.duracionMinutos = duracionMinutos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }


    @Override
    public String obtenerDescripcion() {
        return "Largometraje de " + genero;
    }

    @Override
    public String toString() {
        return super.toString() + "-" +genero+","+duracionMinutos+ "min";
    }
}
