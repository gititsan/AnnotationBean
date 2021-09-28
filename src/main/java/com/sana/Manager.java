package com.sana;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sana.config.Config;

 

public class Manager {
	private static AnnotationConfigApplicationContext context;
	public static void main(String[] args) {
		context= new  AnnotationConfigApplicationContext(Config.class);
		 context.close();
	}

}
