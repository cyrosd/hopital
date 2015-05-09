/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_hopital;

import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import Metier.Docteur;

/**
 *
 * @author cyril_000
 */
public class TableauMedecin extends JScrollPane {

    public TableauMedecin() {
        ArrayList<Docteur> tabmed= new ArrayList<Docteur>();
    // création de liste ;
    // création de liste 
        JTable med= new JTable(tabmed.size,5);
    for (int i=0; i<tabmed.size();i++){
        
        med.editCellAt(i,1,tabmed.get(i).getNom());
        med.add(tabmed.get(i).getPrenom());
        med.add(tabmed.get(i).getAdresse());
        med.add(tabmed.get(i).getSpecialite();
        
    }
    

}
