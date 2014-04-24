package edu.esprit.service.trader;

import java.util.List;

import javax.ejb.Local;

import edu.esprit.domain.entities.Trader;

@Local
public interface TraderServiceEJBLocal {
	public void add(Trader trader);

	public void update(Trader trader);

	public Trader findBY(String LastName);

	public List<Trader> findall();

	public void delete(Trader trader);

}