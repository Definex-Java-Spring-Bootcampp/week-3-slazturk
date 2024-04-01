package com.patika.kredinbizdeservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.patika.kredinbizdeservice.client.dto.request.GarantiApplicationRequest;
import com.patika.kredinbizdeservice.client.dto.response.ApplicationResponse;

@FeignClient(value = "garanti-service", url = "localhost:8010")
public interface GarantiServiceClient {

	 @PostMapping("api/garanti/v1/applications")
	    ApplicationResponse createApplication(@RequestBody GarantiApplicationRequest request);
}
