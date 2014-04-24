package edu.esprit.service.event;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import edu.esprit.domain.entities.Event;

/**
 * Session Bean implementation class ClientServiceEJB
 */
@Stateless
public class EventServiceEJB implements EventServiceEJBRemote,
		EventServiceEJBLocal {

	/**
	 * Default constructor.
	 */
	@PersistenceContext(unitName = "Tunitrade1")
	private EntityManager em;

	public EventServiceEJB() {

	}

	/**
 * 
 */
	@Override
	public void add(Event event) {
		em.persist(event);

	}

	@Override
	public void update(Event event) {
		em.merge(event);

	}

	public Event findBY(String name) {

		/* return em.find(Event.class, name); */

		Query query = em
				.createQuery("select Event e from Event where e.name=:p");
		query.setParameter("p", name);
		return (Event) query.getSingleResult();
	}

	@Override
	public List<Event> findall() {

		return em.createQuery("select e from Event e", Event.class)
				.getResultList();
	}

	@Override
	public void delete(Event event) {
		em.remove(em.merge(event));

	}

}