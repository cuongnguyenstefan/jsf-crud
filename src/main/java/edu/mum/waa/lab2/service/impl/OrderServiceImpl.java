package edu.mum.waa.lab2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.waa.lab2.model.Product;
import edu.mum.waa.lab2.repository.ProductRepository;
import edu.mum.waa.lab2.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public void processOrder(String productId, int quantity) {
		Product orderdProduct = productRepository.getProductById(productId);
		if (orderdProduct != null) {
			if (quantity < orderdProduct.getUnitsInStock()) {
				orderdProduct.setUnitsInStock(orderdProduct.getUnitsInStock() - quantity);
				orderdProduct.setUnitsInOrder(orderdProduct.getUnitsInOrder() + quantity);
			} else {
				throw new IllegalArgumentException();
			}
		}
	}

}
