package com.krakedev;

public class TestCuadrado {
    public static void main(String[] args) {
        //INSTANCIAS
        Cuadrado cuadrado1 = new Cuadrado();
        Cuadrado cuadrado2 = new Cuadrado();
        Cuadrado cuadrado3 = new Cuadrado();

        //SETTERS
        cuadrado1.setLado(3);
        cuadrado2.setLado(7);
        cuadrado3.setLado(12);

        //VARIABLES Y METODOS
        double resultadoAreaCuadrado1 = cuadrado1.calcularArea();;
        double resultadoAreaCuadrado2 = cuadrado2.calcularArea();;
        double resultadoAreaCuadrado3 = cuadrado3.calcularArea();
        double resultadoPerimetroCuadrado1 = cuadrado1.calcularPerimetro();;
        double resultadoPerimetroCuadrado2  = cuadrado2.calcularPerimetro();;
        double resultadoPerimetroCuadrado3 = cuadrado3.calcularPerimetro();;

        //IMPRESION CONSOLA
        System.out.println("Resultados Areas");
        System.out.println("Area Cuadrado 1: " + resultadoAreaCuadrado1 + " (Lado: " + cuadrado1.getLado() + ")");
        System.out.println("Area Cuadrado 2: " + resultadoAreaCuadrado2 + " (Lado: " + cuadrado2.getLado() + ")");
        System.out.println("Area Cuadrado 3: " + resultadoAreaCuadrado3 + " (Lado: " + cuadrado3.getLado() + ")");
        System.out.println("----------------------------------------");
        System.out.println("Resultados Perimetros");
        System.out.println("Perimetro Cuadrado 1: " + resultadoPerimetroCuadrado1 + " (Lado: " + cuadrado1.getLado() + ")");
        System.out.println("Perimetro Cuadrado 2: " + resultadoPerimetroCuadrado2 + " (Lado: " + cuadrado2.getLado() + ")");
        System.out.println("Perimetro Cuadrado 3: " + resultadoPerimetroCuadrado3 + " (Lado: " + cuadrado3.getLado() + ")");

    }
}
