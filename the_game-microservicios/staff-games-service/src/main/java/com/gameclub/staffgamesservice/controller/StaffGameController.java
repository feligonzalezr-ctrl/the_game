package com.gameclub.staffgamesservice.controller;

import com.gameclub.staffgamesservice.model.StaffGame;
import com.gameclub.staffgamesservice.service.StaffGameService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/staff_games")
public class StaffGameController {

private final StaffGameService service;

public StaffGameController(StaffGameService service){
this.service=service;
}

@GetMapping
public List<StaffGame> listar(){
return service.listar();
}

@PostMapping
public StaffGame guardar(@RequestBody StaffGame obj){
return service.guardar(obj);
}

@GetMapping("/{id}")
public StaffGame buscar(@PathVariable Long id){
return service.buscar(id);
}

@DeleteMapping("/{id}")
public void eliminar(@PathVariable Long id){
service.eliminar(id);
}
}
