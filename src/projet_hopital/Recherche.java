/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projet_hopital;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author stassi
 */
public class Recherche extends JFrame implements ActionListener {
    Panel panel;
    JButton bouton1= new JButton (new Module1("MEDECIN"));
    JButton bouton2= new JButton (new Module2("CHAMBRE"));
    JButton bouton3= new JButton (new Module3("EXAMEN"));
    JButton bouton4= new JButton (new Module4("HOSPITALISATION "));
    JButton bouton5= new JButton (new Module1("INFIRMIER"));
    JButton bouton6= new JButton (new Module2("MEDICAMENT"));
    JButton bouton7= new JButton (new Module3("PRESCRIPTION"));
    JButton bouton8= new JButton (new Module4("SALLE "));
    JButton bouton9= new JButton (new Module1("SERVICE"));
    JButton bouton10= new JButton (new Module2("SOIGNE"));
    JButton bouton11= new JButton (new Module3("MALADE"));
    
    //constructeur
    public Recherche (){
    //	Donne un titre à l’application 
           setTitle("RECHERCHE");
    //Donne une taille à notre fenêtre  
        setSize(400,200);
    //Centre la fenêtre sur l’écran 
        setLocationRelativeTo(null);
    //Donne la possiblité à l’utilisateur de redimensionner la fenêtre 
        setResizable(true);
        //visibilité de l'écran 
        setVisible(true);
    //Ferme l’application lors du clic droit sur la croix 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    // Instancie l’objet avec le constructeur JPanel()
        panel = new Panel();
              
    //Donne une mise en page 
        panel.setLayout(new GridLayout(4,4,2,2)) ;
         
    //Donne une couleur de fond  
        panel.setBackground(Color.white);
        getContentPane().add(panel);
         
     // ecoute des boutons
        bouton1.addActionListener(this);
        bouton2.addActionListener(this);
        bouton3.addActionListener(this);
        bouton4.addActionListener(this);
        bouton5.addActionListener(this);
        bouton6.addActionListener(this);
        bouton7.addActionListener(this);
        bouton8.addActionListener(this);
        bouton9.addActionListener(this);
        bouton10.addActionListener(this);
        bouton11.addActionListener(this);
           
//Ajout des objets composant au conteneur JPanel 
     panel.add(bouton1); panel.add(bouton2); panel.add(bouton3);panel.add(bouton4);panel.add(bouton5);panel.add(bouton6);panel.add(bouton7);panel.add(bouton8);
     panel.add(bouton9);panel.add(bouton10);panel.add(bouton11);
    //mise en page des boutons
    
   
    }

    
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
