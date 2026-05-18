package com.gameclub.reservationsservice.model;

import jakarta.persistence.*;

@Entity
@Table(name="reservations")
public class Reservation {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String name;

public Long getId(){return id;}
public String getName(){return name;}

public void setId(Long id){this.id=id;}
public void setName(String name){this.name=name;}
}
