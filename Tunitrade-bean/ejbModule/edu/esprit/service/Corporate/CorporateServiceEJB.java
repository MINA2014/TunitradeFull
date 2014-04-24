package edu.esprit.service.Corporate;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.domain.entities.Corporate;

/**
 * Session Bean implementation class ClientServiceEJB
 */
@Stateless
@LocalBean
public class CorporateServiceEJB implements CorporateServiceEJBRemote,
		CorporateServiceEJBLocal {

	/**
	 * Default constructor.
	 */
	@PersistenceContext(unitName = "Tunitrade1")
	private EntityManager em;

	public CorporateServiceEJB() {

	}

	// method of adding a corporate

	@Override
	public void add(Corporate Corporate) {
		em.persist(Corporate);

	}

	// method of updating a corporate

	@Override
	public void update(Corporate Corporate) {
		em.merge(Corporate);

	}

	// method that ensures the search for a corporate through its identifier

	@Override
	public Corporate findBY(int id) {

		return em.find(Corporate.class, id);
	}

	// method ensures the recovery of the list of corporate

	@Override
	public List<Corporate> findall() {

		return em.createQuery("select c from Corporate c", Corporate.class)
				.getResultList();
	}

	// delete corporate method

	@Override
	public void delete(Corporate corporate) {
		em.remove(em.merge(corporate));

	}

}