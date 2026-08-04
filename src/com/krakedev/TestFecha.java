package com.krakedev;

public class TestFecha {
    public static void main(String[] args) {
        Fecha f1 = new Fecha();

        f1.setAnio(2018);
        f1.setMes(11);
        f1.setDia(22);

        System.out.println("Año: " + f1.getAnio());
        System.out.println("Mes: " + f1.getMes());
        System.out.println("Dia: " + f1.getDia());
    }
}
