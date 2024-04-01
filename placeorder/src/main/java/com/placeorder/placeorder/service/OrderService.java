package com.placeorder.placeorder.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.placeorder.placeorder.converter.OrderConverter;
import com.placeorder.placeorder.dto.request.OrderRequest;
import com.placeorder.placeorder.dto.response.OrderResponse;
import com.placeorder.placeorder.entity.Order;
import com.placeorder.placeorder.repository.OrderRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {
	private OrderRepository orderRepository = new OrderRepository();

    private final OrderConverter orderConverter;

    public OrderResponse createOrder(OrderRequest request) {

    	Order order = orderConverter.toOrder(request);
        return orderConverter.toResponse(orderRepository.save(order));
    }


    public List<OrderResponse> getAll() {
        List<Order> orders = orderRepository.getAll();

        return orderConverter.toResponseList(orders);
    }
}
