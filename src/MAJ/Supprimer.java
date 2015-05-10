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
public class Supprimer {
    
    String Requete;
    Connexion con;
    String num;
    String Table;
    
    public Supprimer(String Table, String num, Connexion con){
        
        this.Table=Table;
        this.num=num;
        this.con=con;
        
        this.Requete=Creation_Requete(this.Table, this.num);
        try{
            this.con.executeUpdate(this.Requete);
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
    
    public String Creation_Requete(String Table, String num){
        
        String rqsql;
        
        rqsql="DELETE FROM "+ Table + "WHERE no_"+Table+" = "+num;
        
        return rqsql;
    }
    
}
