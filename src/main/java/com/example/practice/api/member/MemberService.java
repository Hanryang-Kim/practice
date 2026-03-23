package com.example.practice.api.member;

public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}