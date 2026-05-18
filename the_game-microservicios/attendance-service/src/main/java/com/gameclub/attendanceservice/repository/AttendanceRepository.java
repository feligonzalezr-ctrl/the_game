package com.gameclub.attendanceservice.repository;

import com.gameclub.attendanceservice.model.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepository extends JpaRepository<Attendance,Long>{}
