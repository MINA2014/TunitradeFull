package edu.esprit.domain.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: MailBox
 * 
 */
@Entity
public class MailBox implements Serializable {

	private int id;
	private List<Message> messages;
	private static final long serialVersionUID = 1L;

	public MailBox() {
		super();
	}

	public MailBox(int id) {
		super();
		this.id = id;
	}

	@OneToMany(mappedBy = "mailBox")
	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
