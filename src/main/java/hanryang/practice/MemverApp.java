package hanryang.practice;

import hanryang.practice.api.member.Grade;
import hanryang.practice.api.member.Member;
import hanryang.practice.api.member.MemberService;
import hanryang.practice.api.member.MemberServiceImpl;

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
