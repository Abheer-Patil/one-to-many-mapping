package com.crud_h2.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud_h2.entities.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {
	
	public List<Users> findByMail(String s);
	

}
