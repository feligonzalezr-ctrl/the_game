package com.gameclub.statisticsservice.repository;

import com.gameclub.statisticsservice.model.Statistic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatisticRepository extends JpaRepository<Statistic,Long>{}
