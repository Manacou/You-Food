/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.manacou.youfood.dao.jpa;

import fr.manacou.youfood.dao.TableDao;
import fr.manacou.youfood.entities.Area;
import fr.manacou.youfood.entities.Table;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Kevin
 */
@Stateless
public class TableDaoJpa implements TableDao{

    @PersistenceContext
    private EntityManager em;
    
    @Override
    public Table createTable(Table table) {
        
        em.persist(table);
        return table;
    }

    @Override
    public List<Table> getAllTableByArea(long idArea) {
        
        return em.find(Area.class, idArea).getTables();
    }

    @Override
    public Table updateTable(Table table) {
        
        return em.merge(table);
    }

    @Override
    public void deleteTable(Table table) {
        
        em.remove(table);
    }  
}
