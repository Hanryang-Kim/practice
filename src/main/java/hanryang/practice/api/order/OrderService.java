package hanryang.practice.api.order;

public interface OrderService {
    Order createOrder(Long memberId,String itemName ,int itemPrice);
}
