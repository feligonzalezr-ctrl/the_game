package com.the_game.game_rules_service.dto;

import java.util.List;

public class PartidaRequest {

    private Long juegoId;

    private List<Long> jugadoresIds;

    public PartidaRequest() {}

    public PartidaRequest(Long juegoId, List<Long> jugadoresIds) {
        this.juegoId = juegoId;
        this.jugadoresIds = jugadoresIds;
    }

    // getters y setters


    public Long getJuegoId() {
        return juegoId;
    }

    public List<Long> getJugadoresIds() {
        return jugadoresIds;
    }

    public void setJugadoresIds(List<Long> jugadoresIds) {
        this.jugadoresIds = jugadoresIds;
    }

    public void setJuegoId(Long juegoId) {
        this.juegoId = juegoId;
    }
}