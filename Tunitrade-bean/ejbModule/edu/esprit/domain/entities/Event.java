package edu.esprit.domain.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Event
 * 
 */
@Entity
public class Event implements Serializable {

	private int id;
	private String name;
	private String description;
	private Date startDate;
	private Date finishDate;
	private static final long serialVersionUID = 1L;
	private CentralBank centralBank;

	public Event() {
		super();
	}

	public Event(int id, String name, String description, Date startDate,
			Date finishDate, CentralBank centralBank) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.finishDate = finishDate;
		this.centralBank = centralBank;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getFinishDate() {
		return this.finishDate;
	}

	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
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

}
