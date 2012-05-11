/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.manacou.youfood.dao;

import fr.manacou.youfood.entities.Shift;
import java.util.List;

/**
 *
 * @author Kevin
 */
public interface ShiftDao {
    
    public Shift createShift(Shift shift);
    public List<Shift> getAllShifts();
    public List<Shift> getAllShiftsByArea(long idArea);
    public List<Shift> getAllShiftByUtilisateur(long idUtilisateur);
    public Shift updateShift(Shift shift);
    public void deleteShift(Shift shift);
}
