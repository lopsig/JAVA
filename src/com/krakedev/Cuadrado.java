package com.krakedev;

public class Cuadrado {
    //ATRIBUTO
    private int lado;

    //GETTER/SETTER
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        if (lado > 0) {
            this.lado = lado;
        } else {
            System.out.println("Error: lado debe ser positivo");
        }

    }

    //METODOS
    //AREA
    public double calcularArea () {
        double area = getLado() * getLado();
        return area;
    }

    //PERIMETRO
    public double calcularPerimetro () {
        double perimetro = getLado() * 4;
        return perimetro;
    }
}
