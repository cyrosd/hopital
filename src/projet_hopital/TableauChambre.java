/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_hopital;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import Metier.Chambre;

/**
 *
 * @author Léa
 */
public class TableauChambre extends JScrollPane {
    public TableauChambre() {
        ArrayList<Chambre> tabcha= new ArrayList<>();
        //REmplissage de la liste
        Object[][] donnee=new Chambre[tabcha.size()][5];
         for (int i=0; i<tabcha.size();i++){
             donnee[i][1]=tabcha.get(i).getNumero();
             donnee[i][2]=tabcha.get(i).getBatiment();
             donnee[i][3]=tabcha.get(i).getSurveillant();
             donnee[i][4]=tabcha.get(i).getNbLit();
             donnee[i][5]=tabcha.get(i).getService();   
        }
    }
}
