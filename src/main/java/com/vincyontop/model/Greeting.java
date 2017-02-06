package com.vincyontop.model;

public class Greeting {
	
	private long id =0;
	private String greeting;
	
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public Greeting(long id, String greeting) {
		super();
		this.id = id;
		this.greeting = greeting;
	}

	

}
