/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionEceSQL{

	/**
	 * URL de connection
	 */
	private static String url = "jdbc:mysql://sql-users.ece:3305/user";
	/**
	 * Nom du user
	 */
	private static String user = "godebout";
	/**
	 * Mot de passe du user
	 */
	private static String passwd = "";
	/**
	 * Objet Connection
	 */
	private static Connection connect;
	
	/**
	 * Méthode qui va nous retourner notre instance
	 * et la créer si elle n'existe pas...
	 * @return
	 */
	public static Connection getInstance(){
		if(connect == null){
			try {
				connect = DriverManager.getConnection(url, user, passwd);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
		return connect;	
	}	
}