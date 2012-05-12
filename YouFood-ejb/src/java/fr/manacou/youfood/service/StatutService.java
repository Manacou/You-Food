/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.manacou.youfood.service;

import fr.manacou.youfood.dao.StatutDao;
import fr.manacou.youfood.entities.Statut;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Kevin
 */
@Stateless
public class StatutService {
    
    @EJB
    private StatutDao sdao;
    
    public Statut createStatut(Statut statut)
    {
        return sdao.createStatut(statut);
    }
    
    public Statut getStatutById(long id)
    {
        return sdao.getStatutById(id);
    }
    
    public Statut updateStatut(Statut statut)
    {
        return sdao.updateStatut(statut);
    }
    
    public void deleteStatut(Statut statut)
    {
        sdao.deleteStatut(statut);
    }
}
