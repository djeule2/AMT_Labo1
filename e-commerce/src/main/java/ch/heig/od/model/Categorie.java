package ch.heig.od.model;

import java.util.ArrayList;
import java.util.Collection;

public class Categorie {
    private Long idCategorie;
    private String nomCategorie;
    private String description;
    private Collection<Produit> produits = new ArrayList<Produit>();

    Categorie(){}

    public Categorie(Long idCategorie, String nomCategorie, String description) {
        this.idCategorie = idCategorie;
        this.nomCategorie = nomCategorie;
        this.description = description;
    }

    public Long getIdCategorie() {
        return idCategorie;
    }

    public String getNomCategorie() {
        return nomCategorie;
    }

    public String getDescription() {
        return description;
    }

    public Collection<Produit> getProduit() {
        return produits;
    }

    public void setIdCategorie(Long idCategorie) {
        this.idCategorie = idCategorie;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProduit(Collection<Produit> produit) {
        this.produits = produit;
    }
}
