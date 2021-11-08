package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class NormalUser extends User {
	private Categorie Categorie;
	public NormalUser( int i, String n, String p, String  a, String f, String e,String pass, String l, int ph, Categorie c)
	{  super(i,  n,  p,  a,  f,  e, pass,  l, ph); 
	
	 this.Categorie= c;	}
	public NormalUser() {
		// TODO Auto-generated constructor stub
	}
	public Categorie getCategorie() {
		return Categorie;
	}
	public void setCategorie(Categorie categorie) {
		Categorie = categorie;
	}
	
	
	
	public static  int  numberOfSuports(int id ) throws SQLException {
		
		int  n = 0 ; 
		ConnectionDataBase connection = new ConnectionDataBase();
		 Connection con = connection.ConnecrDb();
	  
	    PreparedStatement p = null;
	    ResultSet res = null;
	   String SQL2 = "SELECT COUNT(emprunt.id) from   emprunt where emprunt.etat = 0 and  emprunt.user = "+id+"; ";

		try {
			p = con.prepareStatement(SQL2);
			
	        res= p.executeQuery();
	

		} catch (SQLException e) {
			
		}
		try {
			n= Integer.parseInt(res.getObject(1).toString());
		} catch (NumberFormatException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

         p.close();
         res.close();
         con.close();
		return n;
		
		
		
	}
public static int  numberOfSuportsLeft(int id ) throws SQLException {
		
		int  n =   numberOfSuports(id ); 
		int k = 0;
		ConnectionDataBase connection = new ConnectionDataBase();
		 Connection con = connection.ConnecrDb();
	    Statement stmt;
	    PreparedStatement p = null;
	    ResultSet res = null;
	   String SQL2 = "SELECT categorie.Max_emprunt  from  categorie join normalUser on  normalUser.idCategorie = categorie.idCategorie   where normalUser.IdNormalUser =  "+id+"; ";

		try {
			p = con.prepareStatement(SQL2);
			
	        res= p.executeQuery();
	

		} catch (SQLException e) {
			
		}
		try {
			k= Integer.parseInt(res.getObject(1).toString());
		} catch (NumberFormatException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

      int s= k-n;
      p.close();
      res.close();
      con.close();
		return s;
		
		 
		
	}


public static int  isInInterdiction(int id ) throws SQLException {
	
	int  n =   numberOfSuports(id ); 
	int k = 0;
	ConnectionDataBase connection = new ConnectionDataBase();
	 Connection con = connection.ConnecrDb();
    Statement stmt;
    PreparedStatement p = null;
    ResultSet res = null;
   String SQL2 = "SELECT categorie.Max_emprunt  from  categorie join normalUser on  normalUser.idCategorie = categorie.idCategorie   where normalUser.IdNormalUser =  "+id+"; ";

	try {
		p = con.prepareStatement(SQL2);
		
        res= p.executeQuery();


	} catch (SQLException e) {
		
	}
	try {
		k= Integer.parseInt(res.getObject(1).toString());
	} catch (NumberFormatException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

  int s= k-n;
  p.close();
  res.close();
  con.close();
	return s;
	
	 
	
}
public int   SelectNumperOfAllowedSuports(int id) throws SQLException {
	ConnectionDataBase connection = new ConnectionDataBase();
	 Connection con = connection.ConnecrDb();
    int number =0; 
    PreparedStatement p = null;
    ResultSet res = null; 
   String SQL2 = "SELECT categorie.Max_duree FROM normalUser join categorie on normalUser.idCategorie = categorie.idCategorie  where normalUser.id = "+id+"; ";

	try {
		p = con.prepareStatement(SQL2);
		
        res= p.executeQuery();
       
        if (!res.isBeforeFirst() ) { 
        	
           res=null;
           number= 0;
           
        }else {
        	 number= res.getInt("Max_duree");
        }

	} catch (SQLException e) {
		
	}
   
	  p.close();
	  con.close();
	
	return number; 


	

}
	
// 1;

	
public static int   IsInterdicted(int id) throws SQLException {
	ConnectionDataBase connection = new ConnectionDataBase();
	 Connection con = connection.ConnecrDb();
    int number =0; 
    PreparedStatement p = null;
    ResultSet res = null; 
   String SQL2 = "SELECT * FROM emprunt join user on emprunt.user = user.id where date_fin < DATE('now') and etat = 0 and  emprunt.user="+id+"; ";

	try {
		p = con.prepareStatement(SQL2);
		
        res= p.executeQuery();
       
        if (!res.isBeforeFirst() ) { 
        	
           res=null;
           number= 0;
           
        }else {
        	 number=1;
        }

	} catch (SQLException e) {
		
	}
   
	  p.close();
	  con.close();
	
	return number; 


	

}
	
	

}


