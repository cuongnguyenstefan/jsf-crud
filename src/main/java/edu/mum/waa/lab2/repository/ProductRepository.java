package edu.mum.waa.lab2.repository;

import java.util.List;

import edu.mum.waa.lab2.model.Product;

public interface ProductRepository {
	List<Product> getAllProducts();
	
	Product getProductById(String id);

}
