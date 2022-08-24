package com.example.flyway.runner;

import com.example.flyway.entity.Member;
import com.example.flyway.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class AppRunner implements ApplicationRunner {

    private final MemberRepository memberRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Member flywayMember = Member.builder()
                .name("flywayMember")
                .build();

        memberRepository.save(flywayMember);

    }
}
