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
public class Chambre extends Salle {
    
    private int numSurveillant;
    private int nbLit;
    private int numService;

    public Chambre(int numero, String batiment, int surveillant, int nbLit, int service) {
        super(numero, batiment);
        this.numSurveillant = surveillant;
        this.nbLit = nbLit;
        this.numService = service;
    }

    public void setSurveillant(int surveillant) {
        this.numSurveillant = surveillant;
    }

    public void setService(int service) {
        this.numService = service;
    }

    public int getSurveillant() {
        return numSurveillant;
    }

    public int getNbLit() {
        return nbLit;
    }

    public int getService() {
        return numService;
    }
    
}
