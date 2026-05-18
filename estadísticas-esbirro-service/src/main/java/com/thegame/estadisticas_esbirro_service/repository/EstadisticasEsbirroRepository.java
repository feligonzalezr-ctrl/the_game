package com.thegame.estadisticas_esbirro_service.repository;

import com.thegame.estadisticas_esbirro_service.model.EstadisticasEsbirroModel;

import java.util.ArrayList;
import java.util.List;

public class EstadisticasEsbirroRepository {

    private List<EstadisticasEsbirroRepository> db = new ArrayList<>();

    public List<EstadisticasEsbirroRepository> findAll() {
        return db;
    }

    public EstadisticasEsbirroRepository save (EstadisticasEsbirroRepository s) {
        db.add(s);
        return s;
    }

    public EstadisticasEsbirroRepository findById (Long id) {
        return db.stream()
                .filter(s -> {
                    assert s.getId() != null;
                    return s.getId().equals(id);
                })
                .findFirst()
                .orElse(null);

    }

    public void delete (Long id) {
        db.removeIf(s -> {
            assert s.getId() != null;
            return s.getId().equals(id);
        });
    }

    private Object getId() {
        return null;
    }

    public int getconocimientoJuegos() {
        return 0;
    }

    public int getparticipacion() {
        return 0;
    }


}
