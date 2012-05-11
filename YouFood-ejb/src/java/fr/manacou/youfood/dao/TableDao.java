/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.manacou.youfood.dao;

import fr.manacou.youfood.entities.Table;
import java.util.List;

/**
 *
 * @author Kevin
 */
public interface TableDao {
    
    public Table createTable(Table table);
    public List<Table> getAllTableByArea(long idArea);
    public Table updateTable(Table table);
    public void deleteTable(Table table);
}
