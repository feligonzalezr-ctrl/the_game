package com.the_game.matchmaking_service.service;

import com.the_game.matchmaking_service.model.MatchmakingModel;
import com.the_game.matchmaking_service.repository.MatchRepository;

import java.util.ArrayList;
import java.util.List;

public class MatchmakingService {

    private MatchRepository repository = new MatchRepository();

    // 🔥 crea un match simple
    public MatchmakingModel crearMatch(Long juegoId, List<Long> jugadoresIds) {

        String tipo = evaluarTipo(jugadoresIds.size());

        MatchmakingModel m = new MatchmakingModel(null, juegoId, jugadoresIds, tipo);

        return repository.save(m);
    }

    // tipo de partida
    private String evaluarTipo(int cantidadJugadores) {

        if (cantidadJugadores <= 2) {
            return "DUEL";
        } else if (cantidadJugadores <= 4) {
            return "CASUAL";
        } else {
            return "GRAN_PARTIDA";
        }
    }

    public List<MatchmakingModel> getAll() {
        return repository.findAll();
    }
}