/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_graphique;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/**
 *
 * @author stassi
 */
public class Infirmier extends JFrame implements ActionListener {
    Panel_image panel;
    Panel pan;   
    Object[] elements =new Object[]{"Element1","Element2","Element3","Element4","Element5"};
    JComboBox liste = new JComboBox (elements);
    JTextField zone1= new JTextField ("entrez votre recherche:");
    JButton bouton = new JButton ("Valider");
      
    //constructeur
    public Infirmier (){
    //	Donne un titre à l’application 
           setTitle("INFIRMIER");
    //Donne une taille à notre fenêtre  
        setSize(600,300);
    //Centre la fenêtre sur l’écran 
        setLocationRelativeTo(null);
    //Donne la possiblité à l’utilisateur de redimensionner la fenêtre 
        setResizable(true);
        //visibilité de l'écran 
        setVisible(true);
    //Ferme l’application lors du clic droit sur la croix 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    // Instancie l’objet avec le constructeur JPanel()
        panel = new Panel_image("c:\\Users\\stéphanie\\Documents\\dossier Assi stéphanie\\index.jpg");
        pan = new Panel();
         zone1.setColumns(15);     
    //Donne une mise en page 
        
       zone1.setHorizontalAlignment(JTextField.CENTER);
       bouton.setHorizontalAlignment(JButton.RIGHT);
       
       
    //Donne une couleur de fond  
        
        
        pan.setPreferredSize(new Dimension(400,400));
        getContentPane().add(panel);
        
        //Affichage TableauInfirmier
        TableauInfirmier tab = new TableauInfirmier();
        JTable tableau = new JTable((TableModel) tab);
        JScrollPane jScrollPane1 = new JScrollPane(tableau);
        jScrollPane1.setVisible(true);
        
     // ecoute des boutons
        zone1.addActionListener(this);
        liste.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
            
         String choix = liste.getSelectedItem().toString();
         // switch case
            if(choix == "Nom Service")
                {
                    int i=0;
                    tableau.revalidate();
                    ArrayList<Metier.Infirmier> tab2 = tab.getTabinfirm();
                    while(tab2.get(i).getService() != null)
                    {
                        if(tab2.get(i).getService().getNom() != zone1.getText())
                        {
                            tab2.remove(i);
                        }
                        i++;
                    }
                    jScrollPane1.updateUI();
                    jScrollPane1.setVisible(false);
                    JTable tableau2 = new JTable((TableModel) tab2);
                    JScrollPane jScrollPane2 = new JScrollPane(tableau2);
                    jScrollPane1.setViewportView(tableau2);
                }
            if(choix == "Rotation")
                {
                    int i=0;
                    tableau.revalidate();
                    ArrayList<Metier.Infirmier> tab2 = tab.getTabinfirm();
                    while(tab2.get(i).getService() != null)
                    {
                        if(tab2.get(i).getRotation() != zone1.getText())
                        {
                            tab2.remove(i);
                        }
                        i++;
                    }
                    jScrollPane1.updateUI();
                    jScrollPane1.setVisible(false);
                    JTable tableau2 = new JTable((TableModel) tab2);
                    JScrollPane jScrollPane2 = new JScrollPane(tableau2);
                    jScrollPane1.setViewportView(tableau2);
                }
                if(choix == "Salaire")
                {
                    int i=0;
                    tableau.revalidate();
                    ArrayList<Metier.Infirmier> tab2 = tab.getTabinfirm();
                    while(tab2.get(i).getService() != null)
                    {
                        String numString = zone1.getText();
                        int num = Integer.parseInt(numString);
                        if(tab2.get(i).getSalaire() != num)
                        {
                            tab2.remove(i);
                        }
                        i++;
                    }
                    jScrollPane1.updateUI();
                    jScrollPane1.setVisible(false);
                    JTable tableau2 = new JTable((TableModel) tab2);
                    JScrollPane jScrollPane2 = new JScrollPane(tableau2);
                    jScrollPane1.setViewportView(tableau2);
                }
                if(choix == "Numero")
                {
                    int i=0;
                    tableau.revalidate();
                    ArrayList<Metier.Infirmier> tab2 = tab.getTabinfirm();
                    while(tab2.get(i).getService() != null)
                    {
                        String numString = zone1.getText();
                        int num = Integer.parseInt(numString);
                        if(tab2.get(i).getNumero() != num)
                        {
                            tab2.remove(i);
                        }
                        i++;
                    }
                    jScrollPane1.updateUI();
                    jScrollPane1.setVisible(false);
                    JTable tableau2 = new JTable((TableModel) tab2);
                    JScrollPane jScrollPane2 = new JScrollPane(tableau2);
                    jScrollPane1.setViewportView(tableau2);
                }
                if(choix == "Nom")
                {
                    int i=0;
                    tableau.revalidate();
                    ArrayList<Metier.Infirmier> tab2 = tab.getTabinfirm();
                    while(tab2.get(i).getService() != null)
                    {
                        if(tab2.get(i).getNom() != zone1.getText())
                        {
                            tab2.remove(i);
                        }
                        i++;
                    }
                    jScrollPane1.updateUI();
                    jScrollPane1.setVisible(false);
                    JTable tableau2 = new JTable((TableModel) tab2);
                    JScrollPane jScrollPane2 = new JScrollPane(tableau2);
                    jScrollPane1.setViewportView(tableau2);
                }
                if(choix == "Prenom")
                {
                    int i=0;
                    tableau.revalidate();
                    ArrayList<Metier.Infirmier> tab2 = tab.getTabinfirm();
                    while(tab2.get(i).getService() != null)
                    {
                        if(tab2.get(i).getPrenom() != zone1.getText())
                        {
                            tab2.remove(i);
                        }
                        i++;
                    }
                    jScrollPane1.updateUI();
                    jScrollPane1.setVisible(false);
                    JTable tableau2 = new JTable((TableModel) tab2);
                    JScrollPane jScrollPane2 = new JScrollPane(tableau2);
                    jScrollPane1.setViewportView(tableau2);
                }
                if(choix == "Adresse")
                {
                    int i=0;
                    tableau.revalidate();
                    ArrayList<Metier.Infirmier> tab2 = tab.getTabinfirm();
                    while(tab2.get(i).getService() != null)
                    {
                        if(tab2.get(i).getAdresse() != zone1.getText())
                        {
                            tab2.remove(i);
                        }
                        i++;
                    }
                    jScrollPane1.updateUI();
                    jScrollPane1.setVisible(false);
                    JTable tableau2 = new JTable((TableModel) tab2);
                    JScrollPane jScrollPane2 = new JScrollPane(tableau2);
                    jScrollPane1.setViewportView(tableau2);
                }
                if(choix == "Telephone")
                {
                    int i=0;
                    tableau.revalidate();
                    ArrayList<Metier.Infirmier> tab2 = tab.getTabinfirm();
                    while(tab2.get(i).getService() != null)
                    {
                        String numString = zone1.getText();
                        int num = Integer.parseInt(numString);
                        if(tab2.get(i).getTel() != num)
                        {
                            tab2.remove(i);
                        }
                        i++;
                    }
                    jScrollPane1.updateUI();
                    jScrollPane1.setVisible(false);
                    JTable tableau2 = new JTable((TableModel) tab2);
                    JScrollPane jScrollPane2 = new JScrollPane(tableau2);
                    jScrollPane1.setViewportView(tableau2);
                }
    }
        
        
        
        }
        
        );
       
        bouton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                jScrollPane1.setVisible(true);
         
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

