package com.placeorder.placeorder.converter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.placeorder.placeorder.dto.request.OrderRequest;
import com.placeorder.placeorder.dto.response.OrderResponse;
import com.placeorder.placeorder.entity.Order;

public class OrderConverter {

	public Order toOrder(OrderRequest request) {
        return Order.builder()
                .userId(request.getUserId())
                .createDate(LocalDateTime.now())
                .build();
    }

    public OrderResponse toResponse(Order order) {
        return OrderResponse.builder()
                .userId(order.getUserId())
                .createDate(order.getCreateDate())
                .build();
    }

    public List<OrderResponse> toResponseList(List<Order> orders) {
        List<OrderResponse> orderResponses = new ArrayList<>();

        orders.forEach(order -> {
        	orderResponses.add(toResponse(order));
        });

        return orderResponses;
    }
}
