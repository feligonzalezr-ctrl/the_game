package com.the_game.partidas_service.repository;
import com.the_game.partidas_service.model.PartidasServiceModel;

import java.util.ArrayList;
import java.util.List;

public class PartidaRepository {

    private List<PartidasServiceModel> db = new ArrayList<>();

    public List<PartidasServiceModel> findAll() {
        return db;
    }

    public PartidasServiceModel save(PartidasServiceModel p) {
        db.add(p);
        return p;
    }

    public PartidasServiceModel findById(Long id) {
        return db.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void delete(Long id) {
        db.removeIf(p -> p.getId().equals(id));
    }
}
