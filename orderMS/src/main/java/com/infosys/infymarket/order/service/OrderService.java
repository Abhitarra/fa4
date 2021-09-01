package com.infosys.infymarket.order.service;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infosys.infymarket.order.dto.OrderDTO;
import com.infosys.infymarket.order.repository.OrderRepository;

@Service("OrderService")
@Transactional
public class OrderService {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private OrderRepository orderRepo;

	// Fetches call details of a specific customer
	public OrderDTO getSpecificOrder(int order_id) {
		logger.info("Order details : {}", order_id);
		return OrderDTO.valueOf(orderRepo.getById(order_id));
	}

}

