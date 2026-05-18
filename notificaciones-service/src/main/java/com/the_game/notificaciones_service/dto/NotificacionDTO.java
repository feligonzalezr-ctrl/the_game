package com.the_game.notificaciones_service.dto;

import java.time.LocalDateTime;

public class NotificacionDTO {

    private Long usuarioId;
    private String mensaje;
    private String tipo;

    public NotificacionDTO() {}

    public NotificacionDTO(Long usuarioId, String mensaje, String tipo) {
        this.usuarioId = usuarioId;
        this.mensaje = mensaje;
        this.tipo = tipo;
    }

    // getters y setters


    public Long getUsuarioId() {
        return usuarioId;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}