package com.crud_h2.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Emails {

	@Id
	private int eid;
	private String frommail;
	private String tomail;
	private String subject;
	private String body;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getFrommail() {
		return frommail;
	}
	public void setFrommail(String frommail) {
		this.frommail = frommail;
	}
	public String getTomail() {
		return tomail;
	}
	public void setTomail(String tomail) {
		this.tomail = tomail;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Emails(int eid, String frommail, String tomail, String subject, String body) {
		super();
		this.eid = eid;
		this.frommail = frommail;
		this.tomail = tomail;
		this.subject = subject;
		this.body = body;
	}
	public Emails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emails [eid=" + eid + ", frommail=" + frommail + ", tomail=" + tomail + ", subject=" + subject
				+ ", body=" + body + "]";
	}
	
	
	
}
