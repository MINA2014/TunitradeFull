package edu.esprit.domain.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Comment
 * 
 */
@Entity
public class Comment implements Serializable {

	private int id;
	private Trader trader;
	private CentralBank centralBank;
	private static final long serialVersionUID = 1L;

	public Comment() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return this.id;
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

	@ManyToOne
	public Trader getTrader() {
		return trader;
	}

	public void setTrader(Trader trader) {
		this.trader = trader;
	}

}
