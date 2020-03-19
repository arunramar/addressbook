package com.arun.addressbook.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arun.addressbook.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
