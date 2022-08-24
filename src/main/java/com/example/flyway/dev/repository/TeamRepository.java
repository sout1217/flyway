package com.example.flyway.dev.repository;

import com.example.flyway.dev.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
