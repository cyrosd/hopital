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
public class Malade extends Personne{
    private String mutuelle;

    public Malade(String mutuelle, String nom, String prenom, int tel, String adresse) {
        super(nom, prenom, tel, adresse);
        this.mutuelle = mutuelle;
    }
}
