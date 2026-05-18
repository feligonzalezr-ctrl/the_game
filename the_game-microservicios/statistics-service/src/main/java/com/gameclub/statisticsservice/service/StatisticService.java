package com.gameclub.statisticsservice.service;

import com.gameclub.statisticsservice.model.Statistic;
import com.gameclub.statisticsservice.repository.StatisticRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StatisticService {
private final StatisticRepository repository;

public StatisticService(StatisticRepository repository){
this.repository=repository;
}

public List<Statistic> listar(){return repository.findAll();}

public Statistic guardar(Statistic obj){return repository.save(obj);}

public Statistic buscar(Long id){return repository.findById(id).orElse(null);}

public void eliminar(Long id){repository.deleteById(id);}
}
