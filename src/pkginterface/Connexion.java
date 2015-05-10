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

/**
 *
 * @author stassi
 */
public class Connexion extends JFrame implements ActionListener {
    
    JButton bouton1= new JButton ("Valider");
    JLabel login= new JLabel ("login");
    JLabel requete= new JLabel ("requete");
    JButton bouton2= new JButton ("Valider");
    GroupLayout groupe = new GroupLayout(getContentPane());
    
    //constructeur
    public Connexion (){
        // pour les GroupLayout
         super("Gestion des groupes");
    //	Donne un titre à l’application 
           setTitle("CONNEXION");
    //Donne une taille à notre fenêtre  
        setSize(200,200);
    //Centre la fenêtre sur l’écran 
        setLocationRelativeTo(null);
    //Donne la possiblité à l’utilisateur de redimensionner la fenêtre 
        setResizable(true);
        //visibilité de l'écran 
        setVisible(true);
    //Ferme l’application lors du clic droit sur la croix 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
   //gestion des GroupLayout     
          getContentPane().setLayout(groupe);
      GroupLayout.SequentialGroup horzGroupe = groupe.createSequentialGroup();     
      GroupLayout.ParallelGroup vertGroupe = groupe.createBaselineGroup(false, false);
      horzGroupe.addGroup(groupe.createParallelGroup().addComponent(login).addComponent(requete));  
      horzGroupe.addGroup(groupe.createParallelGroup().addComponent(bouton1).addComponent(bouton2));  
      vertGroupe.addGroup(groupe.createSequentialGroup().addComponent(login).addComponent(requete));
      vertGroupe.addGroup(groupe.createSequentialGroup().addComponent(bouton1).addComponent(bouton2));
      groupe.setHorizontalGroup(horzGroupe);
      groupe.setVerticalGroup(vertGroupe);      
         
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


