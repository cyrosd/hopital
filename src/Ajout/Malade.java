/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ajout;

/**
 *
 * @author Léa
 */
public class Malade {
    public void actionPerformed(ActionEvent e)
    {
        String mutuelleUser = fenetre.getTextField().getText();
        String nomeUser = fenetre.getTextField().getText();
        String prenomUser = fenetre.getTextField().getText();
        String adresseUser = fenetre.getTextField().getText();
        String telUserString = fenetre.getTextField().getText();
        int telUser = Integer.parseInt(telUserString);
        
        //tab = tableau de Malade
        taab.addElement(Malade(mutuelleUser,nomUser,prenomUser,telUser,adresseUser));
    }
}
