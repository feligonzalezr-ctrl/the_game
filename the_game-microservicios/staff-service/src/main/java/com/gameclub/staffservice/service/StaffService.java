package com.gameclub.staffservice.service;

import com.gameclub.staffservice.model.Staff;
import com.gameclub.staffservice.repository.StaffRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StaffService {
private final StaffRepository repository;

public StaffService(StaffRepository repository){
this.repository=repository;
}

public List<Staff> listar(){return repository.findAll();}

public Staff guardar(Staff obj){return repository.save(obj);}

public Staff buscar(Long id){return repository.findById(id).orElse(null);}

public void eliminar(Long id){repository.deleteById(id);}
}
