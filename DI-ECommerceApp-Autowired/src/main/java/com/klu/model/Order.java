package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {
	 private int orderId;
	 private String customerName;
	 private int quantity;
	 @Autowired
	 private Product product;
	//if we have onlt 1 constructor we dont need to write  @Autowired before constrictor
	 //if we have more than 1 constructor then we have to write  @Autowired before every constructor ie,top line of constructor
	 public Order() {
		 this.orderId=2005;
		 this.customerName="Durgabhavani";
		 this.quantity=3;
	 }
	 
	 public void display() {
		 System.out.println("The following are the details of the order: ");
		 System.out.println("OrderId:"+orderId);
		 System.out.println("CustomerName:"+customerName);
		 System.out.println("Quantity:"+quantity);
		 System.out.println("ProductId:"+product.getProductId());
		 System.out.println("ProductName:"+product.getProductName());
		 System.out.println("ProductPrice:"+product.getPrice());
		 System.out.println("ProductCategory:"+product.getCategory());
		 
	 }
	
}
