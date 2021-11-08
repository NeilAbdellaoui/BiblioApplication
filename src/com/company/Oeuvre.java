package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Oeuvre {
	protected int id; 

	protected Auteur auteur; 
	protected String titre; 
   


	   public Oeuvre(int i, Auteur A, String t ) 
	  {      
		  
		 this.id=i;
		 this.auteur= A;
		 this.titre= t;
	  }



	public Oeuvre() {
		// TODO Auto-generated constructor stub
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Auteur getAuteur() {
		return auteur;
	}



	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}



	public String getTitre() {
		return titre;
	}



	public void setTitre(String titre) {
		this.titre = titre;
	} 
	
	public void  Ajouter(Oeuvre o) throws SQLException {
		ConnectionDataBase connection = new ConnectionDataBase();
		 Connection con = connection.ConnecrDb();
	    Statement stmt;
	   ResultSet res = null; 
	   String SQL2 = "INSERT INTO oeuvre (titre, id, idAuteur) VALUES ('"+o.getTitre()+"', "+Integer.toString(o.getId())+","+Integer.toString(o.getAuteur().getId())+");";
	  
	   PreparedStatement pstmt = con.prepareStatement(SQL2);

	   try{
		   int a = pstmt.executeUpdate();
	       JOptionPane.showMessageDialog(null,"Ajout� avec succ�s ");
	  
	      }catch(SQLException e){
	    	 
		       JOptionPane.showMessageDialog(null,"Num�ro D'auteur introuvable ou le num�ro d'oeuvre existe d�j�   ");
	           e.printStackTrace();
	      }
	     
	      
	      
	       
	       

	       pstmt.close();
	       con.close();
		
		 
		 
		 

	}

	public void  Supprimer(int id) throws SQLException {
		ConnectionDataBase connection = new ConnectionDataBase();
		 Connection con = connection.ConnecrDb();
	    Statement stmt;
	    PreparedStatement pstmt = null;
	   ResultSet res = null; 
	   String SQL2 = "DELETE FROM oeuvre where id = ?;";
	   try{
	  
	    pstmt = con.prepareStatement(SQL2 );
	   
	    
	     
	      
	     
	      pstmt.setInt(1, id);
	      
	      pstmt.executeUpdate();
	      JOptionPane.showMessageDialog(null,"supprim� avec succ�s");}
	   
	   catch(SQLException e){
	    	 
	       JOptionPane.showMessageDialog(null,"Num�ro d'oeuvre introuvable   ");
           e.printStackTrace();
      }
	       pstmt.close();
	       con.close();
		
		 
		 
		 

	}
	public ResultSet  chercher(String id) throws SQLException {
		
		   String SQL2 = "SELECT * FROM oeuvre where id ="+id+";";
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
