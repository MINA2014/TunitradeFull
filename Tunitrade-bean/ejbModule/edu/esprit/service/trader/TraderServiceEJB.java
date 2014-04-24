package edu.esprit.service.trader;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import edu.esprit.domain.entities.Trader;

@Stateless
public class TraderServiceEJB implements TraderServiceEJBRemote,
		TraderServiceEJBLocal {

	/**
	 * Default constructor.
	 */
	@PersistenceContext(unitName = "Tunitrade1")
	private EntityManager em;

	public TraderServiceEJB() {

	}

	/**
 * 
 */
	@Override
	public void add(Trader trader) {
		em.persist(trader);

	}

	@Override
	public Trader findBY(String LastName) {

		return em.find(Trader.class, LastName);
	}

	@Override
	public List<Trader> findall() {

		return em.createQuery("select t from Trader t", Trader.class)
				.getResultList();
	}

	@Override
	public void delete(Trader trader) {
		em.remove(em.merge(trader));

	}

	@Override
	public void update(Trader trader) {
		// TODO Auto-generated method stub

	}

}