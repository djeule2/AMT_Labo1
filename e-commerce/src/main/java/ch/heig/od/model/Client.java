package ch.heig.od.model;
import java.util.Collection;

public class Client {
private int idClient;
private String nomClient;
private String email;
private String tel;
private String userName;
private String passwrd;
private Collection<Commande> commandes;

    public Client(){}

    public Client( String nomClient, String email, String tel, String userName, String passwrd) {
        this.userName = userName;
        this.passwrd = passwrd;
        this.nomClient = nomClient;
        this.email = email;
        this.tel = tel;

    }



    public int getIdClient() {
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

    public String getUserName() {
        return userName;
    }

    public String getPasswrd() {
        return passwrd;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPasswrd(String passwrd) {
        this.passwrd = passwrd;
    }

    public void setCommandes(Collection<Commande> commandes) {
        this.commandes = commandes;
    }
    public void setIdClient(int idClient) {
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
