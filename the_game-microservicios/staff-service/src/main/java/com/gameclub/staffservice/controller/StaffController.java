package com.gameclub.staffservice.controller;

import com.gameclub.staffservice.model.Staff;
import com.gameclub.staffservice.service.StaffService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class StaffController {

private final StaffService service;

public StaffController(StaffService service){
this.service=service;
}

@GetMapping
public List<Staff> listar(){
return service.listar();
}

@PostMapping
public Staff guardar(@RequestBody Staff obj){
return service.guardar(obj);
}

@GetMapping("/{id}")
public Staff buscar(@PathVariable Long id){
return service.buscar(id);
}

@DeleteMapping("/{id}")
public void eliminar(@PathVariable Long id){
service.eliminar(id);
}
}
