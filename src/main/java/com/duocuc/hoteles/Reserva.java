package com.duocuc.hoteles;

import java.util.List;

public class Reserva{

    private int codReserva;
    private Date fechaIngreso;
    private Date fechaSalida;
    private List<Huesped> huesped;
    private List<Habitacion> habitacion;


    public Reserva (int codReserva, Date fechaIngreso, Date fecehaSalida, List<Huesped> huesped, List<Habitacion> habitacion){

        this.codReserva = codReserva;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.Huesped = huesped;
        this.huesped = huesped;
        this.habitacion = habitacion;


    }

    public String getCodigoReserva(){

        return codigoReserva;

    }

    public String getFechaIngreso(){

        return fechaIngreso;

    }

    public String getFechaSalida(){

        return fechaSalida;

    }

    public List<Huesped> huesped(){

        return huesped;

    }

    public List<Habitacion> habitacion(){

        return habitacion;

    }



}