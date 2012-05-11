/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.manacou.youfood.dao;

import fr.manacou.youfood.entities.Utilisateur;
import java.util.List;

/**
 *
 * @author Kevin
 */
public interface UtilisateurDao {
    
    public Utilisateur createUtilisateur(Utilisateur utilisateur);
    public List<Utilisateur> getAllUtilisateurs();
    public Utilisateur updateUtilisateur(Utilisateur utilisateur);
    public void deleteUtilisateur(Utilisateur utilisateur);
}
