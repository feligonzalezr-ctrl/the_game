package com.the_game.matchmaking_service.repository;

import com.the_game.matchmaking_service.model.MatchmakingModel;

import java.util.ArrayList;
import java.util.List;

public class MatchRepository {

    private List<MatchmakingModel> db = new ArrayList<>();

    public List<MatchmakingModel> findAll() {
        return db;
    }

    public MatchmakingModel save(MatchmakingModel m) {
        db.add(m);
        return m;
    }
}