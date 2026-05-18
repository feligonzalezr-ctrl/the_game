package com.the_game.notificaciones_service.repository;

import com.the_game.notificaciones_service.model.Notificacion;

import java.util.ArrayList;
import java.util.List;

public class NotificacionRepository {

    private List<Notificacion> db = new ArrayList<>();

    public List<Notificacion> findAll() {
        return db;
    }

    public Notificacion save(Notificacion n) {
        db.add(n);
        return n;
    }

    public List<Notificacion> findByUsuarioId(Long usuarioId) {
        return db.stream()
                .filter(n -> n.getUsuarioId().equals(usuarioId))
                .toList();
    }
}