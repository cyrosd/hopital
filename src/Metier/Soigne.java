/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import java.sql.Date;

/**
 *
 * @author cyril_000
 */
public class Soigne {
    int noDocteur;
    int noMalade;
    Date date;
    int noSalle;
    public Soigne(int docteur, int malade, Date date, int salle) {
        this.noDocteur = docteur;
        this.noMalade = malade;
        this.date = date;
        this.noSalle = salle;
    }

    public int getNoDocteur() {
        return noDocteur;
    }

    public int getNoMalade() {
        return noMalade;
    }

    public int getNoSalle() {
        return noSalle;
    }

   

    public Date getDate() {
        return date;
    }


    public void setSalle(int salle) {
        this.noSalle = salle;
    }
   
}
