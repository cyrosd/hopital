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
    Docteur docteur;
    Malade malade;
    Date date;
    Salle salle;
    public Soigne(Docteur docteur, Malade malade, Date date, Salle salle) {
        this.docteur = docteur;
        this.malade = malade;
        this.date = date;
        this.salle = salle;
    }

    public Docteur getDocteur() {
        return docteur;
    }

    public Malade getMalade() {
        return malade;
    }

    public Date getDate() {
        return date;
    }

    public Salle getSalle() {
        return salle;
    }
   
}
