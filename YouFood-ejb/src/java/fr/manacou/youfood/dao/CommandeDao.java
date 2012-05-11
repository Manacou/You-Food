/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.manacou.youfood.dao;

import fr.manacou.youfood.entities.Commande;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Kevin
 */
@Local
public interface CommandeDao {
    
    public Commande createCommande(Commande commande);
    public List<Commande> getAllCommandes();
    public Commande getCommandeById(long id);
    public Commande updateCommande(Commande commande);
    public void deleteCommande(Commande commande);
}
