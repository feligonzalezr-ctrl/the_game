package com.gameclub.membersservice.controller;

import com.gameclub.membersservice.model.Member;
import com.gameclub.membersservice.service.MemberService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/members")
public class MemberController {

private final MemberService service;

public MemberController(MemberService service){
this.service=service;
}

@GetMapping
public List<Member> listar(){
return service.listar();
}

@PostMapping
public Member guardar(@RequestBody Member obj){
return service.guardar(obj);
}

@GetMapping("/{id}")
public Member buscar(@PathVariable Long id){
return service.buscar(id);
}

@DeleteMapping("/{id}")
public void eliminar(@PathVariable Long id){
service.eliminar(id);
}
}
