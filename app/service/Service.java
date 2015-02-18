package service;

import models.Product;

public class Service {
	
	public static Product newProduct(String name) {
		Product product = Product.newInstance(name, "");
		return product;
	}

}
