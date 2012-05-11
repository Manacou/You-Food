/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.manacou.youfood.dao.jpa;

import fr.manacou.youfood.dao.UtilisateurDao;
import fr.manacou.youfood.entities.Utilisateur;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Kevin
 */

@Stateless
public class UtilisateurDaoJpa implements UtilisateurDao{

    @PersistenceContext
    private EntityManager em;
    
    @Override
    public Utilisateur createUtilisateur(Utilisateur utilisateur) {
        
        em.persist(utilisateur);
        return utilisateur;
    }

    @Override
    public List<Utilisateur> getAllUtilisateurs() {
        
        return em.createQuery("SELECT u FROM utilisateur").getResultList();
    }

    @Override
    public Utilisateur updateUtilisateur(Utilisateur utilisateur) {
        
        return em.merge(utilisateur);
    }

    @Override
    public void deleteUtilisateur(Utilisateur utilisateur) {
        
        em.remove(utilisateur);
    }  
}
