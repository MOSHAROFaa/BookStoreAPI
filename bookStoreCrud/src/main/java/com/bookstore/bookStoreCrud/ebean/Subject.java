package com.bookstore.bookStoreCrud.ebean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Subject")
public class Subject {
	
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	

	private String title;
	private String author;
	private String isbn;
	private double price;
	private int year;
	
	
	public Subject() {
	
	}
	public Subject(String id, String name) {
		super();
		this.title = id;
		this.author = name;
	}
	
	public Subject(String title, String author,String isbn, double price,int year) {
		
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.price = price;
		this.year = year;
	}
	
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String name) {
		this.author = name;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	 public Long getId() {
	        return id;
	    }
	public void setId(Long id) {
	        this.id = id;
	    }
}
