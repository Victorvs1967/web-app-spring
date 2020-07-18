package com.vvs.web.app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.vvs.web.app.entities.Member;
import com.vvs.web.app.entities.Role;
import com.vvs.web.app.repositories.MemberRepository;

@Service
public class MemberService {

	@Autowired
	private MemberRepository memberRepository;
	
	public Member createMember(Member member) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		member.setPassword(encoder.encode(member.getPassword()));
		Role memberRole = new Role("ADMIN");
		List<Role> roles = new ArrayList<>();
		roles.add(memberRole);
		member.setRole(roles);
		memberRepository.save(member);
		return member;
	}
}
