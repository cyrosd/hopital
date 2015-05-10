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
public class Examen {
    private Date date;
    private String type;
    private int noMalade;
    private int noInfirmier;
    /*private Salle salle;*/

    public Examen(Date date, String type, int malade, int infirmier) {
        this.date = date;
        this.type = type;
        this.noMalade = malade;
        this.noInfirmier = infirmier;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public int getMalade() {
        return noMalade;
    }

    public int getInfirmier() {
        return noInfirmier;
    }
}
