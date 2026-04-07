package com.iteso.mensajeria;

public class Correo implements Notificador{

    @Override
    public void enviar(String sms){
        System.out.println("Enviando correspondencia" + sms);
    }
}
