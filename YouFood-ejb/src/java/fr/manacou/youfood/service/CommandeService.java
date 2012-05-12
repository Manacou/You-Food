/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.manacou.youfood.service;

import fr.manacou.youfood.dao.CommandeDao;
import fr.manacou.youfood.entities.Commande;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Kevin
 */

@Stateless
public class CommandeService {
    
    @EJB
    private CommandeDao cdao;
    
    public Commande createCommande(Commande commande)
    {
        return cdao.createCommande(commande);
    }
    
    public List<Commande> getAllCommandes()
    {
        return cdao.getAllCommandes();
    }
    
    public Commande getCommandeById(long id)
    {
        return cdao.getCommandeById(id);
    }
    
    public Commande updateCommande(Commande commande)
    {
        return cdao.updateCommande(commande);
    }
    
    public void deleteCommande(Commande commande)
    {
        cdao.deleteCommande(commande);
    }
}
