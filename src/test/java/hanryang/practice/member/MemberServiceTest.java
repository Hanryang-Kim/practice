package hanryang.practice.member;

import hanryang.practice.api.member.Grade;
import hanryang.practice.api.member.Member;
import hanryang.practice.api.member.MemberService;
import hanryang.practice.api.member.MemberServiceImpl;
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
