/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_hopital;

import Metier.Service;
import java.util.ArrayList;
import javax.swing.JScrollPane;

/**
 *
 * @author Léa
 */
public class TableauService extends JScrollPane{
    public TableauService() {
        ArrayList<Service> tabserv= new ArrayList<>();
        //REmplissage de la liste
        Object[][] donnee=new Service[tabserv.size()][3];
         for (int i=0; i<tabserv.size();i++){
             donnee[i][0]=tabserv.get(i).getNom();
             donnee[i][1]=tabserv.get(i).getBatiment();
             donnee[i][2]=tabserv.get(i).getDirecteur();
        }
    }
}
