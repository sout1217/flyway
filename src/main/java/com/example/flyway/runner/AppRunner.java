package com.example.flyway.runner;

import com.example.flyway.entity.Member;
import com.example.flyway.entity.Team;
import com.example.flyway.repository.MemberRepository;
import com.example.flyway.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component
@RequiredArgsConstructor
public class AppRunner implements ApplicationRunner {

    private final MemberRepository memberRepository;
    private final TeamRepository teamRepository;

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {

        Team aaa = Team.builder()
                .name("AAA")
                .build();

        teamRepository.save(aaa);

        Member flywayMember = Member.builder()
                .name("flywayMember")
                .team(aaa)
                .build();

        memberRepository.save(flywayMember);

    }
}
