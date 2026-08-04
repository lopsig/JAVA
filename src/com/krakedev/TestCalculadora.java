package com.krakedev;

public class TestCalculadora {
    public static void main(String[] args) {
        // INSTANCIA
        Calculadora c1 = new Calculadora();

        //VARIABLES
        int r1;
        int r2;
        double r3;
        double r4;
        double r5;
        double r6;
        double r7;



        //INVOCACION DE METODOS
        // METOD SUMAR
        r1 = c1.sumar(3,7);
        System.out.println("Suma: " + r1);

        // METODO RESTAR
        r2 = c1.restar(7,3);
        System.out.println("Resta: " + r2);

        //METODO MULTIPLICAR
        r3 = c1.multiplicar(7, 3);
        System.out.println("Multiplicacion: " + r3);

        //METODO DIVIDIR
        r4 = c1.dividir(7, 0);
        System.out.println("Dividisión: " + r4);

        //METODO PROMEDIAR
        r5 = c1.promediar(7, 3, 12);
        System.out.println("Promedio: " + r5);

        //METODO RESULTADO
        c1.mostrarResultado();

        //METODO DESCONTAR
        r6 = c1.descontar(100, 10);
        System.out.println("Precio descontado: " + r6);

        r7 = c1.descontar(350, 20);
        System.out.println("Segundo Precio descontado: " + r7);


    }
}
