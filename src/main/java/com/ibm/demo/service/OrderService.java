package com.ibm.demo.service;

import org.springframework.stereotype.Service;

import com.ibm.demo.entity.Order;

@Service //Bean
public class OrderService { //Spring Beans
	public String createOrder(Order order) {
		return "order created";
		
	}

	public String getOrder(Order order) {
		
		return "order created";
	}

	public String updateOrder() {
		return "order updated";
	}

	public String deleteOrder() {
		return "order deleted";
	}

}
