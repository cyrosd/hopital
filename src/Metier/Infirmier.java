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
public class Infirmier extends Employe {
    private int noService;
    private String rotation;
    private double salaire;

    public Infirmier(int service, String rotation, double salaire, int numero, String nom, String prenom, int tel, String adresse) {
        super(numero, nom, prenom, tel, adresse);
        this.noService = service;
        this.rotation = rotation;
        this.salaire = salaire;
    }

    public int getService() {
        return noService;
    }

    public String getRotation() {
        return rotation;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setService(int service) {
        this.noService = service;
    }

    public void setRotation(String rotation) {
        this.rotation = rotation;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
}
