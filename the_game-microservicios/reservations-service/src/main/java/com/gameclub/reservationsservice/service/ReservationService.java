package com.gameclub.reservationsservice.service;

import com.gameclub.reservationsservice.model.Reservation;
import com.gameclub.reservationsservice.repository.ReservationRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReservationService {
private final ReservationRepository repository;

public ReservationService(ReservationRepository repository){
this.repository=repository;
}

public List<Reservation> listar(){return repository.findAll();}

public Reservation guardar(Reservation obj){return repository.save(obj);}

public Reservation buscar(Long id){return repository.findById(id).orElse(null);}

public void eliminar(Long id){repository.deleteById(id);}
}
