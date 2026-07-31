package com.krakedev;

public class TestPlato {
    public static void main(String[] args) {
        //INSTANCIAS
        Plato platoA = new Plato();
        Plato platoB = new Plato();
        Plato platoC = new Plato();

        //MODIFICACION ATRIBUTOS
        platoA.nombre = "Tigrillo Completo";
        platoA.tipo = "Plato Fuerte";
        platoA.precio = 5.50;
        platoA.disponible = true;

        platoB.nombre = "Morocho";
        platoB.tipo = "Entrada";
        platoB.precio = 3.00;
        platoB.disponible = true;

        platoC.nombre = "Pristiños";
        platoC.tipo = "Postre";
        platoC.precio = 2.50;
        platoC.disponible = false;

        //IMPRESION EN CONSOLA
        System.out.println("******* Plato A *******");
        System.out.println("Nombre: " + platoA.nombre);
        System.out.println("Tipo: " + platoA.tipo);
        System.out.println("Precio: " + platoA.precio);
        System.out.println("Disponible: " + platoA.disponible);

        System.out.println("******* Plato B *******");
        System.out.println("Nombre: " + platoB.nombre);
        System.out.println("Tipo: " + platoB.tipo);
        System.out.println("Precio: " + platoB.precio);
        System.out.println("Disponible: " + platoB.disponible);

        System.out.println("******* Plato C *******");
        System.out.println("Nombre: " + platoC.nombre);
        System.out.println("Tipo: " + platoC.tipo);
        System.out.println("Precio: " + platoC.precio);
        System.out.println("Disponible: " + platoC.disponible);



    }
}
