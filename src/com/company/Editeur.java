package com.company;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Editeur {
	
	protected int id; 
	protected String nom; 
	 protected String prenom; 


	   public Editeur (int a, String n, String p) 
	  {      this.nom = n; 
	         this.prenom = p; 
	         this.id = a; 

	  }


	public Editeur() {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void  Ajouter(Editeur A) throws SQLException {
		ConnectionDataBase connection = new ConnectionDataBase();
		 Connection con = connection.ConnecrDb();
	    Statement stmt = null;
		
		
		String SQL2 = "INSERT INTO editeur VALUES("+A.id+",'"+A.nom+"','"+A.prenom+"');";

		try {
			stmt = con.createStatement();
			//stmt2 = con.createStatement();

			 stmt.executeUpdate(SQL2);
			 JOptionPane.showMessageDialog(null,"Ajout� avec succ�s ");
			 //stmt2.executeUpdate( SQL2);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		       JOptionPane.showMessageDialog(null,"Num�ro D'editeur existe d�j�   ");

		}
		

		 con.close();
		 stmt.close();

	}
	
	
	public void  Supprimer(int id) throws SQLException {
		ConnectionDataBase connection = new ConnectionDataBase();
		 Connection con = connection.ConnecrDb();
	    Statement stmt;
	    PreparedStatement pstmt = null;
	   ResultSet res = null; 
	   String SQL2 = "DELETE FROM editeur where id = ?;";
	   try{
	  
	    pstmt = con.prepareStatement(SQL2 );
	   
	    
	     
	      
	     
	      pstmt.setInt(1, id);
	      
	      pstmt.executeUpdate();
	      JOptionPane.showMessageDialog(null,"supprim� avec succ�s");}
	   
	   catch(SQLException e){
	    	 
	       JOptionPane.showMessageDialog(null,"Num�ro d'editeur introuvable   ");
           e.printStackTrace();
      }
	       pstmt.close();
	       con.close();
		
		 
		 
		 

	}
	public ResultSet  chercher(String id) throws SQLException {
		
	   String SQL2 = "SELECT * FROM editeur where nom ='"+id+"';";
	   ConnectionDataBase connection = new ConnectionDataBase();
		 Connection con = connection.ConnecrDb();
	    Statement stmt;
	    PreparedStatement p;
	    ResultSet res = null; 
	   
	   
	   try {
			p = con.prepareStatement(SQL2);
			
	        res= p.executeQuery();
	        
	        if (!res.isBeforeFirst() ) {    
	           res=null;
	        } 

		} catch (SQLException e) {
			
		}
	   
	   
		
		return res; 

		
		
		 
		 
		 

	}
	 
	
	
	

}
