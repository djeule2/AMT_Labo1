package ch.heig.od.business.dao;

import ch.heig.od.model.*;

import javax.ejb.Local;
import java.util.List;

@Local
public interface EcommerceDao {

    /*PRODUIT*/

    /**
     *
     * @return
     */
   // public Produit getProduit(Long idPro);

    /**
     *
     * @param produit
     *
     */
    //public void addProduit(Produit produit, Long idCat);
    /**
     *
     * @return
     */
  //  public List<Produit> listProduits();

    /**
     *
     * @param idCat
     * @return
     */
   // public List<Produit>listProduitParCategorie(Long idCat);

    /**
     *
     * @param idPro
     */
   // public void suprimeProduit(Long idPro);

    /**
     *
     * @param p
     */
  //  public void modifierProduit(Produit p);

    /**
     *
     * @return
     */
   // public List<Produit> listeProduitSelectionne();

    /*CATEGORIE*/

    /**
     *
     * @return
     */
   // public List<Categorie> listCategories();

    /**
     *
     * @param cat
     * @return
     */
    // public Long addCategorie (Categorie cat);

    /**
     *
     * @param idCat
     * @return
     */
   // public Categorie getCategorie(Long idCat);

    /**
     *
     * @param cat
     */
   // public void modifierCategorie(Categorie cat);

    /*USER*/

    /**
     *
     * @param user
     */
   // public void ajouterUser (User user);

    /**
     *
     * @param user
     * @param role
     */
   // public void affectRole (long userID, Role role);

    /**
     *
     * @param panier
     * @param client
     * @return
     */
   // public Commande enreigistrerCommande(Panier panier, Client client);

}
