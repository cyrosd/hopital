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
public class Service {
    private int code;
    private String nom;
    private String batiment;
    private Docteur directeur;

    public Service(int code, String nom, String batiment, Docteur directeur) {
        this.nom = nom;
        this.batiment = batiment;
        this.directeur = directeur;
    }

    public int getCode() {
        return code;
    }

    public String getNom() {
        return nom;
    }

    public String getBatiment() {
        return batiment;
    }

    public Docteur getDirecteur() {
        return directeur;
    }

    public void setDirecteur(Docteur directeur) {
        this.directeur = directeur;
    }
    
}
