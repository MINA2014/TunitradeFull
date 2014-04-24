package edu.esprit.service.centralBank;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.domain.entities.CentralBank;

/**
 * Session Bean implementation class ClientServiceEJB
 */
@Stateless
public class CentralBankServiceEJB implements CentralBankServiceEJBRemote,
		CentralBankServiceEJBLocal {

	/**
	 * Default constructor.
	 */
	@PersistenceContext(unitName = "Tunitrade1")
	private EntityManager em;

	public CentralBankServiceEJB() {

	}

	/**
 * 
 */
	@Override
	public void add(CentralBank centralBank) {
		em.persist(centralBank);

	}

	@Override
	public void update(CentralBank centralBank) {
		em.merge(centralBank);

	}

	@Override
	public CentralBank findBY(int id) {

		return em.find(CentralBank.class, id);
	}

	@Override
	public List<CentralBank> findall() {

		return em.createQuery("select cb from CentralBank cb",
				CentralBank.class).getResultList();
	}

	@Override
	public void delete(CentralBank centralBank) {
		em.remove(em.merge(centralBank));

	}

}