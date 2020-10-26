package ch.heig.od.business.dao;

import ch.heig.od.model.Categorie;
import ch.heig.od.model.Client;
import ch.heig.od.model.Produit;
import ch.heig.od.model.User;

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
             PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM produit where produit.Categorie_idCategorie = value (?)");){
            pstmt.setInt(1, idCat);

//            Connection connection = dataSource.getConnection();
//            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM contacts");
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
//            pstmt.close();
//            connection.close();
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
//            Connection connection = dataSource.getConnection();
//            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM contacts");
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
                        ("insert into produit (nomProduit, prixProduit,  description, quantite, photos, couleur, taille,  idCategorie) values (?,?, ?,?,?,?,?,?)")){

            pstmt.setString(1,produit.getNomProduit());
            pstmt.setDouble(2,produit.getPrix());
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
                        ("insert into client (nomClient, email, tel, userName, passwrd) values (?,?, ?,?,?)")){
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



}
