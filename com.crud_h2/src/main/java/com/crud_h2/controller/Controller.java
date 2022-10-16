package com.crud_h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud_h2.entities.Emails;
import com.crud_h2.entities.Users;
import com.crud_h2.services.Service;

@RestController
public class Controller 
{
	@Autowired
	private Service service;
	@GetMapping("/users")
	public List<Users> test1()
	{
		return this.service.getallusers();
	}
	@PostMapping("/user")
	public Users test2(@RequestBody Users user)
	{
		return this.service.saveuser(user);
	}
	@PostMapping("/email")
	public Emails test3(@RequestBody Emails email)
	{
		return this.service.saveemail(email);
		/*
		 {
    "eid":4,
    "frommail":"abheer@gmail.com",
    "tomail":"xyz@gmail.com",
    "subject":"hhgvjghvjg",
    "body":"hbdhdsbsjh"
}
		 */
	}
	
	@GetMapping("/user/{id}")
	public Users test4(@PathVariable int id)
	{
		return this.service.getuserbyid(id);
		
	}

	@GetMapping("/emails/count?user={id}")
	public Integer test5(@PathVariable int id)
	{
		return this.service.getuserbyid(id).getEmails().size();
	}
}
