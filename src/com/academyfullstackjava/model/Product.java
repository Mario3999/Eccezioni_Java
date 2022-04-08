package com.academyfullstackjava.model;

import com.academyfullstackjava.exceptions.InsufficientStock;

public class Product {
	int availableStock = 10;
	
	public void checkProductStock(int qty) throws InsufficientStock{
		if (qty > availableStock) {
			throw new InsufficientStock("Insufficient stock available!");			
		}
		else {
			System.out.println("Stock is available!");
			
		}
	}

		
}

