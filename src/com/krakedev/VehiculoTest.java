package com.krakedev;

public class VehiculoTest {
    public static void main(String[] args) {
        Vehiculo v;
        v = new Vehiculo();

        System.out.println("*********Vehiculo 0:**********");
        System.out.println("Año: " + v.getAnio());
        System.out.println("Marca: " + v.getMarca());
        System.out.println("Modelo: " + v.getModelo());

        v.setAnio(2012);
        v.setMarca("Chevrolet");
        v.setModelo("Emotion");

        System.out.println("*********Vehiculo 1:**********");
        System.out.println("Año: " + v.getAnio());
        System.out.println("Marca: " + v.getMarca());
        System.out.println("Modelo: " + v.getModelo());

        Vehiculo v2 = new Vehiculo();
        v2.setAnio(2026);
        v2.setMarca("Toyota");
        v2.setModelo("Hilux");

        System.out.println("*********Vehiculo 2:**********");
        System.out.println("Año: " + v2.getAnio());
        System.out.println("Marca: " + v2.getMarca());
        System.out.println("Modelo: " + v2.getModelo());



        System.out.println("*********Vehiculo 3:**********");
        Vehiculo v3 = new Vehiculo("KIA");
        System.out.println("Año: " + v3.getAnio());
        System.out.println("Marca: " + v3.getMarca());
        System.out.println("Modelo: " + v3.getModelo());

        System.out.println("*********Vehiculo 4:**********");
        Vehiculo v4 = new Vehiculo("KIA", "Pikanto", 2025);
        System.out.println("Año: " + v4.getAnio());
        System.out.println("Marca: " + v4.getMarca());
        System.out.println("Modelo: " + v4.getModelo());



    }
}
