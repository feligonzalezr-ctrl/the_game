package com.the_game.juego_service.dto;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter @Setter //añade los metodos Getter & Setter
public class JuegoRequestDTO{
    @NotBlank(message = "El nombre del juego es obligatorio")
    private String nombre;
    @NotBlank(message = "La categoria del juego es obligatoria")
    private String categoria;
    @NotBlank(message = "La dificultad del juego es obligatoria")
    private String dificultad;
    @Min(value = 1, message = "La cantidad minima de jugadores debe ser mayor que cero")
    private int cantidadMinimaJugadores;
    @Min(value = 1, message = "La cantidad maxima de jugadores debe ser mayor que cero")
    private int cantidadMaximaJugadores;
    @Min(value = 1, message = "La duracion minima debe ser mayor que cero")
    private int duracionMinima;
    @Min(value = 1, message = "La duracion maxima debe ser mayor que cero")
    private int duracionMaxima;
    @NotBlank(message = "La jugabilidad es obligatorio")
    private String jugabilidad;
    private String tags;
    @NotBlank(message = "El contenido del juego es obligatorio")
    private String contenido;

}