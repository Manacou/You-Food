/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.manacou.youfood.service;

import fr.manacou.youfood.dao.TableDao;
import fr.manacou.youfood.entities.Table;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Kevin
 */
@Stateless
public class TableService {
    
    @EJB
    private TableDao tdao;
    
    public Table createTable(Table table)
    {
        return tdao.createTable(table);
    }
    
    public List<Table> getAllTableByArea(long idArea)
    {
        return tdao.getAllTableByArea(idArea);
    }
    
    public Table updateTable(Table table)
    {
        return tdao.updateTable(table);
    }
    
    public void deleteTable(Table table)
    {
        tdao.deleteTable(table);
    }
}
