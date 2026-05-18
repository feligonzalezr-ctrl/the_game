package com.gameclub.loansservice.controller;

import com.gameclub.loansservice.model.Loan;
import com.gameclub.loansservice.service.LoanService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/loans")
public class LoanController {

private final LoanService service;

public LoanController(LoanService service){
this.service=service;
}

@GetMapping
public List<Loan> listar(){
return service.listar();
}

@PostMapping
public Loan guardar(@RequestBody Loan obj){
return service.guardar(obj);
}

@GetMapping("/{id}")
public Loan buscar(@PathVariable Long id){
return service.buscar(id);
}

@DeleteMapping("/{id}")
public void eliminar(@PathVariable Long id){
service.eliminar(id);
}
}
