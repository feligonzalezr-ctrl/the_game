package com.the_game.inventario_service.service;

import com.the_game.inventario_service.model.Inventario;
import com.the_game.inventario_service.repository.InventarioRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InventarioService {
private final InventarioRepository inventarioRepository;

public InventarioService(InventarioRepository inventarioRepository) {
    this.inventarioRepository = inventarioRepository;
}

public List<Inventario> listar(){return inventarioRepository.findAll();}

public Inventario guardar(Inventario obj){return inventarioRepository.save(obj);}

public void eliminar(Long id){inventarioRepository.deleteById(id);}

    public boolean toString(Inventario inventario) {
        return false;
    }

    public List<Inventario> listarInventario() {
        return null;
    }
}
