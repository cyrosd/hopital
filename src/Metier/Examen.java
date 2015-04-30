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
    private Malade malade;
    private Infirmier infirmier;
    /*private Salle salle;*/

    public Examen(Date date, String type, Malade malade, Infirmier infirmier) {
        this.date = date;
        this.type = type;
        this.malade = malade;
        this.infirmier = infirmier;
    }
}
