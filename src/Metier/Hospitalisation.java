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
public class Hospitalisation {
    private int numlit;
    private Malade malade;
    private Service service;
    private Chambre chambre;

    public Hospitalisation(int numlit, Malade malade, Service service, Chambre chambre) {
        this.numlit = numlit;
        this.malade = malade;
        this.service = service;
        this.chambre = chambre;
    }

    public int getNumlit() {
        return numlit;
    }

    public Malade getMalade() {
        return malade;
    }

    public Service getService() {
        return service;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }
}
