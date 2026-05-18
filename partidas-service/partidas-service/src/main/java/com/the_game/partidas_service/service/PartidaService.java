package com.the_game.partidas_service.service;

import com.the_game.partidas_service.model.PartidasServiceModel;
import com.the_game.partidas_service.repository.PartidaRepository;

import java.util.List;

public class PartidaService {

    private PartidaRepository repository = new PartidaRepository();

    public List<PartidasServiceModel> getAll() {
        return repository.findAll();
    }

    public PartidasServiceModel getById(Long id) {
        return repository.findById(id);
    }

    public PartidasServiceModel create(PartidasServiceModel p) {
        return repository.save(p);
    }

    public void delete(Long id) {
        repository.delete(id);
    }

    // ranking
    public boolean esGanador(Long jugadorId, PartidasServiceModel p) {
        return p.getGanadorId() != null && p.getGanadorId().equals(jugadorId);
    }
}