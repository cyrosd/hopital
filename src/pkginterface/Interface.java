/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

import  javax.swing.JFrame ;
import  java.awt.*;
import java.awt.event.ActionEvent;
import  javax.swing.JLabel ;
import  javax.swing.JButton ;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
 

public class Interface extends JFrame implements ActionListener {
    //attributs
    Panel_image panel;
    Panel panel2;
    JButton bouton1= new JButton (new Module1("RECHERCHE"));
   // JButton bouton2= new JButton (new Module2("REPORTING"));
    JButton bouton3= new JButton (new Module3("CONNEXION"));
    //JButton bouton4= new JButton (new Module4("MISE A JOUR "));
    JLabel label = new JLabel("CENTRE HOSPITALIER");
    
    //constructeur
    public Interface (){
    //	Donne un titre à l’application 
            setTitle("Interface Graphique");
    //Donne une taille à notre fenêtre  
        setSize(400,200);
    //Centre la fenêtre sur l’écran 
        setLocationRelativeTo(null);
    //Donne la possiblité à l’utilisateur de redimensionner la fenêtre 
        setResizable(true);
    //Ferme l’application lors du clic droit sur la croix 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       //visibilité de la fenêtre
        setVisible(true);
        
    // Instancie l’objet avec le constructeur JPanel()
        panel = new Panel_image("url.jpg");
        panel2= new Panel();
        
    //Donne une mise en page 
        panel.setLayout(new BorderLayout()) ;
         bouton1. setBackground(Color.white);
         bouton3. setBackground(Color.white); 
    //Donne une couleur de fond  
        
        getContentPane().add(panel);
        
        // mise en page du JLabel
        //label.setPreferredSize(new Dimension(50,50));
          //label.setHorizontalAlignment(JLabel.CENTER);  
       
           
//Ajout des objets composant au conteneur JPanel 
      //add(label,BorderLayout.NORTH);
      panel.add(bouton1, BorderLayout.NORTH);  panel.add(bouton3,BorderLayout.SOUTH);//panel.add(bouton4);
   //panel.add(bouton2);
    //mise en page des boutons
    
   
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}


