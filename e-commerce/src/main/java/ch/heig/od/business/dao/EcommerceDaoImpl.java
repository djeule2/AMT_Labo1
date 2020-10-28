package ch.heig.od.business.dao;

import ch.heig.od.model.*;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Stateless
public class EcommerceDaoImpl implements EcommerceDao {
    @Resource(lookup = "jdbc/ecommerceds")

    private DataSource dataSource;

    public List<Produit>listProduitParCategorie(int idCat){
        List<Produit> resultat = new ArrayList<>();
        try (Connection connection = dataSource.getConnection();
             PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM produit where produit.Categorie_idCategorie LIKE ?");){
            pstmt.setInt(1, idCat);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Produit  produit = new Produit();
                //produit.setCategorie(rs.getString("categorie"));
                // produit.setIdProduit(rs.getString("idProduit"));
                produit.setNomProduit(rs.getString("nomProduit"));
                produit.setPrix(rs.getInt("prix"));
                produit.setDescription(rs.getString("description"));
                produit.setPhotos(rs.getString("photos"));
                //  produit.setCategorie(rs.getString("categorie"));
                resultat.add(produit);
            }
     } catch (SQLException e) {
            Logger.getLogger(EcommerceDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        return resultat;
    }


    public Produit getProduit(int idPro){
        Produit produit = new Produit();
        try (Connection connection = dataSource.getConnection();
             PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM produit where idProduit = ? ");){
            ResultSet rs = pstmt.executeQuery();
            produit.setNomProduit(rs.getString("nomProduit"));
            produit.setPrix(rs.getInt("prix"));
            produit.setDescription(rs.getString("description"));
            produit.setPhotos(rs.getString("photos"));

        } catch (SQLException e) {
            Logger.getLogger(EcommerceDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        return produit;
    }


    public  List<Produit> listProduits() {
        List<Produit> resultat = new ArrayList<>();
        try (Connection connection = dataSource.getConnection();
             PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM produit ");){
           ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Produit  produit = new Produit();
                //produit.setCategorie(rs.getString("categorie"));
                produit.setIdProduit(rs.getInt("idProduit"));
                produit.setNomProduit(rs.getString("nomProduit"));
                produit.setPrix(rs.getInt("prix"));
                produit.setDescription(rs.getString("description"));
                produit.setPhotos(rs.getString("photos"));
                produit.setCouleur(rs.getString("couleur"));
              //  produit.setCategorie(rs.getString("categorie"));
                resultat.add(produit);
            }
       } catch (SQLException e) {
            Logger.getLogger(EcommerceDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        return resultat;
    }

    public List<LigneCommande>listeLigneCommande(int idPagnier){
        List<LigneCommande> resultat = new ArrayList<>();
        try (Connection connection = dataSource.getConnection();
             PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM lignecommande where lignecommande.Pagnier_idPagnier LIKE ?");){
            pstmt.setInt(1, idPagnier);

//            Connection connection = dataSource.getConnection();
//            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM contacts");
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                LigneCommande  ligneCommande = new LigneCommande();
                //ligneCommande.setProduit(rs.getInt("Produit_idProduit"));
                ligneCommande.setQuantite(rs.getInt("nomProduit"));
                ligneCommande.setPrix(rs.getInt("prix"));
                resultat.add(ligneCommande);
            }
//            pstmt.close();
//            connection.close();
        } catch (SQLException e) {
            Logger.getLogger(EcommerceDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        return resultat;

    }
    public void addProduit(Produit produit){
        try (
                Connection connection = dataSource.getConnection();
                PreparedStatement pstmt = connection.prepareStatement
                        ("insert into produit (nomProduit, prix,  description, quantite, photos, couleur, taille,  Categorie_idCategorie) values (?,?,?,?,?,?,?,?)")){

            pstmt.setString(1,produit.getNomProduit());
            pstmt.setInt(2,produit.getPrix());
            pstmt.setString(3, produit.getDescription());
            pstmt.setInt(4, produit.getQuantite());
            pstmt.setString(5, produit.getPhotos());
            pstmt.setString(6, produit.getCouleur());
            pstmt.setInt(7, produit.getTaille());
            pstmt.setInt(8, produit.getidCategorie());
            pstmt.executeUpdate();
//            pstmt.close();
//            connection.close();
        } catch (SQLException e) {
            Logger.getLogger(EcommerceDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void ajouterUser (Client user){
        try (
                Connection connection = dataSource.getConnection();
                PreparedStatement pstmt = connection.prepareStatement
                        ("insert into client (nomClient, email, tel, userName, passwrd) values (?,?,?,?,?)")){
                // pstmt.setString(1, produit.getIdProduit());
                pstmt.setString(1,user.getNomClient());
                pstmt.setString(2,user.getEmail());
                pstmt.setString(3, user.getTel());
                pstmt.setString(4, user.getUserName());
                pstmt.setString(5 , user.getPasswrd());
                pstmt.executeUpdate();
//              pstmt.close();
//              connection.close();
        } catch (SQLException e) {
            Logger.getLogger(EcommerceDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public Client checkLogin(String userName, String passwrd){
        Client client = new Client();
        try (Connection connection = dataSource.getConnection();
             PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM client where userName= ? and passwrd = ? ");){

           pstmt.setString(1, userName);
           pstmt.setString(2, passwrd);
            ResultSet rs = pstmt.executeQuery();
            client = null;
            if (rs.next()){
                client = new Client();
                client.setUserName(userName);
                client.setNomClient(rs.getString("nomClient"));
            }


        } catch (SQLException e) {
            Logger.getLogger(EcommerceDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        return client;

    }

    public void addLigneCommande(LigneCommande ligneCommande){
        try (
                Connection connection = dataSource.getConnection();
                PreparedStatement pstmt = connection.prepareStatement
                        ("insert into ligneCommande (Produit_idProduit, quantite, ) values (?,?)")){

            pstmt.setInt(1,ligneCommande.getProduit());
            pstmt.setInt(2,ligneCommande.getQuantite());


//            pstmt.close();
//            connection.close();
        } catch (SQLException e) {
            Logger.getLogger(EcommerceDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }

    }
}
