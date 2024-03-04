package org.customer.repo;

import org.customer.entity.Customer;
import org.customer.entity.Discount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountRepository extends JpaRepository<Discount, Long>{

	
}
