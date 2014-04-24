package edu.esprit.domain.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: CentralBank
 * 
 */
@Entity
public class CentralBank extends User implements Serializable {

	private String name;
	private float interestRate;
	private List<Notification> notifications;
	private List<Comment> comments;
	private List<Article> articles;
	private static final long serialVersionUID = 1L;

	private List<Event> events;

	public CentralBank() {
		super();
	}

	public CentralBank(String name, float interestRate,
			List<Notification> notifications, List<Event> events) {
		super();
		this.name = name;
		this.interestRate = interestRate;
		this.notifications = notifications;
		this.events = events;
	}

	@OneToMany(mappedBy = "centralBank")
	public List<Comment> getComments() {
		return comments;
	}

	@OneToMany(mappedBy = "centralBank")
	public List<Article> getArticles() {
		return articles;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	@OneToMany(mappedBy = "centralBank")
	public List<Notification> getNotifications() {
		return notifications;
	}

	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getInterestRate() {
		return this.interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

	@OneToMany(mappedBy = "centralBank")
	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

}
