package ch.heig.od.model;

public class LigneCommande {

    private int idproduit;
    private int quantite;
    private int prix;

    public LigneCommande(){}

    public LigneCommande(int idproduit, int quantite, int prix) {

        this.idproduit = idproduit;
        this.quantite = quantite;
        this.prix = prix;
    }

    public int getProduit() {
        return idproduit;
    }

    public int getQuantite() {
        return quantite;
    }

    public int getPrix() {
        return prix;
    }

    public void setProduit(int idproduit) {
        this.idproduit = idproduit;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
}
