/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.manacou.youfood.dao.jpa;

import fr.manacou.youfood.dao.StatutDao;
import fr.manacou.youfood.entities.Statut;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Kevin
 */
@Stateless
public class StatutDaoJpa implements StatutDao{

    @PersistenceContext
    private EntityManager em;
    
    @Override
    public Statut createStatut(Statut statut) {
        
        em.persist(statut);
        return statut;
    }

    @Override
    public Statut getStatutById(long id) {
        
       return em.find(Statut.class, id);
    }

    @Override
    public Statut updateStatut(Statut statut) {
        
       return em.merge(statut);
    }

    @Override
    public void deleteStatut(Statut statut) {
        
        em.remove(statut);
    }
}
