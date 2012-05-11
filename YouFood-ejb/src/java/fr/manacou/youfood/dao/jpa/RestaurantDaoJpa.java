/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.manacou.youfood.dao.jpa;

import fr.manacou.youfood.dao.RestaurantDao;
import fr.manacou.youfood.entities.Restaurant;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Kevin
 */
@Stateless
public class RestaurantDaoJpa implements RestaurantDao {

    @PersistenceContext
    private EntityManager em;
    
    @Override
    public Restaurant createRestaurant(Restaurant restaurant) {
        
        em.persist(restaurant);
        return restaurant;
    }

    @Override
    public List<Restaurant> getAllrestaurants() {
        
        return em.createQuery("SELECT r FROM restaurant").getResultList();
    }

    @Override
    public Restaurant getRestaurantById(long id) {
        
        return em.find(Restaurant.class, id);
    }

    @Override
    public Restaurant updateRestaurant(Restaurant restaurant) {
        
        return em.merge(restaurant);
    }

    @Override
    public void deleteRestaurant(Restaurant restaurant) {
        em.remove(restaurant);
    }
}
