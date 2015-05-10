/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

/**
 *
 * @author cyril_000
 */
public abstract class Personne {
    private String nom;
    private String prenom;
    private int tel;
    private String adresse;
  

    public Personne(String nom, String prenom, int tel, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getTel() {
        return tel;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
}
