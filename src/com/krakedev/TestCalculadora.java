package com.krakedev;

public class TestCalculadora {
    public static void main(String[] args) {
        // INSTANCIA
        Calculadora c1 = new Calculadora();

        //VARIABLES
        c1.setSumando1(3);
        c1.setSumando2(7);
        c1.setMinuendo(7);
        c1.setSustraendo(12);
        c1.setMultiplicando(3);
        c1.setMultiplicador(4);
        c1.setDividendo(3);
        c1.setDivisor(5);
        c1.setPromedio1(3);
        c1.setPromedio2(7);
        c1.setPromedio3(12);




        //INVOCACION DE METODOS
        // METOD SUMAR
        double r1 = c1.sumar();
        System.out.println("Suma: " + r1);

        // METODO RESTAR
        double r2 = c1.restar();
        System.out.println("Resta: " + r2);

        //METODO MULTIPLICAR
        double r3 = c1.multiplicar();
        System.out.println("Multiplicacion: " + r3);

        //METODO DIVIDIR
        double r4 = c1.dividir();
        System.out.println("Dividisión: " + r4);

        //METODO PROMEDIAR
        double r5 = c1.promediar();
        System.out.println("Promedio: " + r5);

        //METODO RESULTADO
        c1.mostrarResultado();

        //-------EVALUACION - METODO DESCONTAR--------
        double r6 = c1.descontar(100, 10);
        System.out.println("Precio descontado: " + r6);

        double r7 = c1.descontar(350, 20);
        System.out.println("Segundo Precio descontado: " + r7);


    }
}
