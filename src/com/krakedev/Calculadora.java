package com.krakedev;

public class Calculadora {
     private double sumando1;
     private double sumando2;
     private double minuendo;
     private double sustraendo;
     private double multiplicando;
     private double multiplicador;
     private double dividendo;
     private double divisor;
     private double promedio1;
     private double promedio2;
     private double promedio3;

    //GETTER
    public double getSumando1()  {
        return sumando1;
    }
    public double getSumando2()  {
        return sumando2;
    }
    public double getMinuendo()  {
        return minuendo;
    }
    public double getSustraendo()  {
        return sustraendo;
    }
    public double getMultiplicando()  {
        return multiplicando;
    }
    public double getMultiplicador()  {
        return multiplicador;
    }
    public double getDividendo()  {
        return dividendo;
    }
    public double getDivisor()  {
        return divisor;
    }
    public double getPromedio1()  {
        return promedio1;
    }
    public double getPromedio2()  {
        return promedio2;
    }
    public double getPromedio3()  {
        return promedio3;
    }
    //SETTER
    public void setSumando1(double sumando1) {
        this.sumando1 = sumando1;
    }
    public void setSumando2(double sumando2) {
        this.sumando2 = sumando2;
    }
    public void setMinuendo(double minuendo) {
        this.minuendo = minuendo;
    }
    public void setSustraendo(double sustraendo) {
        this.sustraendo = sustraendo;
    }
    public void setMultiplicando(double multiplicando) {
        this.multiplicando = multiplicando;
    }
    public void setMultiplicador(double multiplicador) {
        this.multiplicador = multiplicador;
    }
    public void setDividendo(double dividendo) {
        this.dividendo = dividendo;
    }
    public void setDivisor(double divisor) {
        this.divisor = divisor;
    }
    public void setPromedio1(double promedio1) {
        this.promedio1 = promedio1;
    }
    public void setPromedio2(double promedio2) {
        this.promedio2 = promedio2;
    }
    public void setPromedio3(double promedio3) {
        this.promedio3 = promedio3;
    }


    //FUNCION SUMAR
    public double sumar () {
        double resultado;
        resultado = getSumando1() + getSumando2();
        return resultado;
    }

    //FUNCION RESTAR
    public double restar (){
        double resultado;
        resultado = getMinuendo() - getSustraendo();
        return resultado;
    }

    //FUNCION MULTIPLICAR
    public double multiplicar (){
        double resultado;
        resultado = getMultiplicando() * getMultiplicador();
        return resultado;
    }

    //FUNCION DIVIDIR
    public double dividir (){
        if (getDivisor() == 0){
            System.out.println("No se puede dividir para cero");
        }
        double cociente;
        cociente = getDividendo() / getDivisor();
        return cociente;
    }

    //FUNCION PROMEDIAR
    public double promediar (){
        double promedio;
        promedio = (getPromedio1() + getPromedio2() + getPromedio3())/3;
        return promedio;
    }

    // FUNCION RESULTADO
    public void mostrarResultado () {
        System.out.println("Ahorita no joven, salí al almuerzo. Regreso en 15 minutos");
    }

    //--------EVALUACION - FUNCION DESCONTAR----------
    public double descontar (double precioSinDescuento, double porcentajeDescuento){
        double descuento;
        descuento = (precioSinDescuento - (precioSinDescuento * (porcentajeDescuento/100)));
        return descuento;
    }





}
