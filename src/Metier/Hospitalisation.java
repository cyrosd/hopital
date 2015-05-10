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
    private int noMalade;
    private int codeService;
    private int noChambre;

    public Hospitalisation(int numlit, int malade, int service, int chambre) {
        this.numlit = numlit;
        this.noMalade = malade;
        this.codeService = service;
        this.noChambre = chambre;
    }

    public int getNumlit() {
        return numlit;
    }

    public int getMalade() {
        return noMalade;
    }

    public int getService() {
        return codeService;
    }

    public int getChambre() {
        return noChambre;
    }

    public void setService(int service) {
        this.codeService = service;
    }

    public void setChambre(int chambre) {
        this.noChambre = chambre;
    }
}
