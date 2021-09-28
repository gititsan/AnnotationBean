package com.sana.Model;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
 
public class User {
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	@PostConstruct
	public void init() {
		System.out.println("After Constructer Logic");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("Before Destroy");
	}

}
