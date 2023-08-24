package com.contacts.contactscrudoperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.contacts.contactscrudoperation.bean.Contact;
import com.contacts.contactscrudoperation.service.Contactservice;





@RestController
public class Contactcontroller {
	@Autowired
	private Contactservice contactservice;
	
	@RequestMapping("/contacts")
       public List<Contact>getAllcontacts(){
    	 
    	  return contactservice.getAllcontacts();
       }
	
	@RequestMapping(method=RequestMethod.POST,value="/addcontact")
	public void addContacts(@RequestBody Contact contact) {
		contactservice.addContacts(contact);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/contacts/{id}")
	public void updateContacts(@PathVariable String id ,@RequestBody Contact contact) {
		contactservice.updateContacts(id ,contact);
	}
//	@RequestMapping(method=RequestMethod.DELETE,value="/contacts/{id}")
	@DeleteMapping("/contacts/{id}")
	public void deleteContact(@PathVariable String id) {
		
		contactservice.deleteContact(id);
	}
	
}
	
	
	
	

