/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recherche;

/**
 *
 * @author Léa
 */
public class Consulter {
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == bouton1)
        {
            new Medecin;
            panel2 = new TableauMedecin;
        }
    }
}
