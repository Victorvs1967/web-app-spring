package com.vvs.web.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vvs.web.app.entities.Member;

public interface MemberRepository extends JpaRepository<Member, String> {

	Member findByEmail(String email);

}
