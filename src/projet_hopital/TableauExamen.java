/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_hopital;

import java.util.ArrayList;
import javax.swing.JScrollPane;
import Metier.Examen;

/**
 *
 * @author Léa
 */
public class TableauExamen extends JScrollPane{
    public TableauExamen() {
        ArrayList<Examen> tabexam= new ArrayList<>();
        //REmplissage de la liste
        Object[][] donnee=new Examen[tabexam.size()][5];
         for (int i=0; i<tabexam.size();i++){
             donnee[i][1]=tabexam.get(i).getDate();
             donnee[i][2]=tabexam.get(i).getType();
             donnee[i][3]=tabexam.get(i).getMalade();
             donnee[i][4]=tabexam.get(i).getInfirmier(); 
        }
    }
}
