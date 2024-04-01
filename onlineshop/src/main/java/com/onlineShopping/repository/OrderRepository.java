package com.onlineShopping.repository;

import java.util.ArrayList;
import java.util.List;

import com.onlineShopping.model.Order;

public class OrderRepository {
	private List<Order> orderList = new ArrayList<>();

    public Order save(Order order) {
    	orderList.add(order);
        return order;
    }
}
