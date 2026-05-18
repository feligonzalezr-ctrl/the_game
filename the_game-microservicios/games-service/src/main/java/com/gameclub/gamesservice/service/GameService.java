package com.gameclub.gamesservice.service;

import com.gameclub.gamesservice.model.Game;
import com.gameclub.gamesservice.repository.GameRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GameService {
private final GameRepository repository;

public GameService(GameRepository repository){
this.repository=repository;
}

public List<Game> listar(){return repository.findAll();}

public Game guardar(Game obj){return repository.save(obj);}

public Game buscar(Long id){return repository.findById(id).orElse(null);}

public void eliminar(Long id){repository.deleteById(id);}
}
