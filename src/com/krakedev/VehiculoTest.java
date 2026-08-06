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



    }
}
