package com.thegame.estadisticas_esbirro_service.service;

import com.thegame.estadisticas_esbirro_service.controller.EstadisticasEsbirroController;
import com.thegame.estadisticas_esbirro_service.repository.EstadisticasEsbirroRepository;

import java.util.List;

public class EstadisticasEsbirroService {

    private EstadisticasEsbirroRepository repository = new EstadisticasEsbirroRepository();

    public List<EstadisticasEsbirroRepository> getAll() {
        return repository.findAll();
    }

    public EstadisticasEsbirroRepository getById(Long id) {
        return repository.findById(id);
    }

    public EstadisticasEsbirroRepository create(EstadisticasEsbirroController s) {
        return repository.save(s);
    }

    public void delete(Long id) {
        repository.delete(id);
    }


    public String nivelMiembro(EstadisticasEsbirroRepository s) {
        int score = s.getconocimientoJuegos() + s.getparticipacion();

        if (score > 150) return "Experto del club";
        if (score > 80) return "Jugador activo";
        return "Novato";
    }
}
