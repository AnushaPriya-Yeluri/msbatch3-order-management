package com.sl.ms.ordermanagement.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sl.ms.ordermanagement.exceptions.OrderNotFoundException;
import com.sl.ms.ordermanagement.model.OrderDetail;
import com.sl.ms.ordermanagement.repository.OrderRepository;


@RestController
@RequestMapping("orders")
public class OrderController {

	private final OrderRepository repository;

	public OrderController(OrderRepository repository) {
		this.repository = repository;
	}

	@GetMapping
	public Iterable<OrderDetail> getOrders() {
		return repository.findAll();
	}	
	
	@GetMapping("{id}")
	public OrderDetail getOrder(@PathVariable int id) {
		return repository.findById(id).orElseThrow(OrderNotFoundException::new);
	}	

	@PostMapping
	public OrderDetail addOrder(@RequestBody OrderDetail Order) {
		return repository.save(Order);
	}

	@DeleteMapping("/{id}")
	public void deleteOrder(@PathVariable int id) {
		repository.findById(id).orElseThrow(OrderNotFoundException::new);
		repository.deleteById(id);
	}
}
