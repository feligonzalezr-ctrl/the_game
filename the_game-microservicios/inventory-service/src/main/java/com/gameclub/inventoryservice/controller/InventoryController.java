package com.gameclub.inventoryservice.controller;

import com.gameclub.inventoryservice.model.Inventory;
import com.gameclub.inventoryservice.service.InventoryService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

private final InventoryService service;

public InventoryController(InventoryService service){
this.service=service;
}

@GetMapping
public List<Inventory> listar(){
return service.listar();
}

@PostMapping
public Inventory guardar(@RequestBody Inventory obj){
return service.guardar(obj);
}

@GetMapping("/{id}")
public Inventory buscar(@PathVariable Long id){
return service.buscar(id);
}

@DeleteMapping("/{id}")
public void eliminar(@PathVariable Long id){
service.eliminar(id);
}
}
