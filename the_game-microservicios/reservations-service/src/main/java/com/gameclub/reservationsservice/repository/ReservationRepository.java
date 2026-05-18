package com.gameclub.reservationsservice.repository;

import com.gameclub.reservationsservice.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Long>{}
