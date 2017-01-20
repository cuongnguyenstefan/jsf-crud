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
		for (int i = 0; i < 9; i++) {
			int id = i + 1;
			Product p = Product.createRandomProduct(id + "");
			listOfProduct.add(p);
		}
	}

	@Override
	public List<Product> getAllProducts() {
		return new ArrayList<Product>(listOfProduct);
	}

	@Override
	public Product getProductById(String id) {
		for (Product p : listOfProduct) {
			if (p.getProductId().equals(id))
				return p;
		}
		return null;
	}

	@Override
	public boolean addProduct(Product product) {
		if (getProductById(product.getProductId()) != null) {
			return false;
		}
		listOfProduct.add(product);
		return true;
	}

	@Override
	public boolean updateProduct(String id, Product product) {
		Product find = new Product();
		find.setProductId(id);
		if (listOfProduct.contains(find)) {
			listOfProduct.remove(find);
			listOfProduct.add(product);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteProductById(String id) {
		Product p = new Product();
		p.setProductId(id);
		return listOfProduct.remove(p);
	}

}
