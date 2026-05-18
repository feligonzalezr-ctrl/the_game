package com.gameclub.inventoryservice.service;

import com.gameclub.inventoryservice.model.Inventory;
import com.gameclub.inventoryservice.repository.InventoryRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InventoryService {
private final InventoryRepository repository;

public InventoryService(InventoryRepository repository){
this.repository=repository;
}

public List<Inventory> listar(){return repository.findAll();}

public Inventory guardar(Inventory obj){return repository.save(obj);}

public Inventory buscar(Long id){return repository.findById(id).orElse(null);}

public void eliminar(Long id){repository.deleteById(id);}
}
