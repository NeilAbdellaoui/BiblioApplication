package com.company;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.Spring;

public class Edition {
	protected int id; 
	protected Editeur editeur; 
	protected String date;
	protected Oeuvre oeuvre;
	 public Edition(int i, Editeur e,  String d, Oeuvre o) {
		this.id= i;
		this.editeur= e;
		this.date= d;
		this.oeuvre= o;
	}
	public Edition() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Editeur getEditeur() {
		return editeur;
	}
	public void setEditeur(Editeur editeur) {
		this.editeur = editeur;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Oeuvre getOeuvre() {
		return oeuvre;
	}
	public void setOeuvre(Oeuvre oeuvre) {
		this.oeuvre = oeuvre;
	}
	
	public void  Ajouter(Edition A) throws SQLException {
		ConnectionDataBase connection = new ConnectionDataBase();
		 Connection con = connection.ConnecrDb();
	    Statement stmt = null;
		
		
		String SQL2 = "INSERT INTO edition VALUES("+Integer.toString(A.getId())+","+Integer.toString(A.getOeuvre().getId())+","+Integer.toString(A.getEditeur().getId())+",'"+A.getDate()+"');";

		try {
			stmt = con.createStatement();
			//stmt2 = con.createStatement();

			 stmt.executeUpdate(SQL2);
			 JOptionPane.showMessageDialog(null,"Ajout� avec succ�s ");
			 //stmt2.executeUpdate( SQL2);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		       JOptionPane.showMessageDialog(null,"Num�ro D'edition existe d�j�   ");

		}
		

		 con.close();
		 stmt.close();

	}
	
	
	public void  Supprimer(String id) throws SQLException {
		ConnectionDataBase connection = new ConnectionDataBase();
		 Connection con = connection.ConnecrDb();
	    Statement stmt;
	    PreparedStatement pstmt = null;
	   ResultSet res = null; 
	   String SQL2 = "DELETE FROM edition where id = "+id+";";
	   try{
	  
	    pstmt = con.prepareStatement(SQL2 );
	   
	    
	     
	      
	     
	      
	      pstmt.executeUpdate();
	      JOptionPane.showMessageDialog(null,"supprim� avec succ�s");}
	   
	   catch(SQLException e){
	    	 
	       JOptionPane.showMessageDialog(null,"Num�ro d'edition introuvable   ");
           e.printStackTrace();
      }
	       pstmt.close();
	       con.close();
		
		 
		 
		 

	}
	public ResultSet  chercher(String id) throws SQLException {
		
	   String SQL2 = "SELECT * FROM edition where id ="+id+";";
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
