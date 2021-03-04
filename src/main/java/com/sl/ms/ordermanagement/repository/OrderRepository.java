package com.sl.ms.ordermanagement.repository;

import org.springframework.data.repository.CrudRepository;
import com.sl.ms.ordermanagement.model.OrderDetail;

public interface OrderRepository extends CrudRepository<OrderDetail, Integer> {	

}
