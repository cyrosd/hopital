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
public class Salle {
    public void actionPerformed(ActionEvent e)
    {
        String batimentUser = fenetre.getTextField().getText();
        String numeroUserString = fenetre.getTextField().getText();
        int numeroUser = Integer.parseInt(numeroUserString);
        
        //tab = tableau de Salle
        tab.addElement(Salle(numeroUser,batimentUser));
    }
}
