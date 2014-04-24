package edu.esprit.domain.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Deal
 * 
 */
@Entity
public class Deal implements Serializable {

	private int id;
	private float ccybase;
	private float ccybrate;
	private float ccya;
	private float ctrccy;
	private float ccyamt;
	private float ctramt;
	private float cust;
	private float typecust;
	private float ccyrate;
	private float dealnum;
	private Date deal_date;
	private String trader;
	private String type;
	private String origin;
	private float ccyb;
	private float currency;
	private List<Customer> customers;
	private List<Currency> currencies;
	private static final long serialVersionUID = 1L;

	public Deal() {
		super();
	}

	public Deal(int id, float ccybase, float ccybrate, float ccya,
			float ctrccy, float ccyamt, float ctramt, float cust,
			float typecust, float ccyrate, float dealnum, Date deal_date,
			String trader, String type, String origin, float ccyb,
			float currency, List<Customer> customers, List<Currency> currencies) {
		super();
		this.id = id;
		this.ccybase = ccybase;
		this.ccybrate = ccybrate;
		this.ccya = ccya;
		this.ctrccy = ctrccy;
		this.ccyamt = ccyamt;
		this.ctramt = ctramt;
		this.cust = cust;
		this.typecust = typecust;
		this.ccyrate = ccyrate;
		this.dealnum = dealnum;
		this.deal_date = deal_date;
		this.trader = trader;
		this.type = type;
		this.origin = origin;
		this.ccyb = ccyb;
		this.currency = currency;
		this.customers = customers;
		this.currencies = currencies;
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
	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	@ManyToMany
	public List<Currency> getCurrencies() {
		return currencies;
	}

	public void setCurrencies(List<Currency> currencies) {
		this.currencies = currencies;
	}

	public float getCcybase() {
		return this.ccybase;
	}

	public void setCcybase(float ccybase) {
		this.ccybase = ccybase;
	}

	public float getCcybrate() {
		return this.ccybrate;
	}

	public void setCcybrate(float ccybrate) {
		this.ccybrate = ccybrate;
	}

	public float getCcya() {
		return this.ccya;
	}

	public void setCcya(float ccya) {
		this.ccya = ccya;
	}

	public float getCtrccy() {
		return this.ctrccy;
	}

	public void setCtrccy(float ctrccy) {
		this.ctrccy = ctrccy;
	}

	public float getCcyamt() {
		return this.ccyamt;
	}

	public void setCcyamt(float ccyamt) {
		this.ccyamt = ccyamt;
	}

	public float getCtramt() {
		return this.ctramt;
	}

	public void setCtramt(float ctramt) {
		this.ctramt = ctramt;
	}

	public float getCust() {
		return this.cust;
	}

	public void setCust(float cust) {
		this.cust = cust;
	}

	public float getTypecust() {
		return this.typecust;
	}

	public void setTypecust(float typecust) {
		this.typecust = typecust;
	}

	public float getCcyrate() {
		return this.ccyrate;
	}

	public void setCcyrate(float ccyrate) {
		this.ccyrate = ccyrate;
	}

	public float getDealnum() {
		return this.dealnum;
	}

	public void setDealnum(float dealnum) {
		this.dealnum = dealnum;
	}

	public Date getDeal_date() {
		return this.deal_date;
	}

	public void setDeal_date(Date deal_date) {
		this.deal_date = deal_date;
	}

	public String getTrader() {
		return this.trader;
	}

	public void setTrader(String trader) {
		this.trader = trader;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOrigin() {
		return this.origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public float getCcyb() {
		return this.ccyb;
	}

	public void setCcyb(float ccyb) {
		this.ccyb = ccyb;
	}

	public float getCurrency() {
		return this.currency;
	}

	public void setCurrency(float currency) {
		this.currency = currency;
	}

}
