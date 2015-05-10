/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maj;
import Connexion.Connexion;


/**
 *
 * @author max
 */
public class Creer { 
  
    private String Table;
    private String Requete;
    Connexion con;
    private String att1;
    private String att2;
    private String att3;
    private String att4;
    private String att5;
    private String att6;
    private String att7;


    public Creer(String Table, String Requete, Connexion conn, String att1, String att2, String att3, String att4, String att5, String att6, String att7){
        this.Table=Table;
    
        this.Requete=Creation_Requete(this.Table, this.att1, this.att2, this.att3, this.att4, this.att5, this.att6, this.att7);
        try{
            this.con.executeUpdate(this.Requete);
        } catch(Exception e){
            System.out.println(e.toString());
        }
        
        this.att1=att1;
        this.att2=att2;
        this.att3=att3;
        this.att4=att4;
        this.att5=att5;
        this.att6=att6;
        this.con=con;
      
       
  


public String Creation_Requete(String Table, String att1, String att2, String att3, String att4, String att5, String att6, String att7){
      
     
    String rqsql;
    
    switch(Table){
            case "service":
                rqsql=" INSERT INTO " + Table + "(code, nom, batiment, directeur) VALUES ('" + att1 + "', '" + att2 + "', '" + att3 + "','" + att4 + "')";
                break;
            case "salle":
                rqsql=" INSERT INTO" + Table + "(numero, batiment) VALUES ('" + att1 + "', '" + att2 + "')";
                break;
            case "chambre":
                rqsql=" INSERT INTO " + Table + "(code_service, no_chambre, surveillant, nb_lits) VALUES ('" + att1 + "', '" + att2 + "', '" + att3 + "','" + att4 + "')";
                break;
            case "personne":
                rqsql=" INSERT INTO " + Table + "(nom, prenom, tel, adresse) VALUES ('" + att1 + "', '" + att2 + "', '" + att3 + "', '"+ att4 +"')";
                break;
            case "employe":
                rqsql=" INSERT INTO " + Table + "(nom, prenom, tel, adresse) VALUES ('" + att1 + "', '" + att2 + "', '" + att3 + "', '" + att4 + "')";
                break;
            case "docteur":
                rqsql=" INSERT INTO " + Table + "(nom, prenom, tel, adresse, specialite) VALUES ('" + att1 + "', '" + att2 + "', '" + att3 + "', '" + att4 + "', '" + att5 + "')";
                break;
            case "infirmier":
                rqsql=" INSERT INTO " + Table + "(nom, prenom, tel, adresse, code_service, rotation, salaire) VALUES ('" + att1 + "', '" + att2 + "', '" + att3 + "', '" + att4 + "', '" + att5 + "', '" + att6 + "', '" + att7 + "')";
                break;
            case "malade":
                rqsql=" INSERT INTO " + Table + "(nom, prenom, tel, adresse, mutuelle) VALUES ('" + att1 + "', '" + att2 + "', '" + att3 + "', '" + att4 + "', '" + att5 + "')";
                break;
                
             
            default:
                rqsql=null;
                break;
        }
    
    
    return rqsql; 
    
}
}