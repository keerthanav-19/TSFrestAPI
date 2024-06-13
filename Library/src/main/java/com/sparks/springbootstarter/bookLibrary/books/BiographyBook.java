package com.sparks.springbootstarter.bookLibrary.books;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BiographyBook {

	
	@Id
	private String id;
	private String book;
	private String author;
	private String price;
	
	
	public String getAuthor() {
		return author;
	}
	public void setSinger(String author) {
		this.author = author;
	}
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
public BiographyBook() {
		
	}
	
	public BiographyBook(String id, String book, String author,String price) {
		super();
		this.id = id;
		this.book = book;
		this.author = author;
		this.price = price;
	}
	
}
