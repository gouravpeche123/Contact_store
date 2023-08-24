package com.contacts.contactscrudoperation.repository;

import org.springframework.data.repository.CrudRepository;

import com.contacts.contactscrudoperation.bean.Contact;



public interface Contactrepository  extends CrudRepository<Contact,String>{
             
}
