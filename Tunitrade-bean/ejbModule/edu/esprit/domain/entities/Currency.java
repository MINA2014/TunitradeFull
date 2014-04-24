package edu.esprit.domain.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Currency
 * 
 */
@Entity
public class Currency implements Serializable {

	private int id;
	private float ccy;
	private float libelle;
	private float pair_convertion;
	private float value;
	private List<Deal> deals;
	private static final long serialVersionUID = 1L;

	public Currency() {
		super();
	}

	public Currency(int id, float ccy, float libelle, float pair_convertion,
			float value, List<Deal> deals) {
		super();
		this.id = id;
		this.ccy = ccy;
		this.libelle = libelle;
		this.pair_convertion = pair_convertion;
		this.value = value;
		this.deals = deals;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToMany
	public List<Deal> getDeals() {
		return deals;
	}

	public void setDeals(List<Deal> deals) {
		this.deals = deals;
	}

	public float getCcy() {
		return this.ccy;
	}

	public void setCcy(float ccy) {
		this.ccy = ccy;
	}

	public float getLibelle() {
		return this.libelle;
	}

	public void setLibelle(float libelle) {
		this.libelle = libelle;
	}

	public float getPair_convertion() {
		return this.pair_convertion;
	}

	public void setPair_convertion(float pair_convertion) {
		this.pair_convertion = pair_convertion;
	}

	public float getValue() {
		return this.value;
	}

	public void setValue(float value) {
		this.value = value;
	}

}
