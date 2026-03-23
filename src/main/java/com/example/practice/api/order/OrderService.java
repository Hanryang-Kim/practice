package com.example.practice.api.order;

import com.example.practice.api.member.Member;

public interface OrderService {
    Order createOrder(Long memberId,String itemName ,int itemPrice);
}
