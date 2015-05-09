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
        String nomUser = fenetre.getTextField().getText();
        String prenomUser = fenetre.getTextField().getText();
        String adresseUser = fenetre.getTextField().getText();
        String telUserString = fenetre.getTextField().getText();
        int telUser = Integer.parseInt(telUserString);
        
        Malade mal = new Malade(mutuelleUser,nomUser,prenomUser,telUser,adresseUser);
        creer(mal);
    }
}
