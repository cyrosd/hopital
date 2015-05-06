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
public class Medicament {
    private String nom;
    private String type;
    private int consoMax;
    private int stock;

    public Medicament(String nom, String type, int consoMax, int stock) {
        this.nom = nom;
        this.type = type;
        this.consoMax = consoMax;
        this.stock = stock;
    }

    public String getNom() {
        return nom;
    }

    public String getType() {
        return type;
    }

    public int getConsoMax() {
        return consoMax;
    }

    public int getStock() {
        return stock;
    }
    
}
