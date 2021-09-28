package com.sana.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import com.sana.Model.Categories;
import com.sana.Model.Product;
import com.sana.Model.Supplier;

@Configuration
public class DBConfig {
	
	@Bean("Supplier") 
	public Supplier getSupplier()
	{
		return new Supplier();
	}

	@Bean("Categories")
	public Categories getCategories()
	{
		return new Categories();
	}
	
	@Bean
	@DependsOn(value = {"Supplier","Categories"})
	public Product getProduct(Supplier s, Categories c)
	{
		return new Product(s,c);
	}
	
	
}
