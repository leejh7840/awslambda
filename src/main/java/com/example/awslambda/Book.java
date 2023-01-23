package com.example.awslambda;

public class Book {
	int id;
	String name;
	String author;
	
	
	public Book(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}


	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
	}


	
	
}
