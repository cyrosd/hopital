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
public class Prescription {
    private Malade malade;
    private Medicament medicament;
    private int dose;

    public Prescription(Malade malade, Medicament medicament, int dose) {
        this.malade = malade;
        this.medicament = medicament;
        this.dose = dose;
    }

    public Malade getMalade() {
        return malade;
    }

    public Medicament getMedicament() {
        return medicament;
    }

    public int getDose() {
        return dose;
    }
}
