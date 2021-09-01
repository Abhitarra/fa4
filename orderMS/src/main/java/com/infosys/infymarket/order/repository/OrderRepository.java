package com.infosys.infymarket.order.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.infymarket.order.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

	
}
