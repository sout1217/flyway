package com.example.flyway.dev.repository;

import com.example.flyway.dev.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MemberRepository extends JpaRepository<Member, Long> {
}
