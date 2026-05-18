package com.gameclub.gamesservice.controller;

import com.gameclub.gamesservice.model.Game;
import com.gameclub.gamesservice.service.GameService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/games")
public class GameController {

private final GameService service;

public GameController(GameService service){
this.service=service;
}

@GetMapping
public List<Game> listar(){
return service.listar();
}

@PostMapping
public Game guardar(@RequestBody Game obj){
return service.guardar(obj);
}

@GetMapping("/{id}")
public Game buscar(@PathVariable Long id){
return service.buscar(id);
}

@DeleteMapping("/{id}")
public void eliminar(@PathVariable Long id){
service.eliminar(id);
}
}
