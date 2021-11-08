package com.company;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Auteur {
	protected int id; 
	protected String nom; 
	 protected String prenom; 
	 protected String dateNaissance;


	   public Auteur(int a, String n, String p, String h) 
	  {      this.nom = n; 
	         this.prenom = p; 
	         this.dateNaissance= h; 
	         this.id = a; 

	  }


	public Auteur() {
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


	public String getDateNaissance() {
		return dateNaissance;
	}


	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	} 
	
	public void  Ajouter(Auteur A) throws SQLException {
		ConnectionDataBase connection = new ConnectionDataBase();
		 Connection con = connection.ConnecrDb();
	    Statement stmt = null;
		
		
		String SQL2 = "INSERT INTO Auteur VALUES("+A.id+",'"+A.nom+"','"+A.prenom+"','"+A.dateNaissance+"');";

		try {
			stmt = con.createStatement();
			//stmt2 = con.createStatement();

			 stmt.executeUpdate(SQL2);
			 JOptionPane.showMessageDialog(null,"Ajout� avec succ�s ");
			 //stmt2.executeUpdate( SQL2);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		       JOptionPane.showMessageDialog(null,"Num�ro D'auteur  existe d�j�   ");

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
	   String SQL2 = "DELETE FROM Auteur where id = ?;";
	   try{
	  
	    pstmt = con.prepareStatement(SQL2 );
	   
	    
	     
	      
	     
	      pstmt.setInt(1, id);
	      
	      pstmt.executeUpdate();
	      JOptionPane.showMessageDialog(null,"supprim� avec succ�s");}
	   
	   catch(SQLException e){
	    	 
	       JOptionPane.showMessageDialog(null,"Num�ro d'auteur introuvable   ");
           e.printStackTrace();
      }
	       pstmt.close();
	       con.close();
		
		 
		 
		 

	}
	public ResultSet  chercher(String id) throws SQLException {
		
	   String SQL2 = "SELECT * FROM Auteur where id="+id+";";
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
