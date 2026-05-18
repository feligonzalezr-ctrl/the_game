package com.gameclub.statisticsservice.controller;

import com.gameclub.statisticsservice.model.Statistic;
import com.gameclub.statisticsservice.service.StatisticService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/statistics")
public class StatisticController {

private final StatisticService service;

public StatisticController(StatisticService service){
this.service=service;
}

@GetMapping
public List<Statistic> listar(){
return service.listar();
}

@PostMapping
public Statistic guardar(@RequestBody Statistic obj){
return service.guardar(obj);
}

@GetMapping("/{id}")
public Statistic buscar(@PathVariable Long id){
return service.buscar(id);
}

@DeleteMapping("/{id}")
public void eliminar(@PathVariable Long id){
service.eliminar(id);
}
}
