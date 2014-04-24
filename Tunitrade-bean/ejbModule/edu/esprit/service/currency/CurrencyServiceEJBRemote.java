package edu.esprit.service.currency;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.domain.entities.Currency;

@Remote
public interface CurrencyServiceEJBRemote {
	public void add(Currency currency);

	public void update(Currency currency);

	public Currency findBY(int id);

	public List<Currency> findall();

	public void delete(Currency currency);

}
