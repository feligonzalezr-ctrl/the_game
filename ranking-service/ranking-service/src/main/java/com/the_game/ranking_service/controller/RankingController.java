package com.the_game.ranking_service.controller;

import com.the_game.ranking_service.model.RankingJugadorModel;
import com.the_game.ranking_service.service.RankingService;

import java.util.List;

public class RankingController {

    private RankingService service = new RankingService();

    public List<RankingJugadorModel> getAll() {
        return service.getAll();
    }

    public RankingJugadorModel getByStaffId(Long id) {
        return service.getByStaffId(id);
    }

    public RankingJugadorModel create(RankingJugadorModel r) {
        return service.create(r);
    }

    public void victoria(Long staffId) {
        service.registrarVictoria(staffId);
    }

    public void partida(Long staffId) {
        service.registrarPartida(staffId);
    }
}