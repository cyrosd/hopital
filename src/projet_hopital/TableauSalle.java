/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_hopital;

import Metier.Salle;
import java.util.ArrayList;
import javax.swing.JScrollPane;

/**
 *
 * @author Léa
 */
public class TableauSalle extends JScrollPane{
    public TableauSalle() {
        ArrayList<Salle> tabsalle= new ArrayList<>();
        //REmplissage de la liste
        Object[][] donnee=new Salle[tabsalle.size()][2];
         for (int i=0; i<tabsalle.size();i++){
             donnee[i][0]=tabsalle.get(i).getNumero();
             donnee[i][1]=tabsalle.get(i).getBatiment();
 
        }
    }
}
