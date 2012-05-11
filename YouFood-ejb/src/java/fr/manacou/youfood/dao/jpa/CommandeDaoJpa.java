/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.manacou.youfood.dao.jpa;

import fr.manacou.youfood.dao.CommandeDao;
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
public class CommandeDaoJpa implements CommandeDao{

    @PersistenceContext
    private EntityManager em;
    
    @Override
    public Commande createCommande(Commande commande) {
        
        em.persist(commande);
        return commande;
    }

    @Override
    public List<Commande> getAllCommandes() {
        return em.createQuery("SELECT c FROM commande").getResultList();
    }

    @Override
    public Commande getCommandeById(long id) {
        return em.find(Commande.class, id);
    }

    @Override
    public Commande updateCommande(Commande commande) {
        return em.merge(commande);
    }

    @Override
    public void deleteCommande(Commande commande) {
        em.remove(commande);
    } 
}
