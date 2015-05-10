/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_graphique;

import Metier.Soigne;
import java.util.ArrayList;
import javax.swing.JScrollPane;

/**
 *
 * @author Léa
 */
public class TableauSoigne extends JScrollPane{
    public TableauSoigne() {
        ArrayList<Soigne> tabsoig= new ArrayList<>();
        //REmplissage de la liste
        Object[][] donnee=new Soigne[tabsoig.size()][4];
         for (int i=0; i<tabsoig.size();i++){
             donnee[i][0]=tabsoig.get(i).getDocteur();
             donnee[i][1]=tabsoig.get(i).getMalade();
             donnee[i][2]=tabsoig.get(i).getDate();
             donnee[i][3]=tabsoig.get(i).getSalle(); 
        }
    }
}
