package edu.esprit.domain.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Message
 * 
 */
@Entity
public class Message implements Serializable {

	private int id;
	private String sender;
	private String body;
	private static final long serialVersionUID = 1L;
	private List<Customer> customers;
	private MailBox mailBox;

	public Message() {
		super();
	}

	public Message(int id, String sender, String body, List<Customer> customers) {
		super();
		this.id = id;
		this.sender = sender;
		this.body = body;
		this.customers = customers;
	}

	@ManyToOne
	public MailBox getMailBox() {
		return mailBox;
	}

	public void setMailBox(MailBox mailBox) {
		this.mailBox = mailBox;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSender() {
		return this.sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@ManyToMany
	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

}
