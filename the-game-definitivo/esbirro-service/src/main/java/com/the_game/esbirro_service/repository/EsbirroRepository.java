package com.the_game.esbirro_service.repository;

import com.the_game.esbirro_service.model.Esbirro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EsbirroRepository extends JpaRepository<Esbirro, Integer> { }