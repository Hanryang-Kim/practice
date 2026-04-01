package hanryang.practice.api.controller;

import hanryang.practice.api.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;
//    @Autowired private MemberRepository memberRepository;
//      필드주입 - 별로임


    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
