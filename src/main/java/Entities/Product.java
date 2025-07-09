package Entities;

import jakarta.persistence.Entity;

@Entity
public class Product 
{
	
	
	private long productId; //primary key
	
	private String name;
	
	private String description;
	
	private double price;
	
	private long categoryId; //foreign key
	
	private int stockQuantity;
	
	
}
