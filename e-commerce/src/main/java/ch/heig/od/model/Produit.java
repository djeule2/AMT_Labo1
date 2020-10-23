package ch.heig.od.model;

public class Produit {
    private Long idProduit;
    private int prix;
    private String nomProduit;
    private String description;
    private Categorie categorie;
    private int quantite;
    private String photos;

    public Produit(){}

    public Produit(Long idProduit, int prix, String nomProduit, String description, Categorie categorie, int quantite, String photos) {
        this.idProduit = idProduit;
        this.prix = prix;
        this.nomProduit = nomProduit;
        this.description = description;
        this.categorie = categorie;
        this.quantite = quantite;
        this.photos = photos;
    }

    public Long getIdProduit() {
        return idProduit;
    }

    public double getPrix() {
        return prix;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantite() {
        return quantite;
    }

    public String getPhotos() {
        return photos;
    }

    public void setIdProduit(Long idProduit) {
        this.idProduit = idProduit;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setPhotos(String photos) {
        this.photos = photos;
    }
}
