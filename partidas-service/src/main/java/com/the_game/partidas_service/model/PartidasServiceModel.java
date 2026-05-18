package com.the_game.partidas_service.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
public class PartidasServiceModel {

    private Long id;

    private Long juegoId;

    // ids de los Esbirros/staff que jugaron
    private List<Long> jugadoresIds;

    private Long ganadorId;

    private LocalDate fecha;

    private int duracionMinutos;

    public PartidasServiceModel() {}

    public PartidasServiceModel(Long id, Long juegoId, List<Long> jugadoresIds, Long ganadorId, LocalDate fecha, int duracionMinutos) {
        this.id = id;
        this.juegoId = juegoId;
        this.jugadoresIds = jugadoresIds;
        this.ganadorId = ganadorId;
        this.fecha = fecha;
        this.duracionMinutos = duracionMinutos;
    }

    // getters y setters


    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Long getGanadorId() {
        return ganadorId;
    }

    public List<Long> getJugadoresIds() {
        return jugadoresIds;
    }

    public Long getJuegoId() {
        return juegoId;
    }

    public Long getId() {
        return id;
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
