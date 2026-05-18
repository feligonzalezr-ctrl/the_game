package com.the_game.game_rules_service.controller;

import com.the_game.game_rules_service.dto.PartidaRequest;
import com.the_game.game_rules_service.model.ResultadoPartida;
import com.the_game.game_rules_service.service.GameRulesService;

public class GameRulesController {

    private GameRulesService service = new GameRulesService();

    public ResultadoPartida validar(PartidaRequest request) {
        return service.validarPartida(request);
    }
}