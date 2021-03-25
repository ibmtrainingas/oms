package com.ibm.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ibm.demo.entity.Order;

@Service // Bean
public class OrderService { // Spring Beans
	public String createOrder(Order order) {
		return "order created";
	}

	public List<Order> getOrders(int orderId) {
		return new ArrayList<Order>();
	}

	public void updateOrder(int orderId) {
	}

	public void deleteOrder(int orderId) {
		System.out.println("order deleted");
	}

	public Order getOrder(int orderId) {
		return new Order();
	}
	
	

}
