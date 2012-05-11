/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.manacou.youfood.dao.jpa;

import fr.manacou.youfood.dao.AreaDao;
import fr.manacou.youfood.entities.Area;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Kevin
 */
@Stateless
public class AreaDaoJpa implements AreaDao {

    @PersistenceContext
    private EntityManager em;
    
    @Override
    public Area createArea(Area area) {
        
        em.persist(area);
        return area;
    }

    @Override
    public Area getAreaById(long id) {
        
        return em.find(Area.class, id);
    }

    @Override
    public Area updateArea(Area area) {
        
        return em.merge(area);
    }

    @Override
    public void deleteArea(Area area) {
        em.remove(area);
    }  
}
