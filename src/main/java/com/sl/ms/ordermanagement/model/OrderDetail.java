package com.sl.ms.ordermanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import java.util.List;

import javax.persistence.CascadeType;


@Entity
public class OrderDetail {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private int totalAmount;
	
	@OneToMany(cascade=CascadeType.MERGE)
	@JoinColumn(name="OrderDetailId")
	List<ItemDetail> items;
	
	public OrderDetail() {
		super();
	}
	
	public OrderDetail(int id, String name, int totalAmount, List<ItemDetail> items) {
		this();
		this.id=id;
		this.name = name;
		this.totalAmount = totalAmount;
		this.items = items;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String Name) {
		this.name = Name;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int amount) {
		this.totalAmount = amount;
	}
		
	public List<ItemDetail> getItems() {
		return items;
	}
	public void setItems(List<ItemDetail> items) {
		this.items = items;
	}
	
	
}
