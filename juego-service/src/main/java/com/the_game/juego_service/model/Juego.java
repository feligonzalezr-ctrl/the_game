package com.the_game.juego_service.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "juegos")
@NoArgsConstructor @AllArgsConstructor //Añade los metodos Constructor
@Getter @Setter //añade los metodos Getter & Setter
@ToString //añade el metodo ToString
public class Juego {
    //Atributos Juegos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String categoria;
    @Column(nullable = false)
    private String dificultad;
    @Column(nullable = false)
    private int cantidadMinimaJugadores;
    @Column(nullable = false)
    private int cantidadMaximaJugadores;
    @Column(nullable = false)
    private int duracionMinima;
    @Column(nullable = false)
    private int duracionMaxima;
    @Column(nullable = false)
    private String jugabilidad;
    @Column(nullable = true)
    private String tags;
    @Column(nullable = false)
    private String contenido;
}
