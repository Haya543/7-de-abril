package com.iteso.cine;

public class TestCine {
    static void main(String[] args) {

        Largometraje largometraje1 = new Largometraje("La forma del agua", "Guillermo del Toro", 2021, "Ciencia Ficcion", 148);
        Documental documental2 = new Documental("Planet Earth II", "David Attenborough", 2016, "Naturaleza");
        Largometraje largometraje3 = new Largometraje("Temp", "Nadie", 2000, "Drama ", 120);

        largometraje3.setTitulo("La Forma del agua");
        largometraje3.setDirector("Guillermo del Toro");
        largometraje3.setAnio(2021);
        largometraje3.setGenero("Ciencia Ficcion");
        largometraje3.setDuracionMinutos(148);

        System.out.println(largometraje1.equals(documental2));
        if (largometraje1.equals(largometraje3)) {
            System.out.println("¡Increible! Son la misma pelicua");
        } else {
            System.out.println("No son la misma pelicula");
        }

        Pelicula peliculas[] = {largometraje1,documental2, largometraje3};

        for(Pelicula p : peliculas){
            System.out.println(p.toString());
            System.out.println(p.obtenerDescripcion());
        }

    }
}
