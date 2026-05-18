package com.the_game.jugador_service.service;

import com.the_game.jugador_service.model.Usuario;
import com.the_game.jugador_service.repository.UsuarioRepository;

import java.util.List;

public class UsuarioService {

    private UsuarioRepository repository = new UsuarioRepository();

    public List<Usuario> getAll() {
        return repository.findAll();
    }

    public Usuario getById(Long id) {
        return repository.findById(id);
    }

    public Usuario create(Usuario u) {
        return repository.save(u);
    }

    public void delete(Long id) {
        repository.delete(id);
    }

    // lógica útil para matchmaking
    public boolean esActivo(Usuario u) {
        return u.getHorasDisponibles() >= 2;
    }

    public String categoriaJugador(Usuario u) {
        if (u.getNivelExperiencia() > 80) return "PRO";
        if (u.getNivelExperiencia() > 40) return "INTERMEDIO";
        return "NOVATO";
    }
}