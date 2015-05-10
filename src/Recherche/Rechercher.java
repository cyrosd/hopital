/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recherche;

import java.util.ArrayList;
import Connexion.Connexion;
import java.sql.SQLException;

/**
 *
 * @author max
 */
public class Rechercher {
    
    private String Table;
    private String Attribut;
    private String Critere;
    Connexion con;
    private String Requete;
    private ArrayList<String> list = new ArrayList<String>(); 
    
    public Rechercher(String Table, String Attribut, String Critere, Connexion con){
        this.Table=Table;
        this.Attribut=Attribut;
        this.Critere=Critere;
        this.con=con;
        
        this.Requete= Creation_Requete(this.Table,this.Attribut,this.Critere);
        try{
            
        list=this.con.remplirChampsRequete(Requete);
        }
        
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
    
    public String Creation_Requete(String Table, String Attribut, String Critere){
        String rqsql;
        
        rqsql = "SELECT " + Attribut + "FROM " + Table + "WHERE " + Attribut + "= " + Critere;
        
        return rqsql;
    }
    
    
    
}
