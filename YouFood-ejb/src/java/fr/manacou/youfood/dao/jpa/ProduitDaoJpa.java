/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.manacou.youfood.dao.jpa;

import fr.manacou.youfood.dao.ProduitDao;
import fr.manacou.youfood.entities.Produit;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Kevin
 */
@Stateless
public class ProduitDaoJpa implements ProduitDao{

    @PersistenceContext
    private EntityManager em;
    
    @Override
    public Produit createProduit(Produit produit) {
        
        em.persist(produit);
        return produit;
    }

    @Override
    public List<Produit> getAllProduitsByType(int type) {
        
        Query query = em.createQuery("SELECT p FROM produit p WHERE p.type = :idType");
        query.setParameter("idType", type);
        
        return query.getResultList();
    }

    @Override
    public List<Produit> getAllProduits() {
        
        return em.createQuery("SELECT p FROM produit").getResultList();
    }

    @Override
    public Produit getProduitById(long id) {
        
        return em.find(Produit.class, id);
    }

    @Override
    public Produit updateProduit(Produit produit) {
        return em.merge(produit);
    }

    @Override
    public void deleteProduit(Produit produit) {
        em.remove(produit);
    }
    
}
