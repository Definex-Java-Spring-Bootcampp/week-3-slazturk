package com.onlineShopping.service;
import org.springframework.stereotype.Service;

import com.onlineShopping.client.PlaceOrderClient;
import com.onlineShopping.client.dto.request.PlaceOrderRequest;
import com.onlineShopping.converter.OrderConverter;
import com.onlineShopping.dto.request.OrderRequest;
import com.onlineShopping.model.Order;
import com.onlineShopping.model.User;
import com.onlineShopping.repository.OrderRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderService {
	
	private final OrderRepository orderRepository = new OrderRepository();
	private final OrderConverter orderConverter;
	private final UserService userService;
	private final PlaceOrderClient placeOrderClient;

	public Order createOrder(OrderRequest request) {

	    User user = userService.getByEmail(request.getEmail());
	    log.info("user bulundu");

	    Order order = orderConverter.toOrder(request, user);

	    Order savedOrder = orderRepository.save(order);
	    placeOrderClient.createOrder(preparePlaceOrderRequest(user));

	   
	    return savedOrder;
		
	}
	
	private PlaceOrderRequest preparePlaceOrderRequest(User user) {
		PlaceOrderRequest orderRequest = new PlaceOrderRequest();

		orderRequest.setUserId(1L);

        return orderRequest;
    }
    

}