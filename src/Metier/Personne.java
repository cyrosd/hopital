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
public class Personne {
    private String nom;
    private String prenom;
    private int tel;
    private String adresse;
    //TODO constructeurs

    public Personne(String nom, String prenom, int tel, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.adresse = adresse;
    }
}
