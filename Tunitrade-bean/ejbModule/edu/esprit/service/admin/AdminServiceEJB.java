package edu.esprit.service.admin;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.domain.entities.Admin;

/**
 * Session Bean implementation class ClientServiceEJB
 */
@Stateless
public class AdminServiceEJB implements AdminServiceEJBRemote,
		AdminServiceEJBLocal {

	/**
	 * creation of a new entity manager + calling persistence context
	 */
	@PersistenceContext(unitName = "Tunitrade1")
	private EntityManager em;

	public AdminServiceEJB() {

	}

	/**
 * 
 */
	//method of adding an administrator
	@Override
	public void add(Admin admin) {
		em.persist(admin);

	}

	//method of updating a corporate
	@Override
	public void update(Admin admin) {
		em.merge(admin);

	}

	
	@Override
	public Admin findBY(int id) {

		return em.find(Admin.class, id);
	}

	@Override
	public List<Admin> findall() {

		return em.createQuery("select a from admin a", Admin.class)
				.getResultList();
	}

	//method of deleting a corporate
	@Override
	public boolean delete(Admin admin) {
		em.remove(em.merge(admin));
		return true;

	}

	@Override
	public Admin login(String login, String password) {
		Admin admin = new Admin();
		if (login.equals("chaima") & password.equals("chaima")) {

			admin.setId(1);

			return admin;
		}
		return admin;
	}

}