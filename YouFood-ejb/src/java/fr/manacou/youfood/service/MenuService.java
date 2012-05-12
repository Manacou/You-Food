/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.manacou.youfood.service;

import fr.manacou.youfood.dao.MenuDao;
import fr.manacou.youfood.entities.Menu;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Kevin
 */
@Stateless
public class MenuService {
    
    @EJB
    private MenuDao mdao;
    
    public Menu createMenu(Menu menu)
    {
        return mdao.createMenu(menu);
    }
    
    public Menu getMenuById(long id)
    {
        return mdao.getMenuById(id);
    }        
    
    public Menu updateMenu(Menu menu)
    {
        return mdao.updateMenu(menu);
    }
    
    public void deleteMenu(Menu menu)
    {
        mdao.deleteMenu(menu);
    }
}
