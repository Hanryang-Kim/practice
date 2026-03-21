package com.example.practice.api.member;

public interface MemberRepository {
    void save(Member member);

    Member findById(Long memberId);

}
