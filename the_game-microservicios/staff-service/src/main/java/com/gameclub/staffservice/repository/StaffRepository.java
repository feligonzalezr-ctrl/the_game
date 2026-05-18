package com.gameclub.staffservice.repository;

import com.gameclub.staffservice.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff,Long>{}
