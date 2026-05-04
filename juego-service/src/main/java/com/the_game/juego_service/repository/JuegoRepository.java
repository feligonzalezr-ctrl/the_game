package com.the_game.juego_service.repository;
import com.the_game.juego_service.model.Juego;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JuegoRepository extends JpaRepository<Juego, Integer> { }
