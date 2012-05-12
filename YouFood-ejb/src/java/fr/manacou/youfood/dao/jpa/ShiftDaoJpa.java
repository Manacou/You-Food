/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.manacou.youfood.dao.jpa;

import fr.manacou.youfood.dao.ShiftDao;
import fr.manacou.youfood.entities.Area;
import fr.manacou.youfood.entities.Shift;
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
public class ShiftDaoJpa implements ShiftDao{

    @PersistenceContext
    private EntityManager em;
    
    @Override
    public Shift createShift(Shift shift) {
        
        em.persist(shift);
        return shift;
    }

    @Override
    public List<Shift> getAllShifts() {
        
        return em.createQuery("SELECT s FROM shift").getResultList();
    }

    @Override
    public List<Shift> getAllShiftsByArea(long idArea) {
        
        return em.find(Area.class, idArea).getShifts();
    }

    @Override
    public List<Shift> getAllShiftsByUtilisateur(long idUtilisateur) {
        
        return em.find(Utilisateur.class, idUtilisateur).getShifts();
    }

    @Override
    public Shift updateShift(Shift shift) {
        return em.merge(shift);
    }

    @Override
    public void deleteShift(Shift shift) {
        em.remove(shift);
    }
    
}
