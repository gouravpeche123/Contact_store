package com.contacts.contactscrudoperation.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Configuration;


@Entity
@Table(name="contact3")
@Configuration
public class Contact {
    @Id
    
	private String id;
	private String name;
	private int phoneno;
	
	
	public Contact() {
		
	}
	public Contact(String id, String name, int phoneno) {
		super();
		this.id = id;
		this.name = name;
		this.phoneno = phoneno;
	}
	 @Column(name = "id", unique = true, nullable = false)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	 @Column(name = "name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 @Column(name = "phoneno")
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	
	
	
}
