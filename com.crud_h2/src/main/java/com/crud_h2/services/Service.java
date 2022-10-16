package com.crud_h2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.crud_h2.entities.Emails;
import com.crud_h2.entities.Users;
import com.crud_h2.repositories.EmailRepository;
import com.crud_h2.repositories.UserRepository;

@org.springframework.stereotype.Service
public class Service
{
	@Autowired
	private UserRepository ur;
	@Autowired
	private EmailRepository er;
	
	public Users getuserbyid(int id)
	{
		return this.ur.findById(id).get();
	}
	

	public Emails getemailbyid(int id)
	{
		return this.er.findById(id).get();
	}
	
	public List<Users> getallusers()
	{
		return this.ur.findAll();
	}
	
	public Users saveuser(Users user)
	{
		return this.ur.save(user);
	}
	
	public Emails saveemail(Emails email)
	{

		System.out.println(email.getFrommail());
		List<Users> l1= ur.findByMail(email.getFrommail());
		if(l1.isEmpty())
		{
			return this.er.save(email);	
		}
		else
		{
			System.out.println(l1);
			Users u= l1.get(0);
			u.getEmails().add(email);	
			return this.er.save(email);	
		}
		
	
		
	}
	public void deluser(int id)
	{
		this.ur.deleteById(id);
	}
	public void delemail(int id)
	{
		this.er.deleteById(id);
	}

}
