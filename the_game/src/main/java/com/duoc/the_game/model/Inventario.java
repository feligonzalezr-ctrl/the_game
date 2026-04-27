package com.duoc.the_game.model;
import java.util.Date;
import lombok.*;

@NoArgsConstructor @AllArgsConstructor //Añade los metodos Constructor
@Getter @Setter //añade los metodos Getter & Setter
@ToString //añade el metodo ToString
public class Inventario {
    //Atributos
    private int id;
    private Juego juego;
    private Esbirro esbirro;
    private Date fecha;
    private String estdo;
    private int cantidadCartas;
    private String componentes;
    private String observaciones;
}
