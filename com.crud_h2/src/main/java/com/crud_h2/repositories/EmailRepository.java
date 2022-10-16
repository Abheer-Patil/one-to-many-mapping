package com.crud_h2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud_h2.entities.Emails;

public interface EmailRepository extends JpaRepository<Emails, Integer> {

}
