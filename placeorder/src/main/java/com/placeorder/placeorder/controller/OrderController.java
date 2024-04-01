package com.placeorder.placeorder.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.placeorder.placeorder.dto.request.OrderRequest;
import com.placeorder.placeorder.dto.response.OrderResponse;
import com.placeorder.placeorder.service.OrderService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/placeorder/v1/orders")
@RequiredArgsConstructor
public class OrderController {
	private final OrderService orderService;

    @PostMapping
    public OrderResponse createOrder(@RequestBody OrderRequest request) {
        return orderService.createOrder(request);
    }

    @GetMapping
    public ResponseEntity<List<OrderResponse>> getAll() {
        return ResponseEntity.ok(orderService.getAll());
    }

}
