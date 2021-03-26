package com.ibm.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ibm.demo.entity.Order;

public interface OrderRepository extends MongoRepository<Order, String> { //Here String represents the id type of Order

}
