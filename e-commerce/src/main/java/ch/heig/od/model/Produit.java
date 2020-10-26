package ch.heig.od.model;

public class Produit {
    private int idProduit;
    private int prix;
    private String nomProduit;
    private String description;
    private int  idCategorie;
    private int quantite;
    private String photos;
    private String couleur;
    private int taille;

    public Produit(){}

    public Produit( String nomProduit, int prix, String description, int quantite, String photos,String couleur, int taille, int idCategorie) {

        this.prix = prix;
        this.nomProduit = nomProduit;
        this.description = description;
        this.quantite = quantite;
        this.photos = photos;
        this.couleur = couleur;
        this.taille = taille;
        this.idCategorie = idCategorie;
    }

    public int getIdProduit() {
        return idProduit;
    }

    public double getPrix() {
        return prix;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public int getidCategorie() {
        return idCategorie;
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

    public String getCouleur() {
        return couleur;
    }

    public int getTaille() {
        return taille;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
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

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }
}
