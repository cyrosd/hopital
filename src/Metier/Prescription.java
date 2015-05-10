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
    private int noMalade;
    private int codeMedicament;
    private int dose;

    public Prescription(int malade, int medicament, int dose) {
        this.noMalade = malade;
        this.codeMedicament = medicament;
        this.dose = dose;
    }

    public int getNoMalade() {
        return noMalade;
    }

    public int getCodeMedicament() {
        return codeMedicament;
    }

    

    public int getDose() {
        return dose;
    }

    public void setDose(int dose) {
        this.dose = dose;
    }
}
