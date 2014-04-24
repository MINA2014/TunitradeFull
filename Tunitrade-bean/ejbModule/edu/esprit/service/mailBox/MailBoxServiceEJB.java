package edu.esprit.service.mailBox;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.domain.entities.MailBox;

/**
 * Session Bean implementation class ClientServiceEJB
 */
@Stateless
public class MailBoxServiceEJB implements MailBoxServiceEJBRemote,
		MailBoxServiceEJBLocal {

	/**
	 * Default constructor.
	 */
	@PersistenceContext(unitName = "Tunitrade1")
	private EntityManager em;

	public MailBoxServiceEJB() {

	}

	/**
 * 
 */
	@Override
	public void add(MailBox mailBox) {
		em.persist(mailBox);

	}

	@Override
	public void update(MailBox mailBox) {
		em.merge(mailBox);

	}

	@Override
	public MailBox findBY(int id) {

		return em.find(MailBox.class, id);
	}

	@Override
	public List<MailBox> findall() {

		return em.createQuery("select e from Event e", MailBox.class)
				.getResultList();
	}

	@Override
	public void delete(MailBox mailBox) {
		em.remove(em.merge(mailBox));

	}

}
