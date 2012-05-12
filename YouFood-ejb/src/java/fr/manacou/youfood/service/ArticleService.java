/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.manacou.youfood.service;

import fr.manacou.youfood.dao.ArticleDao;
import fr.manacou.youfood.entities.Article;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Kevin
 */
@Stateless
public class ArticleService {
    
    @EJB
    private ArticleDao adao;
    
   public Article createArticle(Article article)
   {
       return adao.createArticle(article);
   }
   
   public List<Article> getAllArticleByCommande(long idCommande)
   {
       return adao.getAllArticleByCommande(idCommande);
   }
   
   public void deleteArticle(Article article)
   {
       adao.deleteArticle(article);
   }
}
