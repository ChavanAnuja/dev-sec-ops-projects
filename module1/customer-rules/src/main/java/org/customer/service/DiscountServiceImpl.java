package org.customer.service;

import org.customer.dto.DiscountRequest;
import org.customer.dto.DiscountResponse;
import org.customer.entity.Discount;
import org.customer.repo.DiscountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class DiscountServiceImpl implements DiscountService{

	@Autowired
	Discount discountEntity;
	@Autowired
	DiscountRepository discountRepository;
	
	 public DiscountResponse calculateDiscount(DiscountRequest request) {
	        int discount ;

	        if (request.getAge() < 30) {
	            discount = 10; 
	        } else if (request.getAge() < 60) {
	            discount = 5;
	        } else {
	            discount = 15; 
	        }

	        if ("female".equalsIgnoreCase(request.getGender())) {
	            discount += 5; 
	            }
	        
	        discountEntity.setAge(request.getAge());
	        discountEntity.setGender(request.getGender());
	        discountEntity.setDiscount(discount);
	        //discountEntity.setCustomer_id(discount);
	        discountRepository.save(discountEntity);

	        
	        DiscountResponse response = new DiscountResponse();
	        response.setDiscount(discount);
	          return response;

	       
	    }
}
