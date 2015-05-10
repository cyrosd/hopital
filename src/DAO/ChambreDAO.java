/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import Metier.Chambre;
import java.sql.ResultSet;
import java.sql.SQLException;



public class ChambreDAO extends DAO<Chambre> {
    
    @Override
    public Chambre find(long id) {
      
            Chambre ch;
		try {
            ResultSet result = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE).executeQuery("SELECT * FROM Chambre WHERE numero = " + id);
            if(result.first())
            		ch = new Chambre(id, result.getLong("service"), result.getLong("nbLit"), result.getString("surveillant"));
            
		    } catch (SQLException e) {
		            e.printStackTrace();
		    }
		   return ch;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Chambre update(Chambre obj) {
        
        try {
			
                this .connect	
                     .createStatement(
                    	ResultSet.TYPE_SCROLL_INSENSITIVE, 
                        ResultSet.CONCUR_UPDATABLE
                     ).executeUpdate(
                    	"UPDATE Chambre SET "+ att + " = '" + ch.getNchambre() + "'"+" WHERE Nchambre = " + ch.getNchambre());
                     
			
			ch = this.Chercher(ch.getNchambre());
	    } catch (SQLException e) {
	            e.printStackTrace();
	    }
	    
	    return ch;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Chambre obj) {
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
	    }//To change body of generated methods, choose Tools | Templates.
    }
    
}