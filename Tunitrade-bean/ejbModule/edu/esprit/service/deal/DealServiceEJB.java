package edu.esprit.service.deal;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.domain.entities.Deal;

/**
 * Session Bean implementation class ClientServiceEJB
 */
@Stateless
public class DealServiceEJB implements DealServiceEJBRemote,
		DealServiceEJBLocal {

	/**
	 * Default constructor.
	 */
	@PersistenceContext(unitName = "Tunitrade1")
	private EntityManager em;

	public DealServiceEJB() {

	}

	/**
 * 
 */
	@Override
	public void add(Deal deal) {
		em.persist(deal);

	}

	@Override
	public void update(Deal deal) {
		em.merge(deal);

	}

	@Override
	public Deal findBY(String trader) {

		return em.find(Deal.class, trader);
	}

	@Override
	public List<Deal> findall() {

		return em.createQuery("select e from Event e", Deal.class)
				.getResultList();
	}

	@Override
	public void delete(Deal deal) {
		em.remove(em.merge(deal));

	}

}
