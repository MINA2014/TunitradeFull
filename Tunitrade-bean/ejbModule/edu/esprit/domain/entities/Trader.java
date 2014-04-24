package edu.esprit.domain.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Trader
 * 
 */
@Entity
public class Trader implements Serializable {

	private int id;
	private String FirstName;
	private String LastName;
	private String Login;
	private String Password;
	private String Company;
	private List<Comment> comments;
	private static final long serialVersionUID = 1L;

	public Trader() {
		super();
	}

	public Trader(int id, String firstName, String lastName, String login,
			String password, String company) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		Login = login;
		Password = password;
		Company = company;
	}
	
@OneToMany(mappedBy="trader")
	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return this.FirstName;
	}

	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}

	public String getLastName() {
		return this.LastName;
	}

	public void setLastName(String LastName) {
		this.LastName = LastName;
	}

	public String getLogin() {
		return this.Login;
	}

	public void setLogin(String Login) {
		this.Login = Login;
	}

	public String getPassword() {
		return this.Password;
	}

	public void setPassword(String Password) {
		this.Password = Password;
	}

	public String getCompany() {
		return this.Company;
	}

	public void setCompany(String Company) {
		this.Company = Company;
	}

}
