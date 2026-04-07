package com.iteso.trabajo;

public class TestEmpleado {
    static void main() {
        Empleado empleado = new Empleado("Ana", 1800){

            {
                //Aqui es pre construccion del objeto
                System.out.println(toString());
            }

            @Override
            public void calcularSalario(){
                double bono = salario * 1.20;
                System.out.println("El salario es " + bono);
            }
        };

        empleado.calcularSalario();
    }
}
