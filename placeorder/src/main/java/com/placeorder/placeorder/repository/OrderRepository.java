package com.placeorder.placeorder.repository;

import java.util.ArrayList;
import java.util.List;

import com.placeorder.placeorder.entity.Order;


public class OrderRepository {
	private List<Order> orderList = new ArrayList<>();

    public Order save(Order order) {
        orderList.add(order);
        return order;
    }

    public List<Order> getAll() {
        return orderList;
    }
}
