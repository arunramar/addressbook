package com.arun.addressbook.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arun.addressbook.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
	
}
