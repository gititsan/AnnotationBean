package com.sana.Model;

public class Product {
	 
	private Supplier supplier;
	private Categories categories;
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public Categories getCategories() {
		return categories;
	}
	public void setCategories(Categories categories) {
		this.categories = categories;
	}
	public Product(Supplier supplier, Categories categories) {
		super();
		this.supplier = supplier;
		this.categories = categories;
	}
	 
	
	
}
