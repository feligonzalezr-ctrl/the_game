package com.gameclub.membersservice.service;

import com.gameclub.membersservice.model.Member;
import com.gameclub.membersservice.repository.MemberRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MemberService {
private final MemberRepository repository;

public MemberService(MemberRepository repository){
this.repository=repository;
}

public List<Member> listar(){return repository.findAll();}

public Member guardar(Member obj){return repository.save(obj);}

public Member buscar(Long id){return repository.findById(id).orElse(null);}

public void eliminar(Long id){repository.deleteById(id);}
}
