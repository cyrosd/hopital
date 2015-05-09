/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_hopital;

import java.util.ArrayList;
import javax.swing.JScrollPane;
import Metier.Hospitalisation;

/**
 *
 * @author Léa
 */
public class TableauHospitalisation extends JScrollPane{
    public TableauHospitalisation() {
        ArrayList<Hospitalisation> tabhospi= new ArrayList<>();
        //REmplissage de la liste
        Object[][] donnee=new Hospitalisation[tabhospi.size()][4];
         for (int i=0; i<tabhospi.size();i++){
             donnee[i][1]=tabhospi.get(i).getNumlit();
             donnee[i][2]=tabhospi.get(i).getMalade();
             donnee[i][3]=tabhospi.get(i).getService();
             donnee[i][4]=tabhospi.get(i).getChambre();  
        }
    }
}
