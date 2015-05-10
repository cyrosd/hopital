/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

import javax.swing.*;
import java.awt.event.ActionEvent;


/**
 *
 * @author stéphanie
 */
public class Module1 extends AbstractAction { 
   
//Un constructeur 
public Module1( String nom_item){  
super(nom_item);
}

//La méthode actionPerformed : 
public void actionPerformed(ActionEvent e){
          //dans cette méthode sera mise toutes les actions précises du module1
     JFrame fen1= new Recherche1();
     
} 
}
