package com.the_game.matchmaking_service.controller;

import com.the_game.matchmaking_service.model.MatchmakingModel;
import com.the_game.matchmaking_service.service.MatchmakingService;

import java.util.List;

public class MatchController {

    private MatchmakingService service = new MatchmakingService();

    public MatchmakingModel crear(Long juegoId, List<Long> jugadoresIds) {
        return service.crearMatch(juegoId, jugadoresIds);
    }

    public List<MatchmakingModel> getAll() {
        return service.getAll();
    }
}