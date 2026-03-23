package com.example.practice.api.order;

import com.example.practice.api.discount.DiscountPolicy;
import com.example.practice.api.discount.FixDiscountPolicy;
import com.example.practice.api.member.Member;
import com.example.practice.api.member.MemberRepository;
import com.example.practice.api.member.MemoryMemberRepository;

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
