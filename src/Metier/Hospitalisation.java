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
}
