package com.the_game.esbirro_service.controller;


import com.the_game.esbirro_service.model.Esbirro;
import com.the_game.esbirro_service.service.EsbirroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.the_game.esbirro_service.service.EsbirroService.*;


@RestController
@RequestMapping("/api/v1/esbirros")
public class EsbirroController {

    private final EsbirroService esbirroService;

    public EsbirroController(EsbirroService esbirroService) {
        this.esbirroService = esbirroService;
    }

    @GetMapping
    public ResponseEntity<List<Esbirro>> getAllEsbirros() {
        return ResponseEntity.ok(esbirroService.listarEsbirrros());
    }

    @PostMapping
    public ResponseEntity<?> crearEsbirro(@RequestBody Esbirro esbirro) {
        if(!esbirroService.datosValidos(esbirro)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
            .body("Datos del Esbirro invalidos");
        }
        Esbirro nuevoEsbirro = agregarEsbirro(esbirro);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoEsbirro);

    }
}
