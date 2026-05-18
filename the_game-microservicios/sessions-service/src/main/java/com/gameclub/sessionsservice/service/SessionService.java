package com.gameclub.sessionsservice.service;

import com.gameclub.sessionsservice.model.Session;
import com.gameclub.sessionsservice.repository.SessionRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SessionService {
private final SessionRepository repository;

public SessionService(SessionRepository repository){
this.repository=repository;
}

public List<Session> listar(){return repository.findAll();}

public Session guardar(Session obj){return repository.save(obj);}

public Session buscar(Long id){return repository.findById(id).orElse(null);}

public void eliminar(Long id){repository.deleteById(id);}
}
