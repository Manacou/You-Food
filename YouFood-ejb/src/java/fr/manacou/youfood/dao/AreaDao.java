/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.manacou.youfood.dao;

import fr.manacou.youfood.entities.Area;
import javax.ejb.Local;

/**
 *
 * @author Kevin
 */
@Local
public interface AreaDao {
    
    public Area createArea(Area area);
    public Area getAreaById(long id);
    public Area updateArea(Area area);
    public void deleteArea(Area area);
}
