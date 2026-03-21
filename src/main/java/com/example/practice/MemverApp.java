package com.example.practice;

import com.example.practice.api.member.Grade;
import com.example.practice.api.member.Member;
import com.example.practice.api.member.MemberService;
import com.example.practice.api.member.MemberServiceImpl;

public class MemverApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find Member = " + findMember.getName());
    }
}
