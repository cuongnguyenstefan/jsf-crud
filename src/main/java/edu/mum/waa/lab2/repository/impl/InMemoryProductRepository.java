package edu.mum.waa.lab2.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import edu.mum.waa.lab2.model.Product;
import edu.mum.waa.lab2.repository.ProductRepository;

@Repository
public class InMemoryProductRepository implements ProductRepository {
	
	private final List<Product> listOfProduct;
	
	public InMemoryProductRepository() {
		listOfProduct = new ArrayList<Product>();
		for (int i = 0; i < 21; i++) {
			int id = i + 1;
			Product p = Product.createRandomProduct(id + "");
			listOfProduct.add(p);
		}
	}

	@Override
	public List<Product> getAllProducts() {
		return listOfProduct;
	}

	@Override
	public Product getProductById(String id) {
		for (Product p : listOfProduct) {
			if (p.getProductId().equals(id)) return p;
		}
		return null;
	}

}
