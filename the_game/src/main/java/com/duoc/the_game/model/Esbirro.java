package com.duoc.the_game.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "esbirros")
@NoArgsConstructor @AllArgsConstructor //Añade los metodos Constructor
@Getter @Setter //añade los metodos Getter & Setter
@ToString //añade el metodo ToString
public class Esbirro {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String run;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String nick;
    @Column(nullable = false)
    private int edad;
    @Column(nullable = false)
    private String Disponibilidad;
}
