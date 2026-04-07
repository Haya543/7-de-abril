package com.iteso.mensajeria;

public class TestNotificador {
    static void main(String[] args) {
        Correo ups = new Correo();
        ups.enviar("Hello world");

        Notificador email = new Notificador() {
            @Override
            public void enviar(String msg) {
                System.out.println("Enviando email" + msg);
            }
        };

        email.enviar("Hola mundo");

        Notificador sms = new Notificador() {
            @Override
            public void enviar(String msg) {
                System.out.println("Enviando sms" + msg);
            }
        };

        sms.enviar("Buon Giorno Mundo");
    }
}
