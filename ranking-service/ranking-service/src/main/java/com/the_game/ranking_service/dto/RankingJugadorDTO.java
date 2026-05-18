package com.the_game.ranking_service.dto;

public class RankingJugadorDTO {

    private Long id;
    private Long staffId;
    private int puntos;
    private int victorias;
    private int partidasJugadas;

    public RankingJugadorDTO() {}

    public RankingJugadorDTO(Long id, Long staffId, int puntos, int victorias, int partidasJugadas) {
        this.id = id;
        this.staffId = staffId;
        this.puntos = puntos;
        this.victorias = victorias;
        this.partidasJugadas = partidasJugadas;
    }

    // getters y setters


    public Long getId() {
        return id;
    }

    public Long getStaffId() {
        return staffId;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getVictorias() {
        return victorias;
    }

    public int getPartidasJugadas() {
        return partidasJugadas;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public void setPartidasJugadas(int partidasJugadas) {
        this.partidasJugadas = partidasJugadas;
    }
}