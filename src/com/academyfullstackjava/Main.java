package com.academyfullstackjava;

import com.academyfullstackjava.model.Product;

public class Main {
	public static void main(String [] args) {
		Product product = new Product();
		
		try {
			product.checkProductStock(15);			
		} catch (InsufficientStock e) {
			System.out.println(w.printStackTrace());
		}
		System.out.println("***FINE PROGRAMMA***");
	}
}
