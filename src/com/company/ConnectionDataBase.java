package com.company;

import java.sql.*;
import javax.swing.JOptionPane;  
public class ConnectionDataBase {
	static Connection con = null;

    public static Connection ConnecrDb(){

        try{
            // db parameters
            String url = "jdbc:sqlite:/Users/neilabdellaoui/Desktop/application1.db";
            // create a connection to the database
            con = DriverManager.getConnection(url);
            return con;
        }
        catch( SQLException e){
            JOptionPane.showMessageDialog(null,"Problem with connection of database");
            return null;
        } 
    }
    public static String authentification(String password, String login) {
    	String a="no";
    	String command = "select * from user where login='"+login+"' and  password='" +password+"'";
        Connection conn = ConnecrDb();
        Statement stmt;
        ResultSet rs;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(command);
            while (rs.next()) {
                a = rs.getString("functionality");}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
               


   
    	
    	return a;
    	}

    
   



}

