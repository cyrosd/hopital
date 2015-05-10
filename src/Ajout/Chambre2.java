/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ajout;
import Metier.Chambre;

/**
 *
 * @author Léa
 */
public class Chambre2 {
    public void actionPerformed(ActionEvent e)
    {
        String numUserString = fenetre.getTextField().getText();
        int numUser = Integer.parseInt(numUserString);
        String surveillantUserString = fenetre.getTextField().getText();
        int surveillantUser = Integer.parseInt(surveillantUserString);
        String batimentUser = fenetre.getTextField().getText();
        String serviceUserString = fenetre.getTextField().getText();
        int serviceUser = Integer.parseInt(serviceUserString);
        String nblitsUserString = fenetre.getTextField().getText();
        int nblitsUser = Integer.parseInt(nblitsUserString);
        
        Chambre Cham =new Chambre(numUser,batimentUser,surveillantUser,nblitsUser,serviceUser);
        creer(Cham);
    }
}
