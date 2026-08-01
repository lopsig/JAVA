package com.krakedev;

public class Cuadrado {
    //ATRIBUTO
    public int lado;

    //METODOS
    //AREA
    public double calcularArea () {
        double area = lado * lado;
        return area;
    }

    //PERIMETRO
    public double calcularPerimetro () {
        double perimetro = lado * 4;
        return perimetro;
    }
}
