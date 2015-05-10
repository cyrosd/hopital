/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_graphique;

import java.util.ArrayList;
import javax.swing.JScrollPane;
import Metier.Medicament;
/**
 *
 * @author Léa
 */
public class TableauMedicament extends JScrollPane{
    private ArrayList<Medicament> tabmedoc= new ArrayList<>();
    public TableauMedicament() {
        //REmplissage de la liste
        Object[][] donnee=new Medicament[tabmedoc.size()][4];
         for (int i=0; i<tabmedoc.size();i++){
             donnee[i][0]=tabmedoc.get(i).getNom();
             donnee[i][1]=tabmedoc.get(i).getType();
             donnee[i][2]=tabmedoc.get(i).getConsoMax();
             donnee[i][3]=tabmedoc.get(i).getStock(); 
        }
    }
    public ArrayList<Medicament> getTabmedoc()
    {
        return(tabmedoc);
    }
}
