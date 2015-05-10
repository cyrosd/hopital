/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_hopital;

import Metier.Malade;
import java.util.ArrayList;
import javax.swing.JScrollPane;

/**
 *
 * @author Léa
 */
public class TableauMalade extends JScrollPane{
    public TableauMalade() {
        ArrayList<Malade> tabmal= new ArrayList<>();
        //REmplissage de la liste
        Object[][] donnee=new Malade[tabmal.size()][5];
         for (int i=0; i<tabmal.size();i++){
             donnee[i][0]=tabmal.get(i).getMutuelle();
             donnee[i][1]=tabmal.get(i).getNom();
             donnee[i][2]=tabmal.get(i).getPrenom();
             donnee[i][3]=tabmal.get(i).getTel();
             donnee[i][4]=tabmal.get(i).getAdresse();
        }
    }
}
