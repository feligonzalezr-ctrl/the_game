package com.gameclub.membersservice.repository;

import com.gameclub.membersservice.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long>{}
