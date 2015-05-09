/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_hopital;

import java.util.ArrayList;
import javax.swing.JScrollPane;
import Metier.Infirmier;
/**
 *
 * @author Léa
 */
public class TableauInfirmier extends JScrollPane{
    public TableauInfirmier() {
        ArrayList<Infirmier> tabinfirm= new ArrayList<>();
        //REmplissage de la liste
        Object[][] donnee=new Infirmier[tabinfirm.size()][7];
         for (int i=0; i<tabinfirm.size();i++){
             donnee[i][1]=tabinfirm.get(i).getService();
             donnee[i][2]=tabinfirm.get(i).getRotation();
             donnee[i][3]=tabinfirm.get(i).getSalaire();
             donnee[i][4]=tabinfirm.get(i).getNumero(); 
             donnee[i][5]=tabinfirm.get(i).getNom(); 
             donnee[i][6]=tabinfirm.get(i).getPrenom(); 
             donnee[i][7]=tabinfirm.get(i).getAdresse(); 
        }
    }
}