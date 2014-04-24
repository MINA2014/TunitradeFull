package edu.esprit.domain.entities;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: ResidentCorporate
 *
 */
@Entity
public class ResidentCorporate extends Corporate implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public ResidentCorporate() {
		super();
	}
   
}
