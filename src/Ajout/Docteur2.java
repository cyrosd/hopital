/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ajout;
import Metier.Docteur;

/**
 *
 * @author Léa
 */
public class Docteur2 {
     public void actionPerformed(ActionEvent e)
     {
        String specialiteUser = fenetre.getTextField().getText();
        String nomUser = fenetre.getTextField().getText();
        String prenomUser = fenetre.getTextField().getText();
        String adresseUser = fenetre.getTextField().getText();
        String numeroUserString = fenetre.getTextField().getText();
        int numeroUser = Integer.parseInt(numeroUserString);
        String telUserString = fenetre.getTextField().getText();
        int telUser = Integer.parseInt(telUserString);
           
        Docteur2 doc = new Docteur(specialiteUser,numeroUser,nomUser,prenomUser,telUser,adresseUser);
        creer(doc);
     }
}
