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
public class Salle {
    private int numero;
    private String batiment;

    public Salle(int numero, String batiment) {
        this.numero = numero;
        this.batiment = batiment;
    }

    public int getNumero() {
        return numero;
    }

    public String getBatiment() {
        return batiment;
    }
    
}
