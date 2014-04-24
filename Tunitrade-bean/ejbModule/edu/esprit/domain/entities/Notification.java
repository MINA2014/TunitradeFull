package edu.esprit.domain.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Notification
 * 
 */
@Entity
public class Notification implements Serializable {

	
	private int id;
	private String type;
	private CentralBank centralBank;
	private static final long serialVersionUID = 1L;

	public Notification() {
		super();
	}

	public Notification(int id, String type, CentralBank centralbank) {
		super();
		this.id = id;
		this.type = type;
		this.centralBank = centralbank;
	}

	@ManyToOne
	public CentralBank getCentralBank() {
		return centralBank;
	}

	public void setCentralBank(CentralBank centralBank) {
		this.centralBank = centralBank;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
