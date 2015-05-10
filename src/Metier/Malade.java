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
    private int noMalade;

    public Malade(String mutuelle,int noMalade, String nom, String prenom, int tel, String adresse) {
        super(nom, prenom, tel, adresse);
        this.mutuelle = mutuelle;
        this.noMalade=noMalade;
    }

    public String getMutuelle() {
        return mutuelle;
    }

    public int getNoMalade() {
        return noMalade;
    }
    

    public void setMutuelle(String mutuelle) {
        this.mutuelle = mutuelle;
    }
    
}
