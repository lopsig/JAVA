package com.krakedev;

public class TestPlato {
    public static void main(String[] args) {
        //INSTANCIAS
        //APLICANDO CONSTRUCTORES
        Plato platoA = new Plato(
                "Tigrillo Completo",
                "Plato Fuerte",
                5.50,
                true
        );
        Plato platoB = new Plato(
                "Morocho",
                "Entrada",
                3,
                true
        );
        Plato platoC = new Plato(
                "Pristiños",
                "Postre",
                2.5,
                false
        );

        // IMPRESION EN CONSOLA DE VALORES POR DEFECTO
        System.out.println("******* VALORES POR DEFECTO *******");
        System.out.println("Nombre: " + platoA.getNombre());
        System.out.println("Tipo: " + platoA.getTipo());
        System.out.println("Precio: " + platoA.getPrecio());
        System.out.println("Disponible: " + platoA.getPrecio());
        System.out.println("///////////////////////////////////////////////////");

        //MODIFICACION ATRIBUTOS
/*        platoA.setNombre("Tigrillo Completo");
        platoA.setTipo("Plato Fuerte");
        platoA.setPrecio(5.50);
        platoA.setDisponible(true);

        platoB.setNombre("Morocho");;
        platoB.setTipo("Entrada");
        platoB.setPrecio(3);
        platoB.setDisponible(true);

        platoC.setNombre("Pristiños");
        platoC.setTipo("Postre");
        platoC.setPrecio(2.5);
        platoC.setDisponible(false);*/

        //IMPRESION EN CONSOLA
        System.out.println("******* Plato A *******");
        System.out.println("Nombre: " + platoA.getNombre());
        System.out.println("Tipo: " + platoA.getTipo());
        System.out.println("Precio: " + platoA.getPrecio());
        System.out.println("Disponible: " + platoA.getDisponible());

        System.out.println("******* Plato B *******");
        System.out.println("Nombre: " + platoB.getNombre());
        System.out.println("Tipo: " + platoB.getTipo());
        System.out.println("Precio: " + platoB.getPrecio());
        System.out.println("Disponible: " + platoB.getDisponible());

        System.out.println("******* Plato C *******");
        System.out.println("Nombre: " + platoC.getNombre());
        System.out.println("Tipo: " + platoC.getTipo());
        System.out.println("Precio: " + platoC.getPrecio());
        System.out.println("Disponible: " + platoC.getDisponible());



    }
}
