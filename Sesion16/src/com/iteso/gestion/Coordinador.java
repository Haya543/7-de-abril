package com.iteso.gestion;

public class Coordinador {
    //Notificador puede ser cualquier clase que implemente esta interfaz
    public void procesarAsginacion(String mentor, Notificador notificador){
        notificador.onFallo("No contacto estudiante");
        notificador.onFallo("No asistio en mentoria");
        notificador.onFallo("No se encontro en tiempo");
    }
}
