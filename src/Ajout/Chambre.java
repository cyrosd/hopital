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
public class Chambre {
    public void actionPerformed(ActionEvent e)
    {
        String surveillantUser = fenetre.getTextField().getText();
        String serviceUser = fenetre.getTextField().getText();
        String nblitsUserString = fenetre.getTextField().getText();
        int nblitsUser = Integer.parseInt(nblitsUserString);
        
        Chambre Cham = new Chambre(surveillantUser,nblitsUser,serviceUser);
        creer(Cham);
    }
}
