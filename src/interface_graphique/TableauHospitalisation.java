/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_graphique;

import java.util.ArrayList;
import javax.swing.JScrollPane;
import Metier.Hospitalisation;

/**
 *
 * @author Léa
 */
public class TableauHospitalisation extends JScrollPane{
    private ArrayList<Hospitalisation> tabhospi= new ArrayList<>();
    public TableauHospitalisation() {
        //REmplissage de la liste
        Object[][] donnee=new Hospitalisation[tabhospi.size()][4];
         for (int i=0; i<tabhospi.size();i++){
             donnee[i][0]=tabhospi.get(i).getNumlit();
             donnee[i][1]=tabhospi.get(i).getMalade();
             donnee[i][2]=tabhospi.get(i).getService();
             donnee[i][3]=tabhospi.get(i).getChambre();  
        }
    }
    public ArrayList<Hospitalisation> getTabhospi()
    {
        return(tabhospi);
    }
}
