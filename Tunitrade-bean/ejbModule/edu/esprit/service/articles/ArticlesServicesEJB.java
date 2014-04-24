package edu.esprit.service.articles;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.domain.entities.Article;

/**
 * Session Bean implementation class ClientServiceEJB
 */
@Stateless
public class ArticlesServicesEJB implements ArticlesServicesEJBLocal,
		ArticlesServicesEJBRemote {

	/**
	 * creation of a new entity manager + calling persistence context
	 */
	@PersistenceContext(unitName = "Tunitrade1")
	private EntityManager em;

	public ArticlesServicesEJB() {
	}

	/**
 * 
 */
	// method of adding an articles
	@Override
	public void doAddArticle(Article article) {
		em.persist(article);

	}

	// method of updating an article
	@Override
	public void doUpdateArticle(Article article) {
		em.merge(article);

	}

	@Override
	public Article doFindBY(int id) {

		return em.find(Article.class, id);
	}

	@Override
	public List<Article> doFindall() {

		return em.createQuery("select a from article a", Article.class)
				.getResultList();
	}

	// method of deleting a corporate
	@Override
	public boolean doDeleteArticle(Article article) {
		em.remove(em.merge(article));
		return true;

	}

	public void update(Article article) {
	}

}