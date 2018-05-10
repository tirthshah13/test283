package org.learn.java;

public class Author {

	int id;
	String name;
	String Description;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Author(int id, String name, String description) {
		//super();
		this.id = id;
		this.name = name;
		Description = description;
	}
	
}
