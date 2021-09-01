package com.infosys.infymarket.order.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.infymarket.order.dto.OrderDTO;
import com.infosys.infymarket.order.repository.OrderRepository;
import com.infosys.infymarket.order.service.OrderService;
//import com.infosys.infymarket.order.service.Qualifier;

@RestController
@CrossOrigin
public class OrderController {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	@org.springframework.beans.factory.annotation.Qualifier("OrderService")
	private OrderService orderService;
  
	// Fetches call details of a specific customer
	@RequestMapping(value = "/orders/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderDTO getSpecificOrder(@PathVariable int order_id) {
		logger.info("Calldetails request for customer {}", order_id);
		return orderService.getSpecificOrder(order_id);
		 
}
}
