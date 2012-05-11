/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.manacou.youfood.dao;

import fr.manacou.youfood.entities.Menu;

/**
 *
 * @author Kevin
 */
public interface MenuDao {
    
    public Menu createMenu(Menu menu);
    public Menu getMenuById(long id);
    public Menu updateMenu(Menu menu);
    public void deleteMenu(Menu menu);
}
