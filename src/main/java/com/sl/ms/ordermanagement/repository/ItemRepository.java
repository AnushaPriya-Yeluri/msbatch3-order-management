package com.sl.ms.ordermanagement.repository;

import org.springframework.data.repository.CrudRepository;
import com.sl.ms.ordermanagement.model.ItemDetail;


public interface ItemRepository extends CrudRepository<ItemDetail, Integer> {

}

