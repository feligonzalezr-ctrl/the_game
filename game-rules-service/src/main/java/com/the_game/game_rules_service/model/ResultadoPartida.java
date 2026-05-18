package com.the_game.game_rules_service.model;

public class ResultadoPartida {

    private boolean valido;

    private String mensaje;

    private Long ganadorId;

    public ResultadoPartida() {}

    public ResultadoPartida(boolean valido, String mensaje, Long ganadorId) {
        this.valido = valido;
        this.mensaje = mensaje;
        this.ganadorId = ganadorId;
    }

    // getters y setters


    public boolean isValido() {
        return valido;
    }

    public String getMensaje() {
        return mensaje;
    }

    public Long getGanadorId() {
        return ganadorId;
    }

    public void setValido(boolean valido) {
        this.valido = valido;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setGanadorId(Long ganadorId) {
        this.ganadorId = ganadorId;
    }
}
