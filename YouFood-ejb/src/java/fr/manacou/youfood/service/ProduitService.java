/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.manacou.youfood.service;

import fr.manacou.youfood.dao.ProduitDao;
import fr.manacou.youfood.entities.Produit;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Kevin
 */
@Stateless
public class ProduitService {
    
    @EJB
    private ProduitDao pdao;
    
    public Produit createProduit(Produit produit)
    {
        return pdao.createProduit(produit);
    }
    
    public List<Produit> getAllProduitsByType(int type)
    {
        return pdao.getAllProduitsByType(type);
    }
    
    public List<Produit> getAllProduits()
    {
        return pdao.getAllProduits();
    }
    
    public Produit getProduitById(long id)
    {
        return pdao.getProduitById(id);
    }
    
    public Produit updateProduit(Produit produit)
    {
        return pdao.updateProduit(produit);
    }
    
    public void deleteProduit(Produit produit)
    {
        pdao.deleteProduit(produit);
    }
}
