package com.krakedev;

public class TestRectangulo {
    public static void main(String[] args) {
        //INSTANCIAS
        Rectangulo r1 = new Rectangulo();
        Rectangulo r2 = new Rectangulo();

        //ATRIBUTOS
        r1.altura = 7;
        r1.base = 3;
        r2.altura = 12;
        r2.base = 4;


        //VARIABLES
        int resultadoArea;
        int resultadoArea2;
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
