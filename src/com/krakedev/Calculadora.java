package com.krakedev;

public class Calculadora {
    //FUNCION SUMAR
    public int sumar (int a, int b){
        int resultado;
        resultado = a + b;
        return resultado;
    }

    //FUNCION RESTAR
    public int restar (int a, int b){
        int resultado;
        resultado = a - b;
        return resultado;
    }

    //FUNCION MULTIPLICAR
    public double multiplicar (double valor1, double valor2){
        double resultado;
        resultado = valor1 * valor2;
        return resultado;
    }

    //FUNCION DIVIDIR
    public double dividir (double dividendo, double divisor){
        double cociente;
        cociente = dividendo / divisor;

        if (divisor == 0){
            System.out.println("No se puede dividir para cero");
        }

        return cociente;
    }

    //FUNCION PROMEDIAR
    public double promediar (double valor1, double valor2, double valor3){
        double promedio;
        promedio = (valor1 + valor2 + valor3)/3;
        return promedio;
    }

    //FUNCION DESCONTAR
    public double descontar (double precioSinDescuento, double porcentajeDescuento){
        double descuento;
        descuento = (precioSinDescuento - (precioSinDescuento * (porcentajeDescuento/100)));
        return descuento;
    }


    // FUNCION RESULTADO
    public void mostrarResultado () {
        System.out.println("Ahorita no joven, salí al almuerzo. Regreso en 15 minutos");
    }



}
