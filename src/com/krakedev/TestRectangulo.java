package com.krakedev;

public class TestRectangulo {
    public static void main(String[] args) {
        //INSTANCIAS
        //APLICANDO CONSTRUCTORES
        Rectangulo r1 = new Rectangulo(7,3);
        Rectangulo r2 = new Rectangulo(12,4);

        //ATRIBUTOS
/*
        r1.setAltura(7);
        r1.setBase(3);
        r2.setAltura(12);
        r2.setBase(4);
*/


        //VARIABLES
        double resultadoArea;
        double resultadoArea2;
        double resultadoPerimetro;
        double resultadoPerimetro2;

        //INVOCACION METODO
        resultadoArea = r1.calcularArea();
        resultadoArea2 = r2.calcularArea();
        resultadoPerimetro = r1.calcularPerimetro();
        resultadoPerimetro2 = r2.calcularPerimetro();

        //IMPERSION CONSOLA
        System.out.println("Resultados areas");
        System.out.println("Area: " + resultadoArea);
        System.out.println("Area2: " + resultadoArea2);

        System.out.println("Resultados perimetros");
        System.out.println("Perimetro: " + resultadoPerimetro);
        System.out.println("Perimetro2: " + resultadoPerimetro2);



    }
}
