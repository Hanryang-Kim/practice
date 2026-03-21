package com.example.practice.member;

import com.example.practice.api.member.Grade;
import com.example.practice.api.member.Member;
import com.example.practice.api.member.MemberService;
import com.example.practice.api.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        //given
        Member memeber = new Member(1L, "memberA", Grade.VIP);

        //when
        memberService.join(memeber);
        Member findMember = memberService.findMember(1L);

        //then
        Assertions.assertThat(memeber).isEqualTo(findMember);

    }
}
