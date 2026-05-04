package com.the_game.inventario_service.repository;

import com.the_game.inventario_service.model.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventarioRepository extends JpaRepository<Inventario,Long> {}

