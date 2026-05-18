package com.thegame.estadisticas_esbirro_service.model;



public class EstadisticasEsbirroModel {

    private  String nombre;
    private int esbirroId;
    private int conocimientoJuegos;
    private int horarioDisposicion;
    private int horarioInicial;
    private int horarioFinal;
    private int participacion;
    private String juegosFavorito;

    public EstadisticasEsbirroModel() {}

    public EstadisticasEsbirroModel(Long id, String nombre, int conocimientoJuegos, int horarioDisposicion, int participacion, String juegosFavorito) {
        this.esbirroId = esbirroId;
        this.nombre = nombre;
        this.conocimientoJuegos = conocimientoJuegos;
        this.horarioDisposicion = horarioDisposicion;
        this.participacion = participacion;
        this.juegosFavorito = juegosFavorito;
    }


    //Getter y Setter

    public String getNombre() {
        return nombre;
    }

    public int getEsbirroId() {
        return esbirroId;
    }

    public int getConocimientoJuegos() {
        return conocimientoJuegos;
    }

    public int getHorarioDisposicion() {
        return horarioDisposicion;
    }

    public int getHorarioInicial() {
        return horarioInicial;
    }

    public int getHorarioFinal() {
        return horarioFinal;
    }

    public int getParticipacion() {
        return participacion;
    }

    public String getJuegosFavorito() {
        return juegosFavorito;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEsbirroId(int esbirroId) {
        this.esbirroId = esbirroId;
    }

    public void setConocimientoJuegos(int conocimientoJuegos) {
        this.conocimientoJuegos = conocimientoJuegos;
    }

    public void setHorarioDisposicion(int horarioDisposicion) {
        this.horarioDisposicion = horarioDisposicion;
    }

    public void setHorarioInicial(int horarioInicial) {
        this.horarioInicial = horarioInicial;
    }

    public void setHorarioFinal(int horarioFinal) {
        this.horarioFinal = horarioFinal;
    }

    public void setParticipacion(int participacion) {
        this.participacion = participacion;
    }

    public void setJuegosFavorito(String juegosFavorito) {
        this.juegosFavorito = juegosFavorito;
    }
}
