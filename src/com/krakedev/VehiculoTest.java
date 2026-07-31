package com.krakedev;

public class VehiculoTest {
    public static void main(String[] args) {
        Vehiculo v;
        v = new Vehiculo();

        System.out.println("*********Vehiculo 0:**********");
        System.out.println("Año: " + v.anio);
        System.out.println("Marca: " + v.marca);
        System.out.println("Modelo: " + v.modelo);

        v.anio = "2012";
        v.marca = "Chevrolet";
        v.modelo = "Emotion";

        System.out.println("*********Vehiculo 1:**********");
        System.out.println("Año: " + v.anio);
        System.out.println("Marca: " + v.marca);
        System.out.println("Modelo: " + v.modelo);

        Vehiculo v2 = new Vehiculo();
        v2.anio = "2026";
        v2.marca = "Toyota";
        v2.modelo = "Hilux";

        System.out.println("*********Vehiculo 2:**********");
        System.out.println("Año: " + v2.anio);
        System.out.println("Marca: " + v2.marca);
        System.out.println("Modelo: " + v2.modelo);



    }
}
