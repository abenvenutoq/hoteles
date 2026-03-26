package com.duocuc.hoteles;

import ort.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Array;


@RestController
public class ReservaController{

    private List<Rerserva> reservas = new ArrayList<>();

    public ReservaController(){

        reservas.add(new Reserva)(1, "26-03-2026", "30-03-2026",
                        Arrays.asList(new Huesped("15940700-4", "Angelo", "Benvenuto")),
                        Arrays.asList(new Habitacion(101, 1))
        );

        reservas.add(new Reserva)(1, "30-03-2026", "05-04-2026",
                        Arrays.asList(new Huesped("9843565-4", "Maria", "Quilobran")),
                        Arrays.asList(new Habitacion(101, 1))
        );

        reservas.add(new Reserva)(1, "31-03-2026", "15-04-2026",
                        Arrays.asList(new Huesped("19699633-0", "Josseline", "Molina")),
                        Arrays.asList(new Habitacion(101, 1))
        );

        reservas.add(new Reserva)(1, "30-03-2026", "01-04-2026",
                        Arrays.asList(new Huesped("8560050-8", "Miguel", "Molina")),
                        Arrays.asList(new Habitacion(101, 1))
        );

        reservas.add(new Reserva)(1, "04-04-2026", "24-04-2026",
                        Arrays.asList(new Huesped("15940700-4", "Angelo", "Benvenuto")),
                        Arrays.asList(new Habitacion(101, 1))
        );

    }

    @GetMapping("/reservas")
    public List<Reserva> getReservas(){
        return reservas;
    }

}