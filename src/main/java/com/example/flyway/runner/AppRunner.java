package com.example.flyway.runner;

import com.example.flyway.entity.Member;
import com.example.flyway.entity.Team;
import com.example.flyway.repository.MemberRepository;
import com.example.flyway.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class AppRunner implements CommandLineRunner {

    private final MemberRepository memberRepository;
    private final TeamRepository teamRepository;

    @Override
    @Order(2)
    public void run(String... args) throws Exception {
        Team aaa = Team.builder()
            .name("AAA")
            .build();

        teamRepository.save(aaa);

        Member flywayMember = Member.builder()
                .name("flywayMember")
//                .team(aaa)
                .build();

        memberRepository.save(flywayMember);
    }
}
