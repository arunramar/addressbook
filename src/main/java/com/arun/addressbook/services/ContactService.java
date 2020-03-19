package com.arun.addressbook.services;

import java.util.List;

import com.arun.addressbook.entities.Contact;

public interface ContactService {
	
	public Contact addContact(Contact contact);
	public Contact editContact(Contact contact);
	public Contact getOneContact(Long id);
	public List<Contact> readAllContacts();
	public void deleteContact(Long id);

}
