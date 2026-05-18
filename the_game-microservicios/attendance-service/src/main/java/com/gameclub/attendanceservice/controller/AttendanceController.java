package com.gameclub.attendanceservice.controller;

import com.gameclub.attendanceservice.model.Attendance;
import com.gameclub.attendanceservice.service.AttendanceService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/attendance")
public class AttendanceController {

private final AttendanceService service;

public AttendanceController(AttendanceService service){
this.service=service;
}

@GetMapping
public List<Attendance> listar(){
return service.listar();
}

@PostMapping
public Attendance guardar(@RequestBody Attendance obj){
return service.guardar(obj);
}

@GetMapping("/{id}")
public Attendance buscar(@PathVariable Long id){
return service.buscar(id);
}

@DeleteMapping("/{id}")
public void eliminar(@PathVariable Long id){
service.eliminar(id);
}
}
