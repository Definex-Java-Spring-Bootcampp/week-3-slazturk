package com.onlineShopping.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Order {
	private List<Product> products;
    private Invoice invoice;
    private LocalDateTime localDateTime;
    private User user;
    
    public Order() {
        this.setProducts(new ArrayList<>());
    }

	public Order(List<Product> products, Invoice invoice, LocalDateTime localDateTime, User user) {
		super();
		this.products = products;
		this.invoice = invoice;
		this.localDateTime = localDateTime;
		this.user = user;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
    
	public void addProduct(Product product) {
        products.add(product);
    }

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
