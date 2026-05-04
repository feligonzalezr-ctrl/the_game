package com.the_game.inventario_service.controller;


import com.the_game.inventario_service.model.Inventario;
import com.the_game.inventario_service.service.InventarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Inventario")
public class InventarioController {

    private final InventarioService inventarioService;
    private Inventario inventario;

    public InventarioController(InventarioService inventarioService) {
        this.inventarioService = inventarioService;
    }

    @GetMapping
    public ResponseEntity<List<Inventario>> findAll(){
        return ResponseEntity.ok(inventarioService.listarInventario());
    }

    @PostMapping
    public ResponseEntity<?>crearInventario(@RequestBody Inventario obj){
        if(!inventarioService.toString(inventario)){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("El datos introducidos no validos");
        }

        Inventario nuevoInventario = inventarioService.guardar(inventario);
                return ResponseEntity.status(HttpStatus.CREATED).body(nuevoInventario);
    }
}
