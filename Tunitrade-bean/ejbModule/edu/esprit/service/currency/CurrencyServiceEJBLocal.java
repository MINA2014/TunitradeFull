package edu.esprit.service.currency;

import javax.ejb.Local;

import java.util.List;

import edu.esprit.domain.entities.Currency;

@Local
public interface CurrencyServiceEJBLocal {
	public void add(Currency currency);

	public void update(Currency currency);

	public Currency findBY(int id);

	public List<Currency> findall();

	public void delete(Currency currency);

}