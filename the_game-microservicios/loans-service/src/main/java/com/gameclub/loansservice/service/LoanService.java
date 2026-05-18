package com.gameclub.loansservice.service;

import com.gameclub.loansservice.model.Loan;
import com.gameclub.loansservice.repository.LoanRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LoanService {
private final LoanRepository repository;

public LoanService(LoanRepository repository){
this.repository=repository;
}

public List<Loan> listar(){return repository.findAll();}

public Loan guardar(Loan obj){return repository.save(obj);}

public Loan buscar(Long id){return repository.findById(id).orElse(null);}

public void eliminar(Long id){repository.deleteById(id);}
}
