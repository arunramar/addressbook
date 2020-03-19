package com.arun.addressbook.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.arun.addressbook.entities.Contact;
import com.arun.addressbook.services.ContactService;

@Controller
public class ContactController {
	
	@Autowired
	ContactService contactService;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ContactController.class);
	
	@RequestMapping(value="/home" , method=RequestMethod.GET )
	public String home() {
		LOGGER.info("ContactController: inside home method");
		return "start";
	}
	
	@RequestMapping("/getContacts")
	public String getContacts(ModelMap modelMap) {
		LOGGER.info("ContactController: inside getContacts method");
		List<Contact> contacts = contactService.readAllContacts();
		modelMap.addAttribute("contacts", contacts);
		return "displayContacts";
	}
	
	@RequestMapping("/addContactForm")
	public String addContactForm() {
		return "addContactForm";
	}
	
	@RequestMapping(value="/addContact", method=RequestMethod.POST)
	public String addContact(@ModelAttribute("Contact") Contact contact, ModelMap modelMap) {
		System.out.println(contact);
		contactService.addContact(contact);
		String msg ="Contact added successfully for "+ contact.getFirstName() +"." ;
		LOGGER.info("ContactController: "+msg);
		modelMap.addAttribute("contact", contact);
		modelMap.addAttribute("msg", msg);
		return "addContactResult";
	}
	
	@RequestMapping("/editContact")
	public String editContact(@RequestParam("id") Long id, ModelMap modelMap) {
		Contact contact = contactService.getOneContact(id);
		modelMap.addAttribute("contact", contact);
		return "editContact";
	}
	
	@RequestMapping(value="/editContactSave", method=RequestMethod.POST)
	public String editContactSave(@ModelAttribute("editContact") Contact editContact, ModelMap modelMap) {
		Contact contact = contactService.editContact(editContact);
		modelMap.addAttribute("contact", contact);
		String msg="Contact edit successful for "+ contact.getFirstName() +".";
		modelMap.addAttribute("msg", msg);
		LOGGER.info("ContactController: "+msg);
		return "editContact";
	}
	
	@RequestMapping(value="/deleteContact", method=RequestMethod.GET)
	public String deleteContact(@RequestParam("id") Long id, ModelMap modelMap) {
		contactService.deleteContact(id);
		String msg="Contact details for id "+ id +" deleted successfully.";
		LOGGER.info("ContactController: "+msg);
		modelMap.addAttribute("msg", msg);
		List<Contact> contacts = contactService.readAllContacts();
		modelMap.addAttribute("contacts", contacts);
		return"displayContacts";
		
	}
	
}
