/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projet_hopital;

import  javax.swing.JFrame ;
import  java.awt.*;
import java.awt.event.ActionEvent;
import  javax.swing.JLabel ;
import  javax.swing.JButton ;
import java.awt.event.ActionListener;
 

public class Interface extends JFrame implements ActionListener {
    //attributs
    Panel panel;
    Panel panel2;
    JButton bouton1= new JButton (new Module1("RECHERCHE"));
    JButton bouton2= new JButton (new Module2("REPORTING"));
    JButton bouton3= new JButton (new Module3("CONNEXION"));
    JButton bouton4= new JButton (new Module4("MISE A JOUR "));
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
        panel = new Panel();
        panel2= new Panel();
        
    //Donne une mise en page 
        panel.setLayout(new GridLayout(3,2,8,8)) ;
         
    //Donne une couleur de fond  
        panel.setBackground(Color.white);
        getContentPane().add(panel);
         
        // mise en page du JLabel
        label.setPreferredSize(new Dimension(225,26));
          label.setHorizontalAlignment(JLabel.CENTER);  
       
           
//Ajout des objets composant au conteneur JPanel 
    add(label,BorderLayout.NORTH); panel.add(bouton1); panel.add(bouton2); panel.add(bouton3);panel.add(bouton4);
    //mise en page des boutons
    
   
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}