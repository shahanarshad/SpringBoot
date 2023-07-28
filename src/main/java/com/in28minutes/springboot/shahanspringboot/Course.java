package com.in28minutes.springboot.shahanspringboot;

public class Course {
	private long id;
	private String name;
	private String author;
	
	//Constructor 
	//Getters
	//toString
	//constructor
	public Course(long id, String string, String author) {
		super();
		this.id = id;
		this.name = string;
		this.author = author;
	}
	

	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "Course {id="+ id + ", name + " + name + ", author = " + author + "]";
		
	}
	
	
	
}
