package com.krakedev;

public class Mensajeria {

    private String mensaje;
    private String nombre;
    private String apellido;

    //GETTERS
    public String getMensaje() {
        return mensaje;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    //SETTERS
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    //METODO SALUDAR
    public void saludar () {
        System.out.println(getMensaje());
    }

    //METODO SALUDAR PERSONA

    public void saludarPersona () {
        System.out.println("Hola " + getNombre() + " " + getApellido());
    }
}
