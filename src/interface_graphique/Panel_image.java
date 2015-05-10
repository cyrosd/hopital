/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_graphique;


 
import  javax.swing.JPanel ;
import  java.awt.* ;
import java.awt.Image;
import java.awt.Graphics;

public class Panel_image extends JPanel {
    Image imgBack;
    
    public Panel_image (String fileName) {
            imgBack =  getToolkit().getImage(fileName);
        setSize(imgBack.getWidth(this),imgBack.getHeight(this));
        }
    
    public void paintComponent(Graphics g)
{ 
super.paintComponent(g); 
g.drawImage(imgBack, 0, 0, getWidth(), getHeight(), null);
   }
    
}
