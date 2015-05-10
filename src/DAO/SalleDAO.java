/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Metier.Salle;
import java.sql.ResultSet;
import java.sql.SQLException;



public class SalleDAO extends DAO<Salle> {
    
    public Chambre Chercher(long id) {
		

	}
    
    public Chambre Modifier(Salle sa, String att) {
		
	}
    
    public void Supprimer(Salle sa) {
		
	}

    @Override
    public Salle find(long id) {
        Salle sa;
		try {
            ResultSet result = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE).executeQuery("SELECT * FROM Salle WHERE numero = " + id);
            if(result.first())
            		sa = new Salle(id, result.getString("batiment"));
            
		    } catch (SQLException e) {
		            e.printStackTrace();
		    }
		   return sa; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Salle update(Salle obj) {
        try {
			
                this .connect	
                     .createStatement(
                    	ResultSet.TYPE_SCROLL_INSENSITIVE, 
                        ResultSet.CONCUR_UPDATABLE
                     ).executeUpdate(
                    	"UPDATE Salle SET "+ att + " = '" + sa.getNumero() + "'"+" WHERE numero = " + sa.getNumero());
                     
			
			sa = this.Chercher(sa.getNumero());
	    } catch (SQLException e) {
	            e.printStackTrace();
	    }
	    
	    return sa; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Salle obj) {
        try {
			
                this    .connect
                    	.createStatement(
                             ResultSet.TYPE_SCROLL_INSENSITIVE, 
                             ResultSet.CONCUR_UPDATABLE
                        ).executeUpdate(
                             "DELETE FROM Salle WHERE Numero = " + sa.getNumero()
                        );
			
	    } catch (SQLException e) {
	            e.printStackTrace();
	    } //To change body of generated methods, choose Tools | Templates.
    }
    
}
