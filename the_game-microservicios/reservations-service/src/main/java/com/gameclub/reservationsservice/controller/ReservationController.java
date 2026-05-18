package com.gameclub.reservationsservice.controller;

import com.gameclub.reservationsservice.model.Reservation;
import com.gameclub.reservationsservice.service.ReservationService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {

private final ReservationService service;

public ReservationController(ReservationService service){
this.service=service;
}

@GetMapping
public List<Reservation> listar(){
return service.listar();
}

@PostMapping
public Reservation guardar(@RequestBody Reservation obj){
return service.guardar(obj);
}

@GetMapping("/{id}")
public Reservation buscar(@PathVariable Long id){
return service.buscar(id);
}

@DeleteMapping("/{id}")
public void eliminar(@PathVariable Long id){
service.eliminar(id);
}
}
