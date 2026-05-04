package com.the_game.juego_service.dto;
import lombok.*;

@NoArgsConstructor @AllArgsConstructor //Añade los metodos Constructor
@Getter @Setter //añade los metodos Getter & Setter
public class JuegoResponseDTO {
    private int id;
    private String nombre;
    private String categoria;
    private String dificultad;
    private int cantidadMinimaJugadores;
    private int cantidadMaximaJugadores;
    private int duracionMinima;
    private int duracionMaxima;
    private String jugabilidad;
    private String tags;
    private String contenido;
}