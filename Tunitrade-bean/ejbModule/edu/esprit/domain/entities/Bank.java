package edu.esprit.domain.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Bank
 * 
 */
@Entity
public class Bank extends Customer implements Serializable {

	private float capital;
	private float salesPrice;
	private float purchase;
	private float solvency;
	private int nbTransaction;
	private static final long serialVersionUID = 1L;

	public Bank() {
		super();
	}

	public Bank(float capital, float salesPrice, float purchase,
			float solvency, int nbTransaction) {
		super();
		this.capital = capital;
		this.salesPrice = salesPrice;
		this.purchase = purchase;
		this.solvency = solvency;
		this.nbTransaction = nbTransaction;
	}

	public float getCapital() {
		return this.capital;
	}

	public void setCapital(float capital) {
		this.capital = capital;
	}

	public float getSalesPrice() {
		return this.salesPrice;
	}

	public void setSalesPrice(float salesPrice) {
		this.salesPrice = salesPrice;
	}

	public float getPurchase() {
		return this.purchase;
	}

	public void setPurchase(float purchase) {
		this.purchase = purchase;
	}

	public float getSolvency() {
		return this.solvency;
	}

	public void setSolvency(float solvency) {
		this.solvency = solvency;
	}

	public int getNbTransaction() {
		return this.nbTransaction;
	}

	public void setNbTransaction(int nbTransaction) {
		this.nbTransaction = nbTransaction;
	}

}
