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
public class Docteur extends Employe{

    private String specialite;
    public Docteur(String specialite, int numero, String nom, String prenom, int tel, String adresse) {
        super(numero, nom, prenom, tel, adresse);
        this.specialite = specialite;
    }
}
