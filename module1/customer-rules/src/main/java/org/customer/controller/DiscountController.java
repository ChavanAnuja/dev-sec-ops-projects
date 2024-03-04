package org.customer.controller;


import org.customer.dto.DiscountRequest;
import org.customer.dto.DiscountResponse;
import org.customer.service.DiscountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DiscountController {

	@Autowired
	DiscountServiceImpl discountServiceImpl;

	@PostMapping("/api/v1/customer/getDiscount")
	public DiscountResponse calculateDiscount(@RequestBody DiscountRequest request) {
	    return discountServiceImpl.calculateDiscount(request);
	}

	
}
