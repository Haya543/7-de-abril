package com.iteso.gestion;

public class TestCoordinador {
    static void main(String[] args) {
        Coordinador coordinador = new Coordinador();

        int i = 0;

        Notificador notificador = new Notificador() {
            private int contadorFalla;

            @Override
            public void onExtio(String msg) {
                contadorFalla = 0;
                System.out.println("Borron y cuenta nueva");
                System.out.println(i);
            }

            @Override
            public void onFallo(String msg) {
                contadorFalla ++;
                System.err.println(msg);
                if(contadorFalla>=3){
                    System.err.printf("Alcanzaste el maximo numero de errores");
                }
            }
        };

        coordinador.procesarAsginacion("Pedro", notificador);
    }
}
