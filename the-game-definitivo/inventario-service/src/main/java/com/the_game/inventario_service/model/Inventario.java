package com.the_game.inventario_service.model;


import jakarta.persistence.*;

@Entity
@Table(name="Inventario")

public class Inventario {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String nombre;

public Long getId() {return id;}
public String getNombre() {return nombre;}

public void setId(Long id) {this.id = id;}
public void setNombre(String nombre) {this.nombre = nombre;}


}
