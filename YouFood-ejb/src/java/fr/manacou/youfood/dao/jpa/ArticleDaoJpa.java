/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.manacou.youfood.dao.jpa;

import fr.manacou.youfood.dao.ArticleDao;
import fr.manacou.youfood.entities.Article;
import fr.manacou.youfood.entities.Commande;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Kevin
 */
@Stateless
public class ArticleDaoJpa implements ArticleDao{

    @PersistenceContext
    private EntityManager em;
    
    @Override
    public Article createArticle(Article article) {
        
        em.persist(article);
        return article;
    }

    @Override
    public List<Article> getAllArticleByCommande(long idCommande) {
        return em.find(Commande.class, idCommande).getArticles();
    }

    @Override
    public void deleteArticle(Article article) {
        em.remove(article);
    }
    
}
