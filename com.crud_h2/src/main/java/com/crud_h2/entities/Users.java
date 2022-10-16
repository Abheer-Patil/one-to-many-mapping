package com.crud_h2.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Users {
	@Id
	private int id;
	@Column(name = "First_name")
	private String fname;
	@Column(name = "Last_name")
	private String lname;
	@Column(name = "Mail")
	private String mail;
	@Column(name = "Phone_number")
	private long num;
	

	@OneToMany
	private List<Emails> emails= new ArrayList<>();

	public List<Emails> getEmails() {
		return emails;
	}

	public void setEmails(List<Emails> emails) {
		this.emails = emails;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public long getNum() {
		return num;
	}

	public void setNum(long num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + mail + ", num=" + num + "]";
	}

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(int id, String fname, String lname, String mail, long num) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.mail = mail;
		this.num = num;
	}

	

}
