package edu.esprit.service.articles;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.domain.entities.Article;

@Remote
public interface ArticlesServicesEJBRemote {

	void doAddArticle(Article article);

	void doUpdateArticle(Article article);

	Article doFindBY(int id);

	List<Article> doFindall();

	boolean doDeleteArticle(Article article);

}
