package edu.mum.waa.lab2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.waa.lab2.repository.ProductRepository;

@Controller
public class ProductController {
	
	@Autowired
	private ProductRepository pr;
	
	@RequestMapping(value = "/products")
	public String getAllProducts(Model model) {
		model.addAttribute("products", pr.getAllProducts());
		return "products";
	}
	@RequestMapping(value ="/product/{productid}", method = RequestMethod.GET)
	public String getProductById(@PathVariable String productid, Model model) {
		model.addAttribute("product", pr.getProductById(productid));
		return "productdetail";
	}
}
