package edu.mum.waa.lab2.model;

import java.math.BigDecimal;
import java.util.Random;

public class Product {
	
	public static Product createRandomProduct(String id) {
		String[] name = {"iPhone", "iPod", "Nexus", "Dell", "Soap", "Perfume", "Glasses", "Shirt", "Pants"};
		String[] category = {"phone", "laptop", "electronic", "household"};
		String[] manufacturer = {"Fred", "Jane", "Richard Nixon"};
		Product p = new Product();
		p.productId = id;
		p.category = randomName(category);
		p.name = randomName(name);
		p.description = "random items";
		p.unitPrice = new BigDecimal(new Random().nextInt(1000000));
		p.manufacturer = randomName(manufacturer);
		p.condition = "Good";
		p.unitsInStock = new Random().nextInt(200);
		p.unitsInOrder = 0;
		return p;
	}
	
	private static String randomName(String[] name) {
		Random random = new Random();
		int index = random.nextInt(name.length);
		return name[index];
	}

	private String productId;
	private String name;
	private BigDecimal unitPrice;
	private String description;
	private String manufacturer;
	private String category;
	private long unitsInStock;
	private long unitsInOrder;
	private boolean discontinued;
	private String condition;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public long getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(long unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public long getUnitsInOrder() {
		return unitsInOrder;
	}

	public void setUnitsInOrder(long unitsInOrder) {
		this.unitsInOrder = unitsInOrder;
	}

	public boolean isDiscontinued() {
		return discontinued;
	}

	public void setDiscontinued(boolean discontinued) {
		this.discontinued = discontinued;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public Product(String productId, String name, BigDecimal unitPrice, String description, String manufacturer,
			String category, long unitsInStock, long unitsInOrder, boolean discontinued, String condition) {
		this.productId = productId;
		this.name = name;
		this.unitPrice = unitPrice;
		this.description = description;
		this.manufacturer = manufacturer;
		this.category = category;
		this.unitsInStock = unitsInStock;
		this.unitsInOrder = unitsInOrder;
		this.discontinued = discontinued;
		this.condition = condition;
	}

	public Product() {
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (obj instanceof Product) {
			Product p = (Product) obj;
			return p.productId == this.productId;
		}
		return false;
	}
}
