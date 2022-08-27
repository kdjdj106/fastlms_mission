package com.zerobase.fastlms.member.repository;

import com.zerobase.fastlms.member.entity.Member;
import com.zerobase.fastlms.member.entity.MemberLogInHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberLoginHistoryRepository extends JpaRepository<MemberLogInHistory, String> {
    Optional<MemberLogInHistory> findByUserId(String userId);



}
