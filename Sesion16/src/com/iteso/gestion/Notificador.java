package com.iteso.gestion;

public interface Notificador {
    void onExtio(String msg);
    void onFallo(String msg);

}
