package edu.mum.waa.lab2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.waa.lab2.model.Product;
import edu.mum.waa.lab2.repository.ProductRepository;
import edu.mum.waa.lab2.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository pr;

	@Override
	public List<Product> getAllProducts() {
		return pr.getAllProducts();
	}

	@Override
	public Product getProductById(String id) {
		return pr.getProductById(id);
	}

	@Override
	public boolean addProduct(Product product) {
		return pr.addProduct(product);
	}

	@Override
	public boolean updateProduct(String id, Product product) {
		return pr.updateProduct(id, product);
	}

	@Override
	public boolean deleteProductById(String id) {
		return pr.deleteProductById(id);
	}

}
