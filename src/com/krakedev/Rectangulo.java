package com.krakedev;

public class Rectangulo {
    //ATRIBUTOS
    public int base;
    public int altura;

    //METODOS
    //AREA
    public int calcularArea () {
        int area = base * altura;
        return area;
    }

    //PERIMETRO
    public double calcularPerimetro () {
        double perimetro = (2*base) + (2*altura);
        return perimetro;
    }

}
