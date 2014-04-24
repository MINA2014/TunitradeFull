package edu.esprit.service.notification;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.domain.entities.Notification;

/**
 * Session Bean implementation class ClientServiceEJB
 */
@Stateless
public class NotificationServiceEJB implements NotificationServiceEJBRemote,
		NotificationServiceEJBLocal {

	/**
	 * Default constructor.
	 */
	@PersistenceContext(unitName = "Tunitrade1")
	private EntityManager em;

	public NotificationServiceEJB() {

	}

	/**
 * 
 */
	@Override
	public void add(Notification notification) {
		em.persist(notification);

	}

	@Override
	public void update(Notification notification) {
		em.merge(notification);

	}

	@Override
	public Notification findBY(int id) {

		return em.find(Notification.class, id);
	}

	@Override
	public List<Notification> findall() {

		return em.createQuery("select n from Bank n", Notification.class)
				.getResultList();
	}

	@Override
	public void delete(Notification notification) {
		em.remove(em.merge(notification));

	}

}