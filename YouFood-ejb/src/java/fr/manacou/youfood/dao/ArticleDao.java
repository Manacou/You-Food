/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.manacou.youfood.dao;

import fr.manacou.youfood.entities.Article;
import java.util.List;

/**
 *
 * @author Kevin
 */
public interface ArticleDao {
    
    public Article createArticle(Article article);
    public List<Article> getAllArticleByCommande(long idCommande);
    public void deleteArticle(Article article);
            
}
