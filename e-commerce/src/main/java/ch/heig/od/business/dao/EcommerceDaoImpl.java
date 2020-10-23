package ch.heig.od.business.dao;

import ch.heig.od.model.Categorie;
import ch.heig.od.model.Produit;

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
                produit.setPrix(rs.getInt("prixProduit"));
                produit.setDescription(rs.getString("description"));
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
                        ("insert into produit (idProduit ,prixProduit, nomProduit, description, categorie) values (?,?, ?,?,?)")){
           // pstmt.setString(1, produit.getIdProduit());
            pstmt.setDouble(2,produit.getPrix());
            pstmt.setString(3,produit.getNomProduit());
            pstmt.setString(4, produit.getDescription());
           // pstmt.setString(5, produit.getCategorie());
            pstmt.executeUpdate();
//            pstmt.close();
//            connection.close();
        } catch (SQLException e) {
            Logger.getLogger(EcommerceDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
