package com.company;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Suport  extends  Oeuvre {


	protected int Id_support; 
	protected int number;
	protected Edition edition; 
	protected String key_words; 
	 public Suport(int i, Auteur A, String t, Edition e , int n, int id, String k ) {
		super(i, A, t);
		this.edition= e;
		this.number=n;
		this.Id_support= id; 
		this.key_words= k; 
		
		// TODO Auto-generated constructor stub
	}
	public Suport() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public int getId_support() {
		return Id_support;
	}
	public void setId_support(int id_support) {
		Id_support = id_support;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Edition getEdition() {
		return edition;
	}
	public void setEdition(Edition edition) {
		this.edition = edition;
	}
	public String getKey_words() {
		return key_words;
	}
	public void setKey_words(String key_words) {
		this.key_words = key_words;
	}
	public ResultSet getSupportbytitre (String s, String choix) {
		ResultSet res = null;
		  //String SQL2 = " SELECT id, oeuvre.titre, Auteur.nom, Auteur.prenom,  support.number,  date FROM edition join oeuvre, Auteur, support  on edition.idOeuvre = oeuvre.id  where  oeuvre.titre= 'dddddd' and Auteur.id= oeuvre.idAuteur and support.idEdition = edition.idEditeur ;";

		if (choix.equals("titre")) {
		ConnectionDataBase connection = new ConnectionDataBase();
		Connection con = connection.ConnecrDb();
		   Statement stmt;
		   PreparedStatement p;
		 
		 String SQL2 = " SELECT support.id, oeuvre.titre, Auteur.nom,    edition.date FROM edition join oeuvre, Auteur, support  on oeuvre.id = edition.idOeuvre and  support.idEdition = edition.id where oeuvre.titre ='"+s+"'";


		try {
		p = con.prepareStatement(SQL2);
		       res= p.executeQuery();
		       if (!res.isBeforeFirst() ) {    
		       
		       
		       
		          res=null;
		       }

		} catch (SQLException e) {
		return res;
		}}
		if (choix.equals("Domaine")) {
		ConnectionDataBase connection = new ConnectionDataBase();
		Connection con = connection.ConnecrDb();
		   Statement stmt;
		   PreparedStatement p;
		 String SQL2 = " SELECT support.id, oeuvre.titre, Auteur.nom,  edition.date FROM edition join oeuvre, Auteur, support  on oeuvre.id = edition.idOeuvre and  support.idEdition = edition.id and oeuvre.idAuteur = auteur.id   where support.keyWords='"+s+"';";


		try {
		p = con.prepareStatement(SQL2);
		       res= p.executeQuery();
		       if (!res.isBeforeFirst() ) {    
		          res=null;
		       }

		} catch (SQLException e) {
		return res;
		}}
		if (choix.equals("auteur")) {
		ConnectionDataBase connection = new ConnectionDataBase();
		Connection con = connection.ConnecrDb();
		   Statement stmt;
		   PreparedStatement p;
		 String SQL2 = " SELECT support.id as Numero , oeuvre.titre as titre, Auteur.nom as Nom_Auteur,     edition.date as Date_Edition  FROM edition join oeuvre, Auteur, support  on oeuvre.id = edition.idOeuvre and  support.idEdition = edition.id and oeuvre.idAuteur = auteur.id   where Auteur.nom='"+s+"';";


		try {
		p = con.prepareStatement(SQL2);
		       res= p.executeQuery();
		       if (!res.isBeforeFirst() ) {    
		          res=null;
		       }

		} catch (SQLException e) {
		return res;
		}}
		return res;
		 


		}

	
	public ResultSet  chercher(String id) throws SQLException {
		
		   String SQL2 = "SELECT id, idEdition, keyWords FROM support  where id ="+id+";";
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
	public void  Ajouter(Suport S) throws SQLException {
		ConnectionDataBase connection = new ConnectionDataBase();
		 Connection con = connection.ConnecrDb();
	    Statement stmt;
	   ResultSet res = null; 
	   String SQL2 = "INSERT INTO support VALUES ("+Integer.toString(S.getId())+", "+Integer.toString(S.getNumber())+","+Integer.toString(S.getEdition().getId())+",'"+S.getKey_words()+"');";
	  
	   PreparedStatement pstmt = con.prepareStatement(SQL2);

	   try{
		   int a = pstmt.executeUpdate();
	       JOptionPane.showMessageDialog(null,"Ajout� avec succ�s ");
	  
	      }catch(SQLException e){
	    	 
		       JOptionPane.showMessageDialog(null,"Num�ro D'Edition introuvable ou le num�ro de support  existe d�j�   ");
	           e.printStackTrace();
	      }
	     
	      
	      
	       
	       

	       pstmt.close();
	       con.close();
		
		 
		 
		 

	}

		 
	

	
}
