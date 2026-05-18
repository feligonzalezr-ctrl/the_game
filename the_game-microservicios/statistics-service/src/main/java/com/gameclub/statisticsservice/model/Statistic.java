package com.gameclub.statisticsservice.model;

import jakarta.persistence.*;

@Entity
@Table(name="statistics")
public class Statistic {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String name;

public Long getId(){return id;}
public String getName(){return name;}

public void setId(Long id){this.id=id;}
public void setName(String name){this.name=name;}
}
