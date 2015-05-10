/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;



import Metier.Personne;
import java.sql.ResultSet;
import java.sql.SQLException;



public class PersonneDAO extends DAO<Personne> {


    @Override
    public Personne find(long id) {
        	Personne pers;
		try {
            ResultSet result = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE).executeQuery("SELECT * FROM Personne WHERE numero = " + id);
            if(result.first())
            		pers = new Personne(id, result.getString("nom"), result.getString("prenom"), result.getString("adresse"),result.getLong("tel"));
            
		    } catch (SQLException e) {
		            e.printStackTrace();
		    }
		   return pers;
 //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Personne update(Personne obj) {
        try {
			
                this .connect	
                     .createStatement(
                    	ResultSet.TYPE_SCROLL_INSENSITIVE, 
                        ResultSet.CONCUR_UPDATABLE
                     ).executeUpdate(
                    	"UPDATE Personne SET "+ att + " = '" + pers.getNom() + "'"+" WHERE Nchambre = " + ch.getNchambre());
                     
			
			ch = this.Chercher(ch.getNchambre());
	    } catch (SQLException e) {
	            e.printStackTrace();
	    }
	    
	    return ch; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Personne obj) {
        try {
			
                this    .connect
                    	.createStatement(
                             ResultSet.TYPE_SCROLL_INSENSITIVE, 
                             ResultSet.CONCUR_UPDATABLE
                        ).executeUpdate(
                             "DELETE FROM Chambre WHERE Nchambre = " + ch.getNchambre()
                        );
			
	    } catch (SQLException e) {
	            e.printStackTrace();
	    } //To change body of generated methods, choose Tools | Templates.
    }
    
}