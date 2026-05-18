package com.the_game.jugador_service.controller;

import com.the_game.jugador_service.model.Usuario;
import com.the_game.jugador_service.service.UsuarioService;

import java.util.List;

public class UsuarioController {

    private UsuarioService service = new UsuarioService();

    public List<Usuario> getAll() {
        return service.getAll();
    }

    public Usuario getById(Long id) {
        return service.getById(id);
    }

    public Usuario create(Usuario u) {
        return service.create(u);
    }

    public void delete(Long id) {
        service.delete(id);
    }
}
