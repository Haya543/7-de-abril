package com.iteso.trabajo;

public class Empleado {
    String nombre;
    double salario;


    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void calcularSalario(){
        System.out.println("El salario es: "+salario);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                '}';
    }
}
