package edu.esprit.domain.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: NonResidentCorporate
 * 
 */
@Entity
public class NonResidentCorporate extends Corporate implements Serializable {
	private List<Order> orders;
	private static final long serialVersionUID = 1L;

	public NonResidentCorporate() {
		super();
	}

	public NonResidentCorporate(List<Order> orders) {
		super();
		this.orders = orders;
	}

	@OneToMany(mappedBy = "nonResidentCorporate")
	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

}
