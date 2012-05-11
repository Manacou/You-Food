/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.manacou.youfood.dao.jpa;

import fr.manacou.youfood.dao.MenuDao;
import fr.manacou.youfood.entities.Menu;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Kevin
 */
@Stateless
public class MenuDaoJpa implements MenuDao{

    @PersistenceContext
    private EntityManager em;
    
    @Override
    public Menu createMenu(Menu menu) {
        
        em.persist(menu);
        return menu;
    }

    @Override
    public Menu getMenuById(long id) {
        return em.find(Menu.class, id);
    }

    @Override
    public Menu updateMenu(Menu menu) {
        return em.merge(menu);
    }

    @Override
    public void deleteMenu(Menu menu) {
        
        em.remove(menu);
    }
}
