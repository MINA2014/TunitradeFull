package edu.esprit.service.message;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.domain.entities.Message;

/**
 * Session Bean implementation class ClientServiceEJB
 */
@Stateless
public class MessageServiceEJB implements MessageServiceEJBRemote,
		MessageServiceEJBLocal {

	/**
	 * Default constructor.
	 */
	@PersistenceContext(unitName = "Tunitrade1")
	private EntityManager em;

	public MessageServiceEJB() {

	}

	/**
 * 
 */
	@Override
	public void add(Message message) {
		em.persist(message);

	}

	@Override
	public void update(Message message) {
		em.merge(message);

	}

	@Override
	public Message findBY(int id) {

		return em.find(Message.class, id);
	}

	@Override
	public List<Message> findall() {

		return em.createQuery("select m from Event m", Message.class)
				.getResultList();
	}

	@Override
	public void delete(Message message) {
		em.remove(em.merge(message));

	}

}