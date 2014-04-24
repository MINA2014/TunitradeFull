package edu.esprit.service.currency;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.domain.entities.Currency;

/**
 * Session Bean implementation class ClientServiceEJB
 */
@Stateless
@LocalBean
public class CurrencyServiceEJB implements CurrencyServiceEJBRemote,CurrencyServiceEJBLocal {

	/**
	 * Default constructor.
	 */
	@PersistenceContext(unitName = "Tunitrade1")
	private EntityManager em;

	public CurrencyServiceEJB() {

	}

	/**
 * 
 */
	@Override
	public void add(Currency currency) {
		em.persist(currency);

	}

	@Override
	public void update(Currency currency) {
		em.merge(currency);

	}

	@Override
	public Currency findBY(int id) {

		return em.find(Currency.class, id);
	}

	@Override
	public List<Currency> findall() {

		return em.createQuery("select c from Corporate c", Currency.class)
				.getResultList();
	}

	@Override
	public void delete(Currency currency) {
		em.remove(em.merge(currency));

	}

}
