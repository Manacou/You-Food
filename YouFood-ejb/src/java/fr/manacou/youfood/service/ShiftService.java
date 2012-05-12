/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.manacou.youfood.service;

import fr.manacou.youfood.dao.ShiftDao;
import fr.manacou.youfood.entities.Shift;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Kevin
 */
@Stateless
public class ShiftService {
    
    @EJB
    private ShiftDao sdao;
    
    public Shift createShift(Shift shift)
    {
        return sdao.createShift(shift);
    }
    
    public List<Shift> getAllShifts()
    {
        return sdao.getAllShifts();
    }
    
    public List<Shift> getAllShiftsByArea(long idArea)
    {
        return sdao.getAllShiftsByArea(idArea);
    }
    public List<Shift> getAllShiftsByUtilisateur(long idUtilisateur)
    {
        return sdao.getAllShiftsByUtilisateur(idUtilisateur);
    }

    public Shift updateShift(Shift shift)
    {
        return sdao.updateShift(shift);
    }
    
    public void deleteShift(Shift shift)
    {
        sdao.deleteShift(shift);
    }    
}
