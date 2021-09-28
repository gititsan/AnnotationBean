package com.sana;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sana.Model.Ecommerce;
import com.sana.config.Config;
import com.sana.config.DBConfig;

public class Manager2 {

	private static AnnotationConfigApplicationContext context;
	public static void main(String[] args) {
		context= new  AnnotationConfigApplicationContext(Config.class);
		System.out.println(context.getBean(Ecommerce.class).getCategories());
	}

}
