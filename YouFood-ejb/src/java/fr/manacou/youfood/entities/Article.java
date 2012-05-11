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
public class Article implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idArticle;
    
    @ManyToOne
    @JoinColumn(name="produit_fk")
    private Produit produit;
    
    private long idCommande; 

    public Long getId() {
        return idArticle;
    }

    public void setId(Long id) {
        this.idArticle = id;
    }

    public long getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(long idCommande) {
        this.idCommande = idCommande;
    }

    public Long getidArticle() {
        return idArticle;
    }

    public void setidArticle(Long idArticle) {
        this.idArticle = idArticle;
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
        hash += (idArticle != null ? idArticle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Article)) {
            return false;
        }
        Article other = (Article) object;
        if ((this.idArticle == null && other.idArticle != null) || (this.idArticle != null && !this.idArticle.equals(other.idArticle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.manacou.youfood.dao.ListePlats[ id=" + idArticle + " ]";
    }
    
}
