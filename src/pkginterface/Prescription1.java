/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;

/**
 *
 * @author stassi
 */
public class Prescription1 extends JFrame implements ActionListener {
    Panel panel;
    Panel pan;   
    Object[] elements =new Object[]{"Element1","Element2","Element3","Element4","Element5"};
    JComboBox liste = new JComboBox (elements);
    JTextField zone1= new JTextField ("entrez votre recherche:");
    JButton bouton = new JButton ("Valider");
      
    //constructeur
    public Prescription1 (){
    //	Donne un titre à l’application 
           setTitle("PRESCRIPTION");
    //Donne une taille à notre fenêtre  
        setSize(550,520);
    //Centre la fenêtre sur l’écran 
        setLocationRelativeTo(null);
    //Donne la possiblité à l’utilisateur de redimensionner la fenêtre 
        setResizable(false);
        //visibilité de l'écran 
        setVisible(true);
    //Ferme l’application lors du clic droit sur la croix 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    // Instancie l’objet avec le constructeur JPanel()
        panel = new Panel();
        pan = new Panel();
         zone1.setColumns(15);     
    //Donne une mise en page 
        panel.setBackground(Color.white);
       zone1.setHorizontalAlignment(JTextField.CENTER);
       bouton.setHorizontalAlignment(JButton.RIGHT);
       
       
    //Donne une couleur de fond  
        
        
        pan.setPreferredSize(new Dimension(400,400));
        getContentPane().add(panel);
        
        
     // ecoute des boutons
        zone1.addActionListener(this);
        liste.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
            
         // switch case
    }
        
        
        
        }
        
        );
       
        bouton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
            
         
    }
        
        
        
        }
        
        );
       
           
//Ajout des objets composant au conteneur JPanel 
     panel.add(pan);panel.add(liste);panel.add(zone1,BorderLayout.EAST); panel.add(bouton); panel.add(liste);
    //mise en page des boutons
    
   
    }

    
    public void actionPerformed(ActionEvent e) {
        zone1.getText();
    }
    
}
