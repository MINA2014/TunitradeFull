package edu.esprit.domain.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Article {

	public int id;
	public String subject;
	public String topic;
	public String author;
	public String Content;
	private CentralBank centralBank;

	public Article(int id, String subject, String topic, String content,
			String author, CentralBank centralbank) {
		super();
		this.id = id;
		this.subject = subject;
		this.author = author;
		this.centralBank = centralbank;
		this.Content = content;
		this.topic = topic;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne
	public CentralBank getCentralBank() {
		return centralBank;
	}

	public void setCentralBank(CentralBank centralBank) {
		this.centralBank = centralBank;
	}

	public Article() {
		super();
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

}
