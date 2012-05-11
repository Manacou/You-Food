/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.manacou.youfood.dao;

import fr.manacou.youfood.entities.Produit;
import java.util.List;

/**
 *
 * @author Kevin
 */
public interface ProduitDao {
    
    public Produit createProduit(Produit produit);
    public List<Produit> getAllProduitsByType(int type);
    public List<Produit> getAllProduits();
    public Produit getProduitById(long id);
    public Produit updateProduit(Produit produit);
    public void deleteProduit(Produit produit);
}
