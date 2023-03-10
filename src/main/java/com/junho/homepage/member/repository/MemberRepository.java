package com.junho.homepage.member.repository;

import com.junho.homepage.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryExtension {
    Optional<Member> findByAccount(String account);

    Optional<Member> findByName(String name);
}
