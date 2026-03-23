package com.example.practice.api.discount;

import com.example.practice.api.member.Member;

public interface DiscountPolicy {

    /**
     * @return 할인 대상 금액
     */

    int discount(Member member, int price);
}
