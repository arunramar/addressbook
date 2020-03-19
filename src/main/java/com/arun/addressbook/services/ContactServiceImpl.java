package com.arun.addressbook.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arun.addressbook.entities.Contact;
import com.arun.addressbook.repos.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	ContactRepository contactRepository;
	
	@Override
	public Contact addContact(Contact contact) {
		Contact savedContact = contactRepository.save(contact);
		
		return savedContact;
	}

	@Override
	public Contact editContact(Contact contact) {
		 Contact savedContact = contactRepository.save(contact);
		 return savedContact;
	}

	@Override
	public List<Contact> readAllContacts() {
		List<Contact> contacts = contactRepository.findAll();
		return contacts;
	}

	@Override
	public void deleteContact(Long id) {
		contactRepository.deleteById(id);
	}


	@Override
	public Contact getOneContact(Long id) {
		Contact contact=contactRepository.getOne(id);
		return contact;
	}

}
