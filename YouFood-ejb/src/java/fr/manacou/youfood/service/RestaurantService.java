/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.manacou.youfood.service;

import fr.manacou.youfood.dao.RestaurantDao;
import fr.manacou.youfood.entities.Restaurant;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Kevin
 */
@Stateless
public class RestaurantService {
    
    @EJB
    private RestaurantDao rdao;
    
    public Restaurant createRestaurant(Restaurant restaurant)
    {
        return rdao.createRestaurant(restaurant);
    }
    
    public List<Restaurant> getAllrestaurants()
    {
        return rdao.getAllrestaurants();
    }
    
    public Restaurant getRestaurantById(long id)
    {
        return rdao.getRestaurantById(id);
    }
    
    public Restaurant updateRestaurant(Restaurant restaurant)
    {
        return rdao.updateRestaurant(restaurant);
    }
    
    public void deleteRestaurant(Restaurant restaurant)
    {
        rdao.deleteRestaurant(restaurant);
    }
}
