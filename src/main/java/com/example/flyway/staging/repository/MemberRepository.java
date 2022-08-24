package com.example.flyway.staging.repository;

import com.example.flyway.staging.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
