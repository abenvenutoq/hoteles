package com.duocuc.hoteles;

public class Habitacion{
    private int numero;
    private int piso;

    public Habitacion(int numero, int piso){
        this.numero = numero;
        this.piso = piso;
    }

    // GET
    public int getNumero(){
        return numero;
    }

    public int getPiso(){
        return piso;
    }

}

