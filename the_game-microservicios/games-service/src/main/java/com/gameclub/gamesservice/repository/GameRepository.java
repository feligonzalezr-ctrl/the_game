package com.gameclub.gamesservice.repository;

import com.gameclub.gamesservice.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long>{}
