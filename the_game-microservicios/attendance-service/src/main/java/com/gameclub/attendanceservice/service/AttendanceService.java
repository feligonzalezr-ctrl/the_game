package com.gameclub.attendanceservice.service;

import com.gameclub.attendanceservice.model.Attendance;
import com.gameclub.attendanceservice.repository.AttendanceRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AttendanceService {
private final AttendanceRepository repository;

public AttendanceService(AttendanceRepository repository){
this.repository=repository;
}

public List<Attendance> listar(){return repository.findAll();}

public Attendance guardar(Attendance obj){return repository.save(obj);}

public Attendance buscar(Long id){return repository.findById(id).orElse(null);}

public void eliminar(Long id){repository.deleteById(id);}
}
