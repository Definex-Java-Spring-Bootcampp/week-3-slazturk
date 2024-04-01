package com.onlineShopping.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.onlineShopping.client.dto.request.PlaceOrderRequest;
import com.onlineShopping.client.dto.response.PlaceOrderResponse;


@FeignClient(value = "placeorder", url = "localhost:8761")
public interface PlaceOrderClient {
	 @PostMapping("api/akbank/v1/applications")
	    PlaceOrderResponse createOrder(@RequestBody PlaceOrderRequest request);

}
