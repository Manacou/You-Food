/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.manacou.youfood.dao;

import fr.manacou.youfood.entities.Statut;

/**
 *
 * @author Kevin
 */
public interface StatutDao {
    
    public Statut createStatut(Statut statut);
    public Statut getStatutById(long id);
    public Statut updateStatut(Statut statut);
    public void deleteStatut(Statut statut);
}
