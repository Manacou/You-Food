/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.manacou.youfood.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Kevin
 */
@Entity
public class Table implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTable;
    
    @ManyToOne
    @JoinColumn(name="area_fk")
    private Area area;
    

    public Long getId() {
        return idTable;
    }

    public void setId(Long id) {
        this.idTable = id;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTable != null ? idTable.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Table)) {
            return false;
        }
        Table other = (Table) object;
        if ((this.idTable == null && other.idTable != null) || (this.idTable != null && !this.idTable.equals(other.idTable))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.manacou.youfood.dao.Tables[ id=" + idTable + " ]";
    }
    
}
