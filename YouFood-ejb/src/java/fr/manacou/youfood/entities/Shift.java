/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.manacou.youfood.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Kevin
 */
@Entity
public class Shift implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idShift;
    
    private long idUser;
    private long idArea;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date beginTime;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date endTime;

    public Long getId() {
        return idShift;
    }

    public void setId(Long id) {
        this.idShift = id;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public long getIdArea() {
        return idArea;
    }

    public void setIdArea(long idArea) {
        this.idArea = idArea;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idShift != null ? idShift.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Shift)) {
            return false;
        }
        Shift other = (Shift) object;
        if ((this.idShift == null && other.idShift != null) || (this.idShift != null && !this.idShift.equals(other.idShift))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.manacou.youfood.entities.Shift[ id=" + idShift + " ]";
    }
    
}
