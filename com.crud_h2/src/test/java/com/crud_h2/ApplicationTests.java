package com.crud_h2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.crud_h2.entities.Emails;
import com.crud_h2.entities.Users;
import com.crud_h2.repositories.EmailRepository;
import com.crud_h2.repositories.UserRepository;
import com.crud_h2.services.Service;


@SpringBootTest
class ApplicationTests {

	@Autowired
	private Service ser;
	@MockBean
	private UserRepository ur;
	@MockBean
	private EmailRepository er;
	
	@Test
	public void postusertest()
	{
		Users user= new Users(1,"abheer","patil","abcd@gmail.com",1234);
		when(ur.save(user)).thenReturn(user);
		assertEquals(user, ser.saveuser(user));
		
	}
	@Test
	public void getalluserstest()
	{
		List<Users> l1= new ArrayList<>();
		l1.add(new Users(1,"abheer","patil","abcd@gmail.com",1234));
		l1.add(new Users(1,"anusha","patil","abcd@gmail.com",1234));
		when(ur.findAll()).thenReturn(l1);
		assertEquals(l1, ser.getallusers());
	}

	@Test
	public void getuserbyidtest()
	{
		
		Optional<Users> user= Optional.ofNullable(new Users(3,"Abheer","Patil","abcd@gmail.com",1234));
		System.out.println(user);
		
		when(ur.findById(3)).thenReturn(user);
		assertEquals(3, ser.getuserbyid(3).getId());
	}
	
	@Test
	public void postemailtest()
	{
		Emails mail= new Emails(1,"abc@gmail.com","xyz@gmail.com","sndnddndbdbd","jhabdahsdjhabdhjabd");
		when(er.save(mail)).thenReturn(mail);
		assertEquals(mail, ser.saveemail(mail));
		
	}
	
}
