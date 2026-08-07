package com.krakedev;

public class TestRestaurante {
    public static void main(String[] args) {
        //INSTANCIAS
        //APLICANDO CONSTRUCTORES
        Restaurante rest1 =  new Restaurante(
                "Chulla Restaurante",
                "Calle La Ronda N° 456, Centro Histórico, Quito",
                4.9
        );
        Restaurante rest2 =  new Restaurante(
                "La Casa del Bolón",
                "Mariscal Sucre y Canelo, Quito",
                4.8
        );

        // IMPRESION EN CONSOLA DE VALORES POR DEFECTO
        System.out.println("******* VALORES POR DEFECTO *******");
        System.out.println("Nombre: " + rest1.getNombre());
        System.out.println("Dirección: " + rest1.getDireccion());
        System.out.println("Calificación: " + rest1.getCalificacion());
        System.out.println("///////////////////////////////////////////////////");

        //MODIFICACION ATRIBUTOS
/*        rest1.setNombre("Chulla Restaurante");
        rest1.setDireccion("Calle La Ronda N° 456, Centro Histórico, Quito");
        rest1.setCalificacion(4.9);

        rest2.setNombre("La Casa del Bolón");
        rest2.setDireccion("Mariscal Sucre y Canelo, Quito");
        rest2.setCalificacion(4.7);*/

        //IMPRESION EN CONSOLA DE VALORES MODIFICADOS
        System.out.println("******* Restaurante 1 *******");
        System.out.println("Nombre: " + rest1.getNombre());
        System.out.println("Dirección: " + rest1.getDireccion());
        System.out.println("Calificación: " + rest1.getCalificacion());

        System.out.println("******* Restaurante 2 *******");
        System.out.println("Nombre: " + rest2.getNombre());
        System.out.println("Dirección: " + rest2.getDireccion());
        System.out.println("Calificación: " + rest2.getCalificacion());

    }
}
