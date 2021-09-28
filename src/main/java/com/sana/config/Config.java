package com.sana.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.sana.Model.Categories;
import com.sana.Model.Ecommerce;
import com.sana.Model.Product;
import com.sana.Model.Supplier;
import com.sana.Model.User;



@Configuration
@Import(DBConfig.class)
public class Config {
	
	@Bean
	public User getUser() {
		return new User();
	}

	@Autowired
	private Product p;
	@Autowired
	private Supplier s;
	@Autowired
	private  Categories c;
	
	@Bean
	public Ecommerce getEco(Product p, Supplier s, Categories c) {
		
		return new Ecommerce (p,s,c);
	}
	
	
}
