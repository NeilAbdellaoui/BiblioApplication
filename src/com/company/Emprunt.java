package com.company;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Emprunt {
	
	protected int Id_emprunt; 
	protected String  date_debut; 
	protected String  date_fin;
	protected NormalUser user;
	protected Suport support;	
	protected String key_words;
	
	 public Emprunt(int i,String dd, String df,NormalUser u, Suport s, String k ) {
		
		this.Id_emprunt=i; 
		this.date_debut=dd; 
		this.date_fin= df;
		this.user= u;
		this.support= s;	
		this.key_words= k;
		
		
		
		
		
		
		
		
		
	}

	public Emprunt() {
		// TODO Auto-generated constructor stub
	}

	public int getId_emprunt() {
		return Id_emprunt;
	}

	public void setId_emprunt(int id_emprunt) {
		Id_emprunt = id_emprunt;
	}

	public String getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(String date_debut) {
		this.date_debut = date_debut;
	}

	public String getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(String date_fin) {
		this.date_fin = date_fin;
	}

	public NormalUser getUser() {
		return user;
	}

	public void setUser(NormalUser user) {
		this.user = user;
	}

	public Suport getSupport() {
		return support;
	}

	public void setSupport(Suport support) {
		this.support = support;
	}

	public String getKey_words() {
		return key_words;
	}

	public void setKey_words(String key_words) {
		this.key_words = key_words;
	}

	public ResultSet  chercherInterdiction() throws SQLException {
	 
	   //String SQL2 = "SELECT id, emprunt.user, user.prenom, user.nom FROM emprunt join user on emprunt.user= user.id  where date_fin < DATE('now') ; ";

	
		ConnectionDataBase connection = new ConnectionDataBase();
		 Connection con = connection.ConnecrDb();
	    Statement stmt;
	    PreparedStatement p;
	    ResultSet res = null; 
	   String SQL2 = "SELECT emprunt.id as  Emprnt_Numero ,  date_debut  as Date_Debut , date_fin as Date_Fin , user.id as  Numero , user.nom, user.prenom FROM emprunt join user on emprunt.user = user.id where date_fin < DATE('now') and etat = 0 ;";

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
	
	
	
	public void addEmprunt( Emprunt E) throws SQLException {
		
		
		
		
		ConnectionDataBase connection = new ConnectionDataBase();
		 Connection con = connection.ConnecrDb();
	    Statement stmt = null;
		String SQL = "INSERT INTO emprunt (date_debut, date_fin,user, support )VALUES ('"+E.date_debut+"','"+E.date_fin+"',"+E.user.id+","+E.support.Id_support+");";

		try {
			stmt = con.createStatement();
			//stmt2 = con.createStatement();

			 stmt.executeUpdate(SQL);
			 //stmt2.executeUpdate( SQL2);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	    stmt.close();
	    con.close();
		
		
		
		
		
		
	

			

			

		}
	

	 
public void addReturn( int id) throws SQLException {
		
		
		
		
		ConnectionDataBase connection = new ConnectionDataBase();
		 Connection con = connection.ConnecrDb();
	    Statement stmt = null;
		String SQL = "UPDATE emprunt SET  etat = 1 WHERE id = "+id+" ;";

		try {
			stmt = con.createStatement();
			//stmt2 = con.createStatement();

			 stmt.executeUpdate(SQL);
			 //stmt2.executeUpdate( SQL2);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	    stmt.close();
	    con.close();
		
		
		
		
		
		
	

			

			

		}
	

	

}
