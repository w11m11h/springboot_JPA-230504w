package com.moohee.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moohee.jpa.dto.MemberDto;

public interface MemberRepository extends JpaRepository<MemberDto, Long>{
	//<엔티티 클래스의 타입, 기본키의 타입>

}
