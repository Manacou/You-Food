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
public class ListePlats implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idListe;
    
    @ManyToOne
    @JoinColumn(name="produit_fk")
    private Produit produit;
    
    private long idCommande; 

    public Long getId() {
        return idListe;
    }

    public void setId(Long id) {
        this.idListe = id;
    }

    public long getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(long idCommande) {
        this.idCommande = idCommande;
    }

    public Long getIdListe() {
        return idListe;
    }

    public void setIdListe(Long idListe) {
        this.idListe = idListe;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idListe != null ? idListe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ListePlats)) {
            return false;
        }
        ListePlats other = (ListePlats) object;
        if ((this.idListe == null && other.idListe != null) || (this.idListe != null && !this.idListe.equals(other.idListe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.manacou.youfood.dao.ListePlats[ id=" + idListe + " ]";
    }
    
}
