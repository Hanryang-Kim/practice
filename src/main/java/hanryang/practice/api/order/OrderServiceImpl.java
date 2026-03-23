package hanryang.practice.api.order;

import hanryang.practice.api.discount.DiscountPolicy;
import hanryang.practice.api.discount.FixDiscountPolicy;
import hanryang.practice.api.member.Member;
import hanryang.practice.api.member.MemberRepository;
import hanryang.practice.api.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId,String itemName ,int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
