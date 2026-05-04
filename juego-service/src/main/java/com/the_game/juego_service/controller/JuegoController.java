package com.the_game.juego_service.controller;
import  com.the_game.juego_service.model.Juego;
import com.the_game.juego_service.service.JuegoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/v1/juegos")
public class JuegoController {
    public final JuegoService juegoService;
    public JuegoController(JuegoService juegoService){
        this.juegoService=juegoService;
    }

    @GetMapping
    public ResponseEntity<List<Juego>> obtenerJuegos(){
        return ResponseEntity.ok(juegoService.listarJuegos());
    }

    @PostMapping
    public ResponseEntity<?> crearJuego(@RequestBody Juego juego){
        if(!juegoService.datosValidos(juego)){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Datos del juego inválidos");
        }
        Juego nuevoJuego=juegoService.agregarJuego(juego);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoJuego);
    }
}
