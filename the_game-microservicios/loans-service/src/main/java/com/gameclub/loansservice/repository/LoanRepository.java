package com.gameclub.loansservice.repository;

import com.gameclub.loansservice.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan,Long>{}
