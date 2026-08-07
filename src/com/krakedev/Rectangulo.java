package com.krakedev;

public class Rectangulo {
    //ATRIBUTOS
    private double base;
    private double altura;

    //CONSTRUCTOR
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //GETTERS-SETTERS
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    //METODOS
    //AREA
    public double calcularArea () {
        double area = getBase() * getAltura();
        return area;
    }

    //PERIMETRO
    public double calcularPerimetro () {
        double perimetro = (2*getBase()) + (2*getAltura());
        return perimetro;
    }

}
