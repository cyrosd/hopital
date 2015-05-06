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
    
    private Infirmier surveillant;
    private int nbLit;
    private Service service;

    public Chambre(int numero, String batiment, Infirmier surveillant, int nbLit, Service service) {
        super(numero, batiment);
        this.surveillant = surveillant;
        this.nbLit = nbLit;
        this.service = service;
    }

    public void setSurveillant(Infirmier surveillant) {
        this.surveillant = surveillant;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Infirmier getSurveillant() {
        return surveillant;
    }

    public int getNbLit() {
        return nbLit;
    }

    public Service getService() {
        return service;
    }
    
}
