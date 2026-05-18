package com.gameclub.sessionsservice.repository;

import com.gameclub.sessionsservice.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session,Long>{}
