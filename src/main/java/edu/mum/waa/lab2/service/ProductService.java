package edu.mum.waa.lab2.service;

import java.util.List;

import edu.mum.waa.lab2.model.Product;

public interface ProductService {

	List<Product> getAllProducts();

	Product getProductById(String id);

	boolean addProduct(Product product);

	boolean updateProduct(String id, Product product);

	boolean deleteProductById(String id);
}
