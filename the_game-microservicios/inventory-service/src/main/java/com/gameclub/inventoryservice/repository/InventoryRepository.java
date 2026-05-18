package com.gameclub.inventoryservice.repository;

import com.gameclub.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory,Long>{}
