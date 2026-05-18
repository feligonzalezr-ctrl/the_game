package com.the_game.game_rules_service.service;

import com.the_game.game_rules_service.dto.PartidaRequest;
import com.the_game.game_rules_service.model.ResultadoPartida;

import java.util.List;
import java.util.Random;

public class GameRulesService {

    // valida si la partida puede jugarse
    public ResultadoPartida validarPartida(PartidaRequest request) {

        if (request.getJugadoresIds().size() < 2) {
            return new ResultadoPartida(false, "No hay suficientes jugadores", null);
        }

        if (request.getJugadoresIds().size() > 6) {
            return new ResultadoPartida(false, "Demasiados jugadores", null);
        }

        Long ganador = calcularGanador(request.getJugadoresIds());

        return new ResultadoPartida(true, "Partida válida", ganador);
    }

    // lógica de ganador
    private Long calcularGanador(List<Long> jugadores) {

        Random random = new Random();

        int index = random.nextInt(jugadores.size());

        return jugadores.get(index);
    }
}