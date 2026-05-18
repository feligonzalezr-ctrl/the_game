package com.gameclub.staffgamesservice.service;

import com.gameclub.staffgamesservice.model.StaffGame;
import com.gameclub.staffgamesservice.repository.StaffGameRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StaffGameService {
private final StaffGameRepository repository;

public StaffGameService(StaffGameRepository repository){
this.repository=repository;
}

public List<StaffGame> listar(){return repository.findAll();}

public StaffGame guardar(StaffGame obj){return repository.save(obj);}

public StaffGame buscar(Long id){return repository.findById(id).orElse(null);}

public void eliminar(Long id){repository.deleteById(id);}
}
