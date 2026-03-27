package com.duocuc.hoteles;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.List;


@JsonPropertyOrder({"codReserva", "huesped", "habitacion", "fechaIngreso", "fechaSalida"})
public class Reserva{
    private int codReserva;
    private String fechaIngreso;
    private String fechaSalida;
    private List<Huesped> huesped;
    private List<Habitacion> habitacion;

    public Reserva (int codReserva, String fechaIngreso, String fechaSalida, List<Huesped> huesped, List<Habitacion> habitacion){
        this.codReserva = codReserva;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.huesped = huesped;
        this.habitacion = habitacion;
    }

    // GET
    public Integer getCodReserva(){
        return codReserva;
    }

    public String getFechaIngreso(){
        return fechaIngreso;
    }

    public String getFechaSalida(){
        return fechaSalida;
    }

    public List<Huesped> getHuesped(){
        return huesped;
    }

    public List<Habitacion> getHabitacion(){
        return habitacion;
    }



}