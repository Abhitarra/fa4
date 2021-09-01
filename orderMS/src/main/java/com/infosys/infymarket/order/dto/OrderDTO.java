package com.infosys.infymarket.order.dto;

import java.sql.Date;



import com.infosys.infymarket.order.entity.Order;

public class OrderDTO {
	
	int orderId;
	int buyerId;
	Double amount;
	Date date;
	String address;
	String status;
	//int seller_id;
	//Double quantity;

	public OrderDTO() {
		super();
	}
	

	public OrderDTO(int order_id, int buyer_id, Double amount, Date date, String address, String status, int seller_id,
			Double quantity) {
		super();
		this.orderId = orderId;
		this.buyerId = buyerId;
		this.amount = amount;
		this.date = date;
		this.address = address;
		//this.status = status;
		//this.seller_id = seller_id;
		//this.quantity = quantity;
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public int getBuyerId() {
		return buyerId;
	}


	public void setBuyer_id(int buyerId) {
		this.buyerId = buyerId;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	/*public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public int getSeller_id() {
		return seller_id;
	}


	public void setSeller_id(int seller_id) {
		this.seller_id = seller_id;
	}


	public Double getQuantity() {
		return quantity;
	}


	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}*/

	// Converts Entity into DTO
	public static OrderDTO valueOf(Order orders) {
		OrderDTO orderDTO = new OrderDTO();
		orderDTO.setOrderId(orders.getOrderId());
		orderDTO.setBuyer_id(orders.getBuyerId());
		orderDTO.setAmount(orders.getAmount());
		orderDTO.setDate(orders.getDate());
		orderDTO.setAddress(orders.getAddress());
		//orderDTO.setStatus(orders.getStatus());
		//orderDTO.setSeller_id(orders.getSeller_id());
		//orderDTO.setQuantity(orders.getQuantity());
		return orderDTO;
	}


	@Override
	public String toString() {
		return "OrderDTO [order_id=" + orderId + ", buyer_id=" + buyerId + ", amount=" + amount + ", date=" + date
				+ ", address=" + address
				+ "]";
	}

	
	}
