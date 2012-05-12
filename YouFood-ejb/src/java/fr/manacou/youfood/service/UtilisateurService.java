/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.manacou.youfood.service;

import fr.manacou.youfood.dao.UtilisateurDao;
import fr.manacou.youfood.entities.Utilisateur;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Kevin
 */
@Stateless
public class UtilisateurService {
    
    @EJB
    private UtilisateurDao udao;
    
    public Utilisateur createUtilisateur(Utilisateur utilisateur)
    {
        return udao.createUtilisateur(utilisateur);
    }
    
    public List<Utilisateur> getAllUtilisateurs()
    {
        return udao.getAllUtilisateurs();
    }
    
    public Utilisateur updateUtilisateur(Utilisateur utilisateur)
    {
        return udao.updateUtilisateur(utilisateur);
    }
    
    public void deleteUtilisateur(Utilisateur utilisateur)
    {
        udao.deleteUtilisateur(utilisateur);
    }
}
