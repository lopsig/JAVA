package com.krakedev;

public class TestRestaurante {
    public static void main(String[] args) {
        //INSTANCIAS
        Restaurante rest1 =  new Restaurante();
        Restaurante rest2 =  new Restaurante();

        //MODIFICACION ATRIBUTOS
        rest1.nombre = "Chulla Restaurante";
        rest1.direccion = "Calle La Ronda N° 456, Centro Histórico, Quito";
        rest1.calificacion = 4.9f;

        rest2.nombre = "La Casa del Bolón";
        rest2.direccion = "Mariscal Sucre y Canelo, Quito";
        rest2.calificacion = 4.7f;

        //IMPRESION EN CONSOLA
        System.out.println("******* Restaurante 1 *******");
        System.out.println("Nombre: " + rest1.nombre);
        System.out.println("Dirección: " + rest1.direccion);
        System.out.println("Calificación: " + rest1.calificacion);

        System.out.println("******* Restaurante 2 *******");
        System.out.println("Nombre: " + rest2.nombre);
        System.out.println("Dirección: " + rest2.direccion);
        System.out.println("Calificación: " + rest2.calificacion);

    }
}
