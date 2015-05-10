/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author stassi
 */
public class Connexion1 extends JFrame implements ActionListener {
    Panel panel;
    Panel pan;
    JButton bouton1= new JButton ("Valider");
    JLabel login= new JLabel ("login");
    JLabel requete= new JLabel ("requete");
    JButton bouton2= new JButton ("Valider");
    JTextField zone1 = new JTextField("entrez votre identifiant");
    JTextField zone2 = new JTextField ("entrez votre requête");
    
    
    //constructeur
    public Connexion1 (){
        
    //	Donne un titre à l’application 
           setTitle("CONNEXION");
    //Donne une taille à notre fenêtre  
        setSize(250,150);
    //Centre la fenêtre sur l’écran 
        setLocationRelativeTo(null);
    //Donne la possiblité à l’utilisateur de redimensionner la fenêtre 
        setResizable(false);
        //visibilité de l'écran 
        setVisible(true);
    //Ferme l’application lors du clic droit sur la croix 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // mise en page
        
        setLayout(new FlowLayout());
        
  add(login); add(zone1); add(bouton1);
  add(requete); add(zone2); add(bouton2);
          
         
     // ecoute des boutons
        bouton1.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent e) {
            
         
    }
        }
        );
        
        bouton2.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent e) {
            
         
    }
        }
        );
        
        
       
           
//Ajout des objets composant au conteneur JPanel 
     

   
    
    

    
    
    
}

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}


