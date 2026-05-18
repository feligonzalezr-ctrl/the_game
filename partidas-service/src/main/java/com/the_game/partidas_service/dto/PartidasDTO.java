package com.the_game.partidas_service.dto;

import java.time.LocalDate;
import java.util.List;

public class PartidasDTO {

    private Long id;
    private Long juegoId;
    private List<Long> jugadoresIds;
    private Long ganadorId;
    private LocalDate fecha;
    private int duracionMinutos;

    public PartidasDTO() {}

    public PartidasDTO(Long id, Long juegoId, List<Long> jugadoresIds, Long ganadorId, LocalDate fecha, int duracionMinutos) {
        this.id = id;
        this.juegoId = juegoId;
        this.jugadoresIds = jugadoresIds;
        this.ganadorId = ganadorId;
        this.fecha = fecha;
        this.duracionMinutos = duracionMinutos;
    }

    // getters y setters


    public Long getId() {
        return id;
    }

    public Long getJuegoId() {
        return juegoId;
    }

    public List<Long> getJugadoresIds() {
        return jugadoresIds;
    }

    public Long getGanadorId() {
        return ganadorId;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setJuegoId(Long juegoId) {
        this.juegoId = juegoId;
    }

    public void setJugadoresIds(List<Long> jugadoresIds) {
        this.jugadoresIds = jugadoresIds;
    }

    public void setGanadorId(Long ganadorId) {
        this.ganadorId = ganadorId;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }
}

