package com.sl.ms.ordermanagement.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class ItemDetail {

	@Id
	private int id;
	//private int orderId;	
	private String name;
	private int quantity;
	private int price;
	
	public ItemDetail() {
		super();
	}	
	public ItemDetail(String name, int quantity, int price) {
		this();
		//this.id = id;
		//this.orderId=orderId;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	/*public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}*/

	public String getName() {
		return name;
	}

	public void setName(String Name) {
		this.name = Name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

		
}
