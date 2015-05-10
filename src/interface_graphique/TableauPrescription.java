/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_graphique;

import java.util.ArrayList;
import javax.swing.JScrollPane;
import Metier.Prescription;
/**
 *
 * @author Léa
 */
public class TableauPrescription extends JScrollPane{
    private ArrayList<Prescription> tabpres= new ArrayList<>();
    public TableauPrescription() {
        //REmplissage de la liste
        Object[][] donnee=new Prescription[tabpres.size()][3];
         for (int i=0; i<tabpres.size();i++){
             donnee[i][1]=tabpres.get(i).getMalade();
             donnee[i][2]=tabpres.get(i).getMedicament();
             donnee[i][3]=tabpres.get(i).getDose(); 
        }
    }
    public ArrayList<Prescription> getTabpres()
    {
        return(tabpres);
    }
}
