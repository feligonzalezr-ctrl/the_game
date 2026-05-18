package com.the_game.notificaciones_service.controller;

import com.the_game.notificaciones_service.model.Notificacion;
import com.the_game.notificaciones_service.service.NotificacionService;

import java.util.List;

public class NotificacionController {

    private NotificacionService service = new NotificacionService();

    public Notificacion crear(Long usuarioId, String mensaje, String tipo) {
        return service.crearNotificacion(usuarioId, mensaje, tipo);
    }

    public List<Notificacion> getAll() {
        return service.getAll();
    }

    public List<Notificacion> getByUsuario(Long usuarioId) {
        return service.getByUsuario(usuarioId);
    }
}