package edu.esprit.domain.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Customer
 * 
 */
@Entity
public class Customer extends User implements Serializable {

	private String name;
	private static final long serialVersionUID = 1L;
	private List<Message> messages;
	private List<Deal> deals;

	@ManyToMany
	public List<Deal> getDeals() {
		return deals;
	}

	public void setDeals(List<Deal> deals) {
		this.deals = deals;
	}

	public Customer() {
		super();
	}

	public Customer(String name, List<Message> messages, List<Deal> deals) {
		super();
		this.name = name;
		this.messages = messages;
		this.deals = deals;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@ManyToMany
	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

}
