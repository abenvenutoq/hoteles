package com.duocuc.hoteles;

import java.util.List;


public class Huesped{

    private String rut;
    private String nombre;
    private String apellido;

    private Huesped (String rut, String nombre, String apellido){

        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;

    }

    //GET

    public String getRut(){
        return rut;
    }

    public String getNombre(){

        return nombre;

    }

    public String getApellido(){

        return apellido;

    }

}