package edu.mum.waa.lab2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.waa.lab2.model.Product;
import edu.mum.waa.lab2.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService ps;

	@RequestMapping(value = "/products")
	public String getAllProducts(Model model) {
		model.addAttribute("products", ps.getAllProducts());
		return "products";
	}

	@RequestMapping(value = "/product/{productid}", method = RequestMethod.GET)
	public String getProductById(@PathVariable String productid, Model model) {
		model.addAttribute("product", ps.getProductById(productid));
		return "productdetail";
	}

	@RequestMapping(value = "/products/add", method = RequestMethod.GET)
	public String getAddNewProductForm(Model model) {
		Product newProduct = new Product();
		model.addAttribute("newProduct", newProduct);
		return "addProduct";
	}
	
	@RequestMapping(value = "/products/update/{id}", method = RequestMethod.GET)
	public String getUpdateProductForm(Model model, @PathVariable String id) {
		Product updateProduct = ps.getProductById(id);
		model.addAttribute("updateProduct", updateProduct);
		return "editProduct";
	}
	
	@RequestMapping(value = "/products/update/{id}", method = RequestMethod.POST)
	public String processUpdateProductForm(@ModelAttribute("updateProduct") Product updateProduct, Model model,
			@PathVariable String id, BindingResult result) {
		String[] suppressedFields = result.getSuppressedFields();
		if (suppressedFields.length > 0) {
			throw new RuntimeException("Attempting to bind disallowed fields: "
					+ StringUtils.arrayToCommaDelimitedString(suppressedFields));
		}
		ps.updateProduct(id, updateProduct);
		return "redirect:/products";
	}

	@InitBinder
	public void initializeBinder(WebDataBinder binder) {
		binder.setDisallowedFields("unitsInOrder", "discontinued");
	}

	@RequestMapping(value = "/products/add", method = RequestMethod.POST)
	public String processAddNewProductForm(@ModelAttribute("updateProduct") Product newProduct, BindingResult result) {
		String[] suppressedFields = result.getSuppressedFields();
		if (suppressedFields.length > 0) {
			throw new RuntimeException("Attempting to bind disallowed fields: "
					+ StringUtils.arrayToCommaDelimitedString(suppressedFields));
		}
		ps.addProduct(newProduct);
		return "redirect:/products";
	}

	@RequestMapping(value = "/products/delete/{id}", method = RequestMethod.GET)
	public String processDeleteProduct(@PathVariable String id) {
		ps.deleteProductById(id);
		return "redirect:/products";
	}
}
