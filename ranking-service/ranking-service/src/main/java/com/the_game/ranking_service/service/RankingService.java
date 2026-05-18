package com.the_game.ranking_service.service;

import com.the_game.ranking_service.model.RankingJugadorModel;
import com.the_game.ranking_service.repository.RankingRepository;

import java.util.List;

public class RankingService {

    private RankingRepository repository = new RankingRepository();

    public List<RankingJugadorModel> getAll() {
        return repository.findAll();
    }

    public RankingJugadorModel getByStaffId(Long staffId) {
        return repository.findByStaffId(staffId);
    }

    public RankingJugadorModel create(RankingJugadorModel r) {
        return repository.save(r);
    }

    // 🔥 lógica clave: sumar victoria
    public void registrarVictoria(Long staffId) {

        RankingJugadorModel r = repository.findByStaffId(staffId);

        if (r == null) {
            r = new RankingJugadorModel(staffId, staffId, 10, 1, 1);
            repository.save(r);
        } else {
            r.setVictorias(r.getVictorias() + 1);
            r.setPuntos(r.getPuntos() + 10);
            r.setPartidasJugadas(r.getPartidasJugadas() + 1);
        }
    }

    // derrota o participación
    public void registrarPartida(Long staffId) {

        RankingJugadorModel r = repository.findByStaffId(staffId);

        if (r == null) {
            r = new RankingJugadorModel(staffId, staffId, 1, 0, 1);
            repository.save(r);
        } else {
            r.setPuntos(r.getPuntos() + 1);
            r.setPartidasJugadas(r.getPartidasJugadas() + 1);
        }
    }
}