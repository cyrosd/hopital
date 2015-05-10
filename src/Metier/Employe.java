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
public abstract class Employe extends Personne{
    private int numero;

    public Employe(int numero, String nom, String prenom, int tel, String adresse) {
        super(nom, prenom, tel, adresse);
        this.numero = numero;
    }
    
     public int getNumero() {
        return numero;
    }
}
