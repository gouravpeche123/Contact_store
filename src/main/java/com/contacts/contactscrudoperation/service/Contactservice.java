package com.contacts.contactscrudoperation.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contacts.contactscrudoperation.bean.Contact;
import com.contacts.contactscrudoperation.repository.Contactrepository;



@Service
public class Contactservice {
	      @Autowired
           public Contactrepository contactrepo;
	public List<Contact> getAllcontacts(){
		
		List <Contact>contacts = new ArrayList<>();
		contactrepo.findAll().forEach(contacts::add);
		return contacts;
		
		
	}
	public void addContacts(Contact contact) {
		contactrepo.save(contact);
		
	}
	public void updateContacts(String id, Contact contact) {
		contactrepo.save(contact);
		
	}
	public void deleteContact(String id) {
		contactrepo.deleteById(id);
		
	}
}
