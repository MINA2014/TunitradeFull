package edu.esprit.domain.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Entity implementation class for Entity: Corporate
 * 
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Corporate extends Customer implements Serializable {

	private float capital;
	private static final long serialVersionUID = 1L;

	public Corporate() {
		super();
	}

	public Corporate(float capital) {
		super();
		this.capital = capital;
	}

	public float getCapital() {
		return this.capital;
	}

	public void setCapital(float capital) {
		this.capital = capital;
	}

}
