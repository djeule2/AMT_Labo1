package ch.heig.od.model;

import java.util.Collection;
import java.util.Date;

public class Commande {
    private Long idCommande;
    private Date dateCommande;
    private Client client;
    private Collection<LigneCommande> ligneCommandes;

    Commande(){ }

    public Commande(Long idCommande, Date dateCommande, Client client) {
        this.idCommande = idCommande;
        this.dateCommande = dateCommande;
        this.client = client;
    }

    public Long getIdCommande() {
        return idCommande;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public Client getClient() {
        return client;
    }

    public Collection<LigneCommande> getLigneCommandes() {
        return ligneCommandes;
    }

    public void setLigneCommandes(Collection<LigneCommande> ligneCommandes) {
        this.ligneCommandes = ligneCommandes;
    }

    public void setIdCommande(Long idCommande) {
        this.idCommande = idCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
