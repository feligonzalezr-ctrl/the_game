package com.gameclub.sessionsservice.controller;

import com.gameclub.sessionsservice.model.Session;
import com.gameclub.sessionsservice.service.SessionService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/sessions")
public class SessionController {

private final SessionService service;

public SessionController(SessionService service){
this.service=service;
}

@GetMapping
public List<Session> listar(){
return service.listar();
}

@PostMapping
public Session guardar(@RequestBody Session obj){
return service.guardar(obj);
}

@GetMapping("/{id}")
public Session buscar(@PathVariable Long id){
return service.buscar(id);
}

@DeleteMapping("/{id}")
public void eliminar(@PathVariable Long id){
service.eliminar(id);
}
}
