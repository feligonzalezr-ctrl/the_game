package com.the_game.notificaciones_service.service;

import com.the_game.notificaciones_service.model.Notificacion;
import com.the_game.notificaciones_service.repository.NotificacionRepository;

import java.time.LocalDateTime;
import java.util.List;

public class NotificacionService {

    private NotificacionRepository repository = new NotificacionRepository();

    public Notificacion crearNotificacion(Long usuarioId, String mensaje, String tipo) {

        Notificacion n = new Notificacion(
                null,
                usuarioId,
                mensaje,
                tipo,
                LocalDateTime.now()
        );

        return repository.save(n);
    }

    public List<Notificacion> getAll() {
        return repository.findAll();
    }

    public List<Notificacion> getByUsuario(Long usuarioId) {
        return repository.findByUsuarioId(usuarioId);
    }

    // helper para el sistema
    public void avisoPartida(Long usuarioId, String juego) {
        crearNotificacion(usuarioId, "Nueva partida de " + juego, "PARTIDA");
    }

    public void avisoEvento(Long usuarioId, String evento) {
        crearNotificacion(usuarioId, "Evento: " + evento, "EVENTO");
    }
}