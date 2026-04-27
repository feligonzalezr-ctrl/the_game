package com.duoc.the_game.model;
import java.util.Date;

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

    //Constructor
    public Inventario() {
    }
    public Inventario(String observaciones, Juego juego, int id, Date fecha, Esbirro esbirro, int cantidadCartas, String componentes, String estdo) {
        this.observaciones = observaciones;
        this.juego = juego;
        this.id = id;
        this.fecha = fecha;
        this.esbirro = esbirro;
        this.cantidadCartas = cantidadCartas;
        this.componentes = componentes;
        this.estdo = estdo;
    }

    //Getter & Setter
    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstdo() {
        return estdo;
    }

    public void setEstdo(String estdo) {
        this.estdo = estdo;
    }

    public Esbirro getEsbirro() {
        return esbirro;
    }

    public void setEsbirro(Esbirro esbirro) {
        this.esbirro = esbirro;
    }

    public int getCantidadCartas() {
        return cantidadCartas;
    }

    public void setCantidadCartas(int cantidadCartas) {
        this.cantidadCartas = cantidadCartas;
    }

    public String getComponentes() {
        return componentes;
    }

    public void setComponentes(String componentes) {
        this.componentes = componentes;
    }
}
