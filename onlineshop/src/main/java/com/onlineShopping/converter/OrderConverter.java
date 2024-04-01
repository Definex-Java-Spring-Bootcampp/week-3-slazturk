package com.onlineShopping.converter;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import com.onlineShopping.dto.request.OrderRequest;
import com.onlineShopping.model.Order;
import com.onlineShopping.model.User;

@Component
public class OrderConverter {
	public Order toOrder(OrderRequest request, User user) {
        Order order = new Order();
        order.setUser(user);
        order.setLocalDateTime(LocalDateTime.now());
        return order;
    }

}
