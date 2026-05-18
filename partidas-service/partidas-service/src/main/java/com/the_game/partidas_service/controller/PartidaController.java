package com.the_game.partidas_service.controller;
import com.the_game.partidas_service.model.PartidasServiceModel;
import com.the_game.partidas_service.service.PartidaService;

import java.util.List;

public class PartidaController {

    private final PartidaService service = new PartidaService();

    public List<PartidasServiceModel> getAll() {
        return service.getAll();
    }

    public PartidasServiceModel getById(Long id) {
        return service.getById(id);
    }

    public PartidasServiceModel create(PartidasServiceModel p) {
        return service.create(p);
    }

    public void delete(Long id) {
        service.delete(id);
    }
}