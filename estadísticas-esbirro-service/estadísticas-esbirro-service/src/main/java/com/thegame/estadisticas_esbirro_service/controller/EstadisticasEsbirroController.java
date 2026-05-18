package com.thegame.estadisticas_esbirro_service.controller;

import com.thegame.estadisticas_esbirro_service.repository.EstadisticasEsbirroRepository;
import com.thegame.estadisticas_esbirro_service.service.EstadisticasEsbirroService;

import java.util.List;
public class EstadisticasEsbirroController {

    private final EstadisticasEsbirroService service = new EstadisticasEsbirroService();

    public List<EstadisticasEsbirroRepository> getAll() {
        return service.getAll();
    }

    public EstadisticasEsbirroRepository  getById(Long id) {
        return service.getById(id);
    }

    public EstadisticasEsbirroRepository  create(EstadisticasEsbirroController  s) {
        return service.create(s);
    }

    public void delete(Long id) {
        service.delete(id);
    }
}
