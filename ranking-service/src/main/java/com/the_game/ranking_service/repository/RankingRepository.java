package com.the_game.ranking_service.repository;

import com.the_game.ranking_service.model.RankingJugadorModel;

import java.util.ArrayList;
import java.util.List;

public class RankingRepository {

    private List<RankingJugadorModel> db = new ArrayList<>();

    public List<RankingJugadorModel> findAll() {
        return db;
    }

    public RankingJugadorModel save(RankingJugadorModel r) {
        db.add(r);
        return r;
    }

    public RankingJugadorModel findByStaffId(Long staffId) {
        return db.stream()
                .filter(r -> r.getStaffId().equals(staffId))
                .findFirst()
                .orElse(null);
    }
}