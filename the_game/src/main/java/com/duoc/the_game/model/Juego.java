package com.duoc.the_game.model;
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
        private int cantidadminimadejugadores;
        @Column(nullable = false)
        private int cantidadmaximadejugadores;
        @Column(nullable = false)
        private int duracionminima;
        @Column(nullable = false)
        private int duracionmaxima;
        @Column(nullable = false)
        private String jugabilidad;
        @Column(nullable = true)
        private String tags;
        @Column(nullable = false)
        private String contenido;
}
