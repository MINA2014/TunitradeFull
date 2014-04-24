package edu.esprit.service.articles;

import java.util.List;

import javax.ejb.Local;

import edu.esprit.domain.entities.Article;

@Local
public interface ArticlesServicesEJBLocal {

	void doAddArticle(Article article);

	void doUpdateArticle(Article article);

	Article doFindBY(int id);

	List<Article> doFindall();

	boolean doDeleteArticle(Article article);

}
