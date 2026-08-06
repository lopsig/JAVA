package com.krakedev;

public class TestMensajeria {
    public static void main(String[] args) {
        //INSTANCIA
        Mensajeria m1 =  new Mensajeria();

        m1.setMensaje("HOLA MUNDO");
        m1.setNombre("Jonathan");
        m1.setApellido("LS");


        //INVOCAR METODOS
        m1.saludar();

        m1.saludarPersona();

    }
}
