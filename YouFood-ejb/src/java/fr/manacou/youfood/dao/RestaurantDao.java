/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.manacou.youfood.dao;

import fr.manacou.youfood.entities.Restaurant;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Kevin
 */
@Local
public interface RestaurantDao {
    
    public Restaurant createRestaurant(Restaurant restaurant);
    public List<Restaurant> getAllrestaurants();
    public Restaurant getRestaurantById(long id);
    public Restaurant updateRestaurant(Restaurant restaurant);
    public void deleteRestaurant(Restaurant restaurant);
}
