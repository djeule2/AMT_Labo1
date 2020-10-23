package ch.heig.od.model;
import java.util.Collection;

public class Client {
private Long idClient;
private String nomClient;
private String email;
private String tel;
private Collection<Commande> commandes;

    public Client(){}

    public Client(Long idClient, String nomClient, String email, String tel) {
        this.idClient = idClient;
        this.nomClient = nomClient;
        this.email = email;
        this.tel = tel;
    }



    public Long getIdClient() {
        return idClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public String getEmail() {
        return email;
    }

    public String getTel() {
        return tel;
    }

    public Collection<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(Collection<Commande> commandes) {
        this.commandes = commandes;
    }
    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
