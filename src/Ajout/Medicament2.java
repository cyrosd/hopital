/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ajout;
import Metier.Medicament;

/**
 *
 * @author Léa
 */
public class Medicament2 {
    public void actionPerformed(ActionEvent e)
    {
        String nomUser = fenetre.getTextField().getText();
        String typeUser = fenetre.getTextField().getText();
        String consoMaxUserString = fenetre.getTextField().getText();
        int consoMaxUser = Integer.parseInt(consoMaxUserString);
        String stockUserString = fenetre.getTextField().getText();
        int stockUser = Integer.parseInt(stockUserString);
        
        Medicament medoc = new Medicament(nomUser,typeUser,consoMaxUser,stockUser);
        creer(medoc);
    }
}
