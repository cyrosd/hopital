/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author stassi
 */
public class Recherche extends JFrame implements ActionListener {
    Panel_image panel;
    JButton bouton1= new JButton ("MEDECIN");
    JButton bouton2= new JButton ("CHAMBRE");
    JButton bouton3= new JButton ("EXAMEN");
    JButton bouton4= new JButton ("HOSPITALISATION ");
    JButton bouton5= new JButton ("INFIRMIER");
    JButton bouton6= new JButton ("MEDICAMENT");
    JButton bouton7= new JButton ("PRESCRIPTION");
    JButton bouton8= new JButton ("SALLE ");
    JButton bouton9= new JButton ("SERVICE");
    JButton bouton10= new JButton ("SOIGNE");
    JButton bouton11= new JButton ("MALADE");
    
    //constructeur
    public Recherche (){
    //	Donne un titre à l’application 
           setTitle("RECHERCHE");
    //Donne une taille à notre fenêtre  
        setSize(500,500);
    //Centre la fenêtre sur l’écran 
        setLocationRelativeTo(null);
    //Donne la possiblité à l’utilisateur de redimensionner la fenêtre 
        setResizable(true);
        //visibilité de l'écran 
        setVisible(true);
    //Ferme l’application lors du clic droit sur la croix 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    // Instancie l’objet avec le constructeur JPanel()
        panel = new Panel_image("recherche.jpg");
              
    //Donne une mise en page 
        panel.setLayout(new FlowLayout()) ;
         
    //Donne une couleur de fond  
       
        getContentPane().add(panel);
         
     // ecoute des boutons
        bouton1.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent e) {
            JFrame fen =new Medecin();
         
    }
        }
        );
        
        bouton2.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent e) {
           JFrame fen1= new Chambre(); 
          
    }
        }
        );
        
        bouton3.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent e) {
         JFrame fen2= new Examen(); 
    }
        }
        );
        
        bouton4.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent e) {
         JFrame fen3= new Hospitalisation(); 
    }
        }
        );
        
        
        bouton5.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent e) {
         JFrame fen4= new Infirmier(); 
    }
        }
        );
        
        bouton6.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent e) {
         JFrame fen5= new Medicament(); 
    }
        }
        );
        
        bouton7.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent e) {
         JFrame fen6= new Prescription(); 
    }
        }
        );
        
        bouton8.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent e) {
         JFrame fen7= new Salle(); 
    }
        }
        );
        
        bouton9.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent e) {
         JFrame fen8= new Service(); 
    }
        }
        );
        
        bouton10.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent e) {
         JFrame fen9= new Soigne(); 
    }
        }
        );
        
        bouton11.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent e) {
         JFrame fen10= new Malade(); 
    }
        }
        );
           
//Ajout des objets composant au conteneur JPanel 
     panel.add(bouton1); panel.add(bouton2); panel.add(bouton3);panel.add(bouton4);panel.add(bouton5);panel.add(bouton6);panel.add(bouton7);panel.add(bouton8);
     panel.add(bouton9);panel.add(bouton10);panel.add(bouton11);
    
    
     
     
   
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    

    
    
    
}
