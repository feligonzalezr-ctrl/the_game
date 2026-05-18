package com.the_game.jugador_service.repository;

import com.the_game.jugador_service.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository {

    private List<Usuario> db = new ArrayList<>();

    public List<Usuario> findAll() {
        return db;
    }

    public Usuario save(Usuario u) {
        db.add(u);
        return u;
    }

    public Usuario findById(Long id) {
        return db.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void delete(Long id) {
        db.removeIf(u -> u.getId().equals(id));
    }
}