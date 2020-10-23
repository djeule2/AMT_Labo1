package ch.heig.od.model;

public class LigneCommande {
    private Long id;
    private Produit produit;
    private int quantite;
    private double prix;

    public LigneCommande(){}

    public LigneCommande(Long id, Produit produit, int quantite, double prix) {
        this.id = id;
        this.produit = produit;
        this.quantite = quantite;
        this.prix = prix;
    }

    public Long getId() {
        return id;
    }

    public Produit getProduit() {
        return produit;
    }

    public int getQuantite() {
        return quantite;
    }

    public double getPrix() {
        return prix;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
