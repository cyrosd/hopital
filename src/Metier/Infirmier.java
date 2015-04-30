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
    private Service service;
    private String rotation;
    private double salaire;

    public Infirmier(Service service, String rotation, double salaire, int numero, String nom, String prenom, int tel, String adresse) {
        super(numero, nom, prenom, tel, adresse);
        this.service = service;
        this.rotation = rotation;
        this.salaire = salaire;
    }
}
