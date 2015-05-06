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
public class Chambre /*extends Salle*/ {
    
    private Infirmier Surveillant;
    private int nbLit;
    private Service service;

    public Chambre(Infirmier Surveillant, int nbLit, Service service) {
        this.Surveillant = Surveillant;
        this.nbLit = nbLit;
        this.service = service;
    }

    public Infirmier getSurveillant() {
        return Surveillant;
    }

    public int getNbLit() {
        return nbLit;
    }

    public Service getService() {
        return service;
    }
}
