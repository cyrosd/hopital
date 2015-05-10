/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ajout;
import Metier.Salle;

/**
 *
 * @author Léa
 */
public class Salle2 {
    public void actionPerformed(ActionEvent e)
    {
        String batimentUser = fenetre.getTextField().getText();
        String numeroUserString = fenetre.getTextField().getText();
        int numeroUser = Integer.parseInt(numeroUserString);
        
        Salle sal = new Salle(numeroUser,batimentUser);
        creer(sal);
    }
}
