package com.krakedev;

public class TestCuadrado {
    public static void main(String[] args) {
        //INSTANCIAS
        Cuadrado cuadrado1 = new Cuadrado();
        Cuadrado cuadrado2 = new Cuadrado();
        Cuadrado cuadrado3 = new Cuadrado();

        //ATRIBUTOS
        cuadrado1.lado = 3;
        cuadrado2.lado = 7;
        cuadrado3.lado = 12;

        //VARIABLES
        double resultadoAreaCuadrado1;
        double resultadoAreaCuadrado2;
        double resultadoAreaCuadrado3;
        double resultadoPerimetroCuadrado1;
        double resultadoPerimetroCuadrado2;
        double resultadoPerimetroCuadrado3;

        //INVOCACION METODOS
        resultadoAreaCuadrado1 = cuadrado1.calcularArea();
        resultadoAreaCuadrado2 = cuadrado2.calcularArea();
        resultadoAreaCuadrado3 = cuadrado3.calcularArea();

        resultadoPerimetroCuadrado1 = cuadrado1.calcularPerimetro();
        resultadoPerimetroCuadrado2 =  cuadrado2.calcularPerimetro();
        resultadoPerimetroCuadrado3 =  cuadrado3.calcularPerimetro();

        //IMPRESION CONSOLA
        System.out.println("Resultados Areas");
        System.out.println("Area Cuadrado 1: " + resultadoAreaCuadrado1);
        System.out.println("Area Cuadrado 2: " + resultadoAreaCuadrado2);
        System.out.println("Area Cuadrado 3: " + resultadoAreaCuadrado3);
        System.out.println("----------------------------------------");
        System.out.println("Resultados Perimetros");
        System.out.println("Perimetro Cuadrado 1: " + resultadoPerimetroCuadrado1);
        System.out.println("Perimetro Cuadrado 2: " + resultadoPerimetroCuadrado2);
        System.out.println("Perimetro Cuadrado 3: " + resultadoPerimetroCuadrado3);

    }
}
