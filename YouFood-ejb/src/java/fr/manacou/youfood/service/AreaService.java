/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.manacou.youfood.service;

import fr.manacou.youfood.dao.AreaDao;
import fr.manacou.youfood.entities.Area;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Kevin
 */
@Stateless
public class AreaService {
    
    @EJB
    private AreaDao adao;
    
    public Area createArea(Area area)
    {
        return adao.createArea(area);
    }
    public Area getAreaById(long id)
    {
        return adao.getAreaById(id);
    }
    public Area updateArea(Area area)
    {
        return adao.updateArea(area);
    }
    public void deleteArea(Area area)
    {
        adao.deleteArea(area);
    }
}
