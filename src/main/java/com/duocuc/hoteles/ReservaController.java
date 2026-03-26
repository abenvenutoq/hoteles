package com.duocuc.hoteles;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;



@RestController
public class ReservaController{

    private List<Reserva> reservas = new ArrayList<>();


    // Formato de hoy para fechaIngreso y fechaSalida, para poder obtener valores al consultar endpoints ingresos_hoy y salidas_hoy
    LocalDate ld = LocalDate.now();
    DateTimeFormatter ff = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    String fechaString = ld.format(ff); // fechaString se utiliza para agregar algunos datos de fechas en memoria.

    public ReservaController(){

        reservas.add(new Reserva (1, "03-03-2026", fechaString,
                        Arrays.asList(new Huesped("19998344-4", "Cristian", "Soto")),
                        Arrays.asList(new Habitacion(101, 1)))
        );

        reservas.add(new Reserva (1, "10-03-2026", fechaString,
                        Arrays.asList(new Huesped("12767373-4", "Romina", "Rolanini")),
                        Arrays.asList(new Habitacion(101, 1)))
        );

        reservas.add(new Reserva (1, "27-03-2026", "30-03-2026",
                        Arrays.asList(new Huesped("15940700-4", "Angelo", "Benvenuto")),
                        Arrays.asList(new Habitacion(101, 1)))
        );

        reservas.add(new Reserva (2, "30-03-2026", "05-04-2026",
                        Arrays.asList(new Huesped("9843565-4", "Maria", "Quilobran")),
                        Arrays.asList(new Habitacion(305, 3)))
        );

        reservas.add(new Reserva (3, "31-03-2026", "15-04-2026",
                        Arrays.asList(new Huesped("19699633-0", "Josseline", "Molina")),
                        Arrays.asList(new Habitacion(673, 6)))
        );

        reservas.add(new Reserva (4, "30-03-2026", "01-04-2026",
                        Arrays.asList(new Huesped("8560050-8", "Miguel", "Molina")),
                        Arrays.asList(new Habitacion(484, 4)))
        );

        reservas.add(new Reserva (5, "04-04-2026", "24-04-2026",
                        Arrays.asList(new Huesped("15940700-4", "Angelo", "Benvenuto")),
                        Arrays.asList(new Habitacion(222, 2)))
        );

        reservas.add(new Reserva (6, fechaString, "05-05-2026",
                        Arrays.asList(new Huesped("11940722-4", "Carolina", "Pineda")),
                        Arrays.asList(new Habitacion(222, 2)))
        );

        reservas.add(new Reserva (7, fechaString, "30-06-2026",
                        Arrays.asList(new Huesped("19940774-4", "Sandra", "Martelli")),
                        Arrays.asList(new Habitacion(222, 2)))
        );

        reservas.add(new Reserva (8, fechaString, "05-04-2026",
                        Arrays.asList(new Huesped("7768892-7", "Claudia", "Abarca")),
                        Arrays.asList(new Habitacion(222, 2)))
        );

    }

    // Endpint para mostras todas las reservas
    @GetMapping("/reservas")
    public List<Reserva> obtenerTodasLasReservas() {
        return reservas;
    }

    // Endpoint para buscar reservas por Rut
    @GetMapping("/rut/{rut}")
    public List<Reserva> buscarRutReserva(@PathVariable String rut) {

        List<Reserva> reservaEncontrada = new ArrayList<>();

        for (Reserva reserva : reservas) {

            for(Huesped huesped : reserva.getHuesped()){

                if (huesped.getRut().equals(rut)) {
                    
                    reservaEncontrada.add(reserva);

                    break;

                }
             }

        }
    
        return reservaEncontrada;
    }

    // Endpoint para buscar reserva por codigo de reserva
    @GetMapping("/reserva/{codReserva}")
    public List<Reserva> getCodReserva(@PathVariable int codReserva){

        List<Reserva> reservaEncontrada = new ArrayList<>();

        for (Reserva reserva : reservas){

            if(reserva.getCodReserva() == codReserva) {

                reservaEncontrada.add(reserva);

                break;

            }
            
        }
        return reservaEncontrada;
    }

    // Endpoint para mostrar las reservas que inician hoy
    @GetMapping("/ingresos_hoy")
    public List<Reserva> getReservasHoy(){

        LocalDate fechaLocal = LocalDate.now();

        DateTimeFormatter fechaFormato = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String fechaIngreso = fechaLocal.format(fechaFormato);

        List<Reserva> reservaEncontrada = new ArrayList<>();

        for (Reserva reserva : reservas){

            if(reserva.getFechaIngreso().equals(fechaIngreso)) {

                reservaEncontrada.add(reserva);

            }
            
        }
        return reservaEncontrada;

    }

    // Endpoint para mostrar las reservas que inician hoy
    @GetMapping("/salidas_hoy")
    public List<Reserva> getSalidasHoy(){

        LocalDate fechaLocal = LocalDate.now();

        DateTimeFormatter fechaFormato = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String fechaIngreso = fechaLocal.format(fechaFormato);

        List<Reserva> reservaEncontrada = new ArrayList<>();

        for (Reserva reserva : reservas){

            if(reserva.getFechaSalida().equals(fechaIngreso)) {

                reservaEncontrada.add(reserva);

            }
            
        }
        return reservaEncontrada;

    }


}