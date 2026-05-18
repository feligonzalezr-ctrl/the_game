package com.the_game.notificaciones_service.model;

import java.time.LocalDateTime;

public class Notificacion {

    private Long id;

    private Long usuarioId;

    private String mensaje;

    private String tipo; // PARTIDA, EVENTO, SISTEMA

    private LocalDateTime fecha;

    public Notificacion() {}

    public Notificacion(Long id, Long usuarioId, String mensaje, String tipo, LocalDateTime fecha) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.mensaje = mensaje;
        this.tipo = tipo;
        this.fecha = fecha;
    }

    // getters y setters


    public Long getId() {
        return id;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getTipo() {
        return tipo;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setId(Long id) {
        this.id = id;
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

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}