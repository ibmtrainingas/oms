package com.ibm.demo;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.demo.entity.Order;
import com.ibm.demo.service.OrderService;

@RestController //Bean
public class OrderController { // Frontend

	@Autowired // is used for Dependency Injection
	OrderService orderService; // Dependency Injection

	@PostMapping("/order")
	@ResponseStatus(code=HttpStatus.CREATED)
	String createOrder(@RequestBody @Valid Order order, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			throw new IllegalArgumentException("Something went wrong, Please retry !!");
		}
		System.out.println(order);
		return orderService.createOrder(order); //Delegation of object to Service Class
	}

	@GetMapping("/order")
	String getOrder(@RequestBody @Valid Order order, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			throw new IllegalArgumentException("Something went wrong, Please retry !!");
		}
		return "get";
	}

	@PutMapping("/order/{id}")
	String updateOrder(@RequestBody @PathVariable("id") int orderId) {
		System.out.println(orderId);
		return orderService.updateOrder();
	}

	@DeleteMapping("/order/{id}")
	String deleteOrder(@PathVariable("id") int orderId) {
		// System.out.println(httpRequest.getHeaders());
		System.out.println(orderId);
		return orderService.deleteOrder();
	}

}
