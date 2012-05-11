/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.manacou.youfood.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author bengarion
 */
@Entity
public class Area implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idArea;
    
    @ManyToOne
    @JoinColumn(name="restaurant_fk")
    private Restaurant restaurant;
    
    private int nbSeats;
    
    @OneToMany(mappedBy="idArea")
    private List<Shift> shifts;
    
    @OneToMany(mappedBy="idArea")
    private List<Table> tables;

    public Long getId() {
        return idArea;
    }

    public void setId(Long id) {
        this.idArea = id;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public int getNbSeats() {
        return nbSeats;
    }

    public void setNbSeats(int nbSeats) {
        this.nbSeats = nbSeats;
    }

    public Long getIdArea() {
        return idArea;
    }

    public void setIdArea(Long idArea) {
        this.idArea = idArea;
    }

    public List<Shift> getShifts() {
        return shifts;
    }

    public void setShifts(List<Shift> shifts) {
        this.shifts = shifts;
    }

    public List<fr.manacou.youfood.entities.Table> getTables() {
        return tables;
    }

    public void setTables(List<fr.manacou.youfood.entities.Table> tables) {
        this.tables = tables;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idArea != null ? idArea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Area)) {
            return false;
        }
        Area other = (Area) object;
        if ((this.idArea == null && other.idArea != null) || (this.idArea != null && !this.idArea.equals(other.idArea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.manacou.youfood.entities.Area[ id=" + idArea + " ]";
    }
    
}
