package com.krakedev;

public class TestCalculadora {
    public static void main(String[] args) {
        Calculadora c1 = new Calculadora();

        int r1;
        r1 = c1.sumar(3,7);
        System.out.println("Suma: " + r1);

        int r2;
        r2 = c1.restar(7,3);
        System.out.println("Resta: " + r2);

    }
}
