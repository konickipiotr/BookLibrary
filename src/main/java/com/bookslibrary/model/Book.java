package com.bookslibrary.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Book {
	
	@Id
	@GeneratedValue
	private int isbn;
	private String title;
	private String author;	
	private Double price;
	private int pages;
	private String description;
}
