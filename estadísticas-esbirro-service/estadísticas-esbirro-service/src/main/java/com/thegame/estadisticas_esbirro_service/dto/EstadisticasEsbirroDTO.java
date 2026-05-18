package com.thegame.estadisticas_esbirro_service.dto;

public class EstadisticasEsbirroDTO {

    private Long id;
    private String nombre;
    private int conocimientoJuegos;
    private int horarioDisposicion;
    private int horarioInicial;
    private int horarioFinal;
    private int participacion;
    private String juegosFavorito;

    public EstadisticasEsbirroDTO() {}

    public EstadisticasEsbirroDTO(Long id, String nombre, int conocimientoJuegos, int horarioDisposicion, int participacion, String juegosFavorito){
        this.id = id;
        this.nombre = nombre;
        this.conocimientoJuegos = conocimientoJuegos;
        this.horarioDisposicion = horarioDisposicion;
        this.participacion = participacion;
        this.juegosFavorito = juegosFavorito;
    }

    // getters y setters


    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
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

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

