package com.the_game.matchmaking_service.model;

import java.util.List;

public class MatchmakingModel {

    private Long id;

    private Long juegoId;

    private List<Long> jugadoresIds;

    private String tipoMatch; // casual, competitivo, aprendizaje

    public MatchmakingModel() {}

    public MatchmakingModel(Long id, Long juegoId, List<Long> jugadoresIds, String tipoMatch) {
        this.id = id;
        this.juegoId = juegoId;
        this.jugadoresIds = jugadoresIds;
        this.tipoMatch = tipoMatch;
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

    public String getTipoMatch() {
        return tipoMatch;
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

    public void setTipoMatch(String tipoMatch) {
        this.tipoMatch = tipoMatch;
    }
}